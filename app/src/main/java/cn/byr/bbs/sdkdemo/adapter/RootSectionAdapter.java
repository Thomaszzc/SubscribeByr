package cn.byr.bbs.sdkdemo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import cn.byr.bbs.sdkdemo.R;
import cn.byr.bbs.sdkdemo.RootSectionFragment;
import cn.byr.bbs.sdkdemo.bean.Article;
import cn.byr.bbs.sdkdemo.bean.Section;

/**
 * Created by Thomas on 15/6/1.
 */
public class RootSectionAdapter extends BaseAdapter {
    private Context context;
    private Section[] sections;

    public final class RootSectionClass{
        public TextView root_section_des;
    }

    public RootSectionAdapter(Context context,Section[] sections){
        this.context=context;
        this.sections=sections;
    }

    @Override
    public int getCount() {
        return sections.length;
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
        RootSectionClass rootSectionClass=null;
        if(convertView==null){
            rootSectionClass=new RootSectionClass();
            convertView= LayoutInflater.from(context).inflate(R.layout.sectionlist,null);
            rootSectionClass.root_section_des=(TextView)convertView.findViewById(R.id.root_section_des);
            convertView.setTag(rootSectionClass);
        }else{
            rootSectionClass=(RootSectionClass)convertView.getTag();
        }

        rootSectionClass.root_section_des.setText(sections[position].getDescription());
        return convertView;
    }
}
