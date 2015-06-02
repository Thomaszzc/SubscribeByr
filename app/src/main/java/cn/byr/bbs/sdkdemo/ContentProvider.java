package cn.byr.bbs.sdkdemo;

import android.app.ListFragment;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.view.View;
import android.widget.AdapterView;
import android.widget.SimpleAdapter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import cn.byr.bbs.sdk.api.ArticleApi;
import cn.byr.bbs.sdk.api.SearchApi;
import cn.byr.bbs.sdk.api.SectionApi;
import cn.byr.bbs.sdk.api.UserApi;
import cn.byr.bbs.sdk.api.WidgetApi;
import cn.byr.bbs.sdk.auth.Oauth2AccessToken;
import cn.byr.bbs.sdk.exception.BBSException;
import cn.byr.bbs.sdk.net.RequestListener;
import cn.byr.bbs.sdkdemo.Oauth.AccessTokenKeeper;
import cn.byr.bbs.sdkdemo.bean.Article;
import cn.byr.bbs.sdkdemo.bean.RootSection;
import cn.byr.bbs.sdkdemo.bean.Section;
import cn.byr.bbs.sdkdemo.bean.SubSection;
import cn.byr.bbs.sdkdemo.bean.Threads;
import cn.byr.bbs.sdkdemo.bean.TopTen;
import cn.byr.bbs.sdkdemo.bean.User;

/**
 * Created by Thomas on 15/5/6.
 */
public class ContentProvider {
    private Oauth2AccessToken mAccessToken;
    private static ContentProvider cp;
    private User user;




    public ContentProvider(Context context){
        mAccessToken= AccessTokenKeeper.readAccessToken(context);
    }

    public static ContentProvider getInStance(Context context){
        if(cp==null)
            cp=new ContentProvider(context);
        return cp;
    }

    public void getUserInfo() throws Exception{
        UserApi mUserApi=new UserApi(mAccessToken);
        String res=null;
        mUserApi.show(new RequestListener() {
            @Override
            public void onComplete(String s) {
                Gson json=new Gson();
                user=json.fromJson(s,User.class);
                setDrawerLayoutUserInfo(user);
            }

            @Override
            public void onException(BBSException e) {

            }
        });

     //   return user;
    }

    public void setDrawerLayoutUserInfo(User user){
        //显示
        try {
            NavigationDrawerFragment.iv_user_face.setImageURI(Uri.parse(user.getFace_url()));
            NavigationDrawerFragment.iv_user_face.setMinimumWidth(user.getFace_width());
            NavigationDrawerFragment.iv_user_face.setMinimumHeight(user.getFace_height());
            NavigationDrawerFragment.tv_user_id.setText(user.getId());
        }catch (Exception e){
            e.printStackTrace();
        }
            NavigationDrawerFragment.tv_user_name.setText(user.getUser_name());
    }

    public void getTopTenInfo(){
        WidgetApi mWidgetApi=new WidgetApi(mAccessToken);
        System.out.print("getTopteninfo:"+mAccessToken);

        if (mAccessToken != null && mAccessToken.isSessionValid()) {
            mWidgetApi.topten(new RequestListener() {
                @Override
                public void onComplete(String s) {
                    Gson json=new Gson();
               //     System.out.println(s);
                    TopTen topTen=json.fromJson(s,TopTen.class);
                    Article[] articles=topTen.getArticle();
                    setTopTenInfo(articles);

                }

                @Override
                public void onException(BBSException e) {
                    System.out.print("异常："+e);
                }
            });
        }else{
            System.out.print("mAccessToken is:"+mAccessToken);
        }
    }
    public void setTopTenInfo(Article[] articles){
        final TopTenFragment topTenFragment=TopTenFragment.newInstance(1);

        List<HashMap<String,Object>> listItem=new ArrayList();
        int i=1;
        for(Article article:articles){
            if(article.isHas_attachment()){
               HashMap<String,Object> map=new HashMap<>();
                map.put("topten_num",i+":");
                map.put("topten_title",article.getTitle());
                map.put("topten_attachment",R.drawable.att_logo);
                listItem.add(map);
            }else{
                HashMap<String,Object> map=new HashMap<>();
                map.put("topten_num",i+":");
                map.put("topten_title",article.getTitle());
                map.put("topten_attachment",null);
                listItem.add(map);
            }
            i++;
        }
        topTenFragment.adapter=new SimpleAdapter(topTenFragment.getActivity(),listItem,R.layout.topten_list_item,
                new String[]{"topten_num","topten_title","topten_attachment"},
                new int[]{R.id.topten_num,R.id.topten_title,R.id.topten_attachment}
        );



       // topTenFragment.listView_topTen.setAdapter(adapter);

        topTenFragment.setListAdapter(topTenFragment.adapter);

        topTenFragment.setArticle(articles);


        SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
        Date date=new Date(System.currentTimeMillis());
        topTenFragment.tv_lastUpdateTime.setText("上次更新时间："+sdf.format(date));
    }

    public void getArticleInfo(String board,int id,int page){
        ArticleApi articleApi=new ArticleApi(mAccessToken);

        /*articleApi.showArticle(board,id,new RequestListener() {
            @Override
            public void onComplete(String s) {
              //  System.out.print("文章信息:"+s);
                Gson json=new Gson();
                Article article=json.fromJson(s,Article.class);
                setArticleInfo(article.getContent());
            }

            @Override
            public void onException(BBSException e) {

            }
        });*/

        articleApi.showThread(board,id,page,new RequestListener() {
            @Override
            public void onComplete(String s) {
                System.out.println("thread_info:"+s);
                String[] str=s.split("\\}");
                for(String str_item:str)
                    System.out.println(str_item);


                Gson json=new Gson();
                Threads threads=json.fromJson(s,Threads.class);
              //  Threads[] threads=json.fromJson(s,new TypeToken<Threads[]>(){}.getType());



                ArticleFragment.setViewContent(threads);
               /* Article[] articles=threads.getArticle();
                System.out.println("article的size："+articles.length);

                for(Article article:articles)
                    System.out.println(article.getPosition()+":"+article.getContent());
                */
            }

            @Override
            public void onException(BBSException e) {
                System.out.print("thread_info_exception:"+e);
            }
        });

        System.out.print("board_info:"+board);
    }

    public void getRootSection(){
        final SectionApi sectionApi=new SectionApi(mAccessToken);
        sectionApi.getRootSection(new RequestListener() {
            @Override
            public void onComplete(String s) {
                Gson json=new Gson();
                RootSection rootSection=json.fromJson(s,RootSection.class);
                RootSectionFragment.setRootSectionView(rootSection.getSection());
            }

            @Override
            public void onException(BBSException e) {

            }
        });

    }

    public void getSubSection(String name){
        SectionApi sectionApi=new SectionApi(mAccessToken);
        sectionApi.getSection(name,new RequestListener() {
            @Override
            public void onComplete(String s) {
                Gson json=new Gson();
                SubSection subSection=json.fromJson(s,SubSection.class);
                SubSectionFragment.setSubSection(subSection.getBoard());
            }

            @Override
            public void onException(BBSException e) {

            }
        });
    }

}
