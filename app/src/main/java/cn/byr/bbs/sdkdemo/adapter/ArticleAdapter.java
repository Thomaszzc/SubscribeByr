package cn.byr.bbs.sdkdemo.adapter;

import android.content.Context;
import android.net.Uri;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import cn.byr.bbs.sdkdemo.R;
import cn.byr.bbs.sdkdemo.bean.Article;
import cn.byr.bbs.sdkdemo.bean.User;

/**
 * Created by Thomas on 15/5/17.
 */
public class ArticleAdapter extends BaseAdapter {
    private LayoutInflater listContainer;
    private Context context;
    private Article[] articles;
    private static final String DEFAULT_FACE_M_URL="http://static.byr.cn/img/face_default_m.jpg";


    public final class ListItemView{                //自定义控件集合
        public SimpleDraweeView user_face_article;
        public TextView tv_article_user_id;
        public TextView tv_article_time;
        public TextView tv_article_position;
        public TextView tv_article_content;
    }


    public ArticleAdapter(Context context, Article[] articles) {
        this.context = context;
        listContainer = LayoutInflater.from(context);   //创建视图容器并设置上下文
        this.articles = articles;
    }

    public int getCount() {
        // TODO Auto-generated method stub
        return articles.length;
    }

    public Object getItem(int arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        final int selectID = position;
        //自定义视图
        ListItemView  listItemView = null;
        if (convertView == null) {
            listItemView = new ListItemView();
            //获取list_item布局文件的视图
            convertView = listContainer.inflate(R.layout.article, null);
            //获取控件对象
            listItemView.user_face_article = (SimpleDraweeView)convertView.findViewById(R.id.article_user_face);
            listItemView.tv_article_user_id = (TextView)convertView.findViewById(R.id.tv_article_user_id);
            listItemView.tv_article_time = (TextView)convertView.findViewById(R.id.tv_article_time);
            listItemView.tv_article_position=(TextView)convertView.findViewById(R.id.tv_article_position);
            listItemView.tv_article_content=(TextView)convertView.findViewById(R.id.article_content);


            //设置控件集到convertView
            convertView.setTag(listItemView);
        }else {
            listItemView = (ListItemView)convertView.getTag();
        }

        Article article=articles[position];
        User user=article.getUser();

        //设置文字和图片
        listItemView.user_face_article.setImageURI(Uri.parse(user.getFace_url()==null?DEFAULT_FACE_M_URL:user.getFace_url()));
        listItemView.user_face_article.setMinimumWidth(user.getFace_width()==0?120:user.getFace_width());
        listItemView.user_face_article.setMinimumHeight(user.getFace_height()==0?120:user.getFace_height());


        listItemView.tv_article_user_id.setText(user.getId());

        SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss yyyy-MM-dd");
        Date date=new Date(article.getPost_time()*1000L);
        listItemView.tv_article_time.setText(sdf.format(date));

        String level=article.getPosition()+"楼";
        switch (article.getPosition()){
            case 0:
                level="楼主";break;
            case 1:
                level="沙发";break;
            case 2:
                level="板凳";break;
            default:
                break;
        }


        listItemView.tv_article_position.setText(level);

        String content=article.getContent();
        System.out.print("content_tag:"+content);
        listItemView.tv_article_content.setText(content);
        return convertView;
    }
}
