package cn.byr.bbs.sdkdemo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import cn.byr.bbs.sdkdemo.R;
import cn.byr.bbs.sdkdemo.bean.Board;
import cn.byr.bbs.sdkdemo.bean.Threads;

/**
 * Created by Thomas on 15/6/3.
 */
public class SearchAdapter extends BaseAdapter {
    private Context context;
    private Threads[] threads;
    private LayoutInflater layoutInflater;

    public final class SearchResClass{
        public TextView search_article_des;
    }

    public SearchAdapter(Context context,Threads[] threads){
        this.context=context;
        this.threads=threads;
        layoutInflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return threads.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        SearchResClass searchResClass=null;
        if(convertView==null){
            searchResClass=new SearchResClass();
            convertView= layoutInflater.inflate(R.layout.sectionlist,null);
            searchResClass.search_article_des=(TextView)convertView.findViewById(R.id.root_section_des);
            convertView.setTag(searchResClass);
        }else{
            searchResClass=(SearchResClass)convertView.getTag();
        }

        searchResClass.search_article_des.setText(threads[position].getArticle()[0].getTitle());
        return convertView;
    }
}
