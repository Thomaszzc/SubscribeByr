package cn.byr.bbs.sdkdemo;


import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.SimpleDraweeView;
import com.handmark.pulltorefresh.library.ILoadingLayout;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshListView;

import org.w3c.dom.Text;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.byr.bbs.sdkdemo.adapter.ArticleAdapter;
import cn.byr.bbs.sdkdemo.bean.Article;
import cn.byr.bbs.sdkdemo.bean.Pagination;
import cn.byr.bbs.sdkdemo.bean.Threads;
import cn.byr.bbs.sdkdemo.bean.User;

/**每个帖子的界面
 * Created by Thomas on 15/5/9.
 */
public class ArticleFragment extends Fragment {


    private static final String ARG_SECTION_NUMBER="section_number";
    private static final String ARTICLE_NAME="article_info";

    private static final String DEFAULT_FACE_M_URL="http://static.byr.cn/img/face_default_m.jpg";


    private static ILoadingLayout startLabels;
    private static ILoadingLayout endLabels;



    //每一个帖子的内容
    private static SimpleDraweeView userFaceArticle;//发帖人头像
    private static TextView tv_article_id;//发帖人名称
    private static TextView tv_article_time;//帖子时间
    private static TextView tv_article_content;//帖子内容


    private static PullToRefreshListView lv_article;//所有帖子所在的listview
    private static TextView lv_article_title;//帖子的标题
    private static Article article;

    private ContentProvider cp;


    private static int page;

    private static ArticleFragment articleFragment;
    public ArticleFragment(){}
    public static ArticleFragment newInstance(int selectionNumber,Article article_item){
        System.out.println("article:"+selectionNumber);
            articleFragment=new ArticleFragment();
            Bundle args=new Bundle();
            args.putInt(ARG_SECTION_NUMBER,selectionNumber);
        //    args.putSerializable(ARTICLE_NAME, article);
        article=article_item;
        articleFragment.setArguments(args);
        page=1;



        return articleFragment;
    }//由于有多种情况可以初始化，所以不能是用单例
     @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         Fresco.initialize(this.getActivity());



         View view=inflater.inflate(R.layout.list_article,container,false);
 /*        tv_article_id=(TextView)view.findViewById(R.id.tv_article_id);
         tv_article_time=(TextView)view.findViewById(R.id.tv_article_time);
         userFaceArticle=(SimpleDraweeView)view.findViewById(R.id.article_user_face);
         tv_article_content=(TextView)view.findViewById(R.id.article_content);
*/
         lv_article=(PullToRefreshListView)view.findViewById(R.id.lv_article);
         startLabels=lv_article.getLoadingLayoutProxy(true, false);
         endLabels = lv_article.getLoadingLayoutProxy(false, true);



         lv_article.setMode(PullToRefreshBase.Mode.BOTH);

         lv_article.setOnRefreshListener(new PullToRefreshBase.OnRefreshListener<ListView>() {
             @Override
             public void onRefresh(PullToRefreshBase<ListView> refreshView) {
                //refreshView.on

                 if(refreshView.isFooterShown()) {
                     page=page+1;
                     System.out.println("上拉：" + page);
                 }else{
                     if(page!=1)
                        page=page-1;
                     System.out.print("下拉：" + page);
                 }
                 initData();
             }

         });




         lv_article_title=(TextView)view.findViewById(R.id.list_article_title);





      //  Bundle info=articleFragment.getArguments();
        // System.out.print(info.);
       // Article article=(Article)info.get(ARTICLE_NAME);
        User user=article.getUser();

    /*    String name=user.getId()+"("+user.getUser_name()+")";
        name=name.length()>15?name.substring(0,15)+"...":name;

    //    tv_article_id.setText(name);
       userFaceArticle.setImageURI(Uri.parse(user.getFace_url()==null?DEFAULT_FACE_M_URL:user.getFace_url()));
        userFaceArticle.setMinimumWidth(user.getFace_width()==0?120:user.getFace_width());
        userFaceArticle.setMinimumHeight(user.getFace_height()==0?120:user.getFace_height());
         SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss yyyy-MM-dd");
         Date date=new Date(article.getPost_time()*1000L);

         tv_article_time.setText(sdf.format(date)+"\n\t\t\t\t\t\t\t\t楼主");

        System.out.print("article_content:"+article.getContent());
        //tv_article_content.setText(article.getContent());
*/

          cp=ContentProvider.getInStance(getActivity());

          initData();

        return view;
    }

    public void initData(){
        //page++;
        cp.getArticleInfo(article.getBoard_name(),article.getId(),page);

        System.out.println("page:------------->"+page);
    }



    public static void setViewContent(Threads threads){
        Article[] articles=threads.getArticle();
        lv_article_title.setText("标题："+articles[0].getTitle());




 /*       LayoutInflater inflater=LayoutInflater.from(articleFragment.getActivity());
        View view=inflater.inflate(R.layout.article,null);
        List<Map<String,Object>> listItem=new ArrayList<>();
        userFaceArticle=(SimpleDraweeView)view.findViewById(R.id.article_user_face);

        for(Article article:articles){
            User user=article.getUser();

            String name=user.getId()+"("+user.getUser_name()+")";
            name=name.length()>15?name.substring(0,15)+"...":name;
            userFaceArticle.setImageURI(Uri.parse(user.getFace_url()==null?DEFAULT_FACE_M_URL:user.getFace_url()));
            userFaceArticle.setMinimumWidth(user.getFace_width()==0?120:user.getFace_width());
            userFaceArticle.setMinimumHeight(user.getFace_height()==0?120:user.getFace_height());



            SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss yyyy-MM-dd");
            Date date=new Date(article.getPost_time()*1000L);

            Map<String,Object> map=new HashMap<>();
            map.put("tv_article_id",name);
            map.put("article_user_face",R.drawable.flag);
            map.put("tv_article_time",sdf.format(date)+"("+article.getPosition()+"楼)");
            map.put("article_content",article.getContent());

            listItem.add(map);
        }

*/
        Pagination pagination=threads.getPagination();


        if(pagination.getPage_current_count()==1){
            startLabels.setPullLabel("已经是第一页...");
        }


        if(pagination.getPage_all_count()==pagination.getPage_current_count()){
            System.out.println("最后一页了："+pagination.getPage_all_count()+","+pagination.getPage_current_count());
            endLabels.setPullLabel("已经是最后一页...");
        }




        lv_article.setAdapter(null);
        ArticleFragment articleFragment1=articleFragment;
        ArticleAdapter adapter=new ArticleAdapter(articleFragment1.getActivity(),articles);

        lv_article.setAdapter(adapter);
        lv_article.onRefreshComplete();

    }



}
