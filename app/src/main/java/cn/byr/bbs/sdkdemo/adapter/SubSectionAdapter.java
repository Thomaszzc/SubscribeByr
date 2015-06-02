package cn.byr.bbs.sdkdemo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import cn.byr.bbs.sdkdemo.R;
import cn.byr.bbs.sdkdemo.bean.Board;
import cn.byr.bbs.sdkdemo.bean.Section;

/**
 * Created by Thomas on 15/6/2.
 */
public class SubSectionAdapter extends BaseAdapter {
    private Context context;
    private Board[] boards;
    private LayoutInflater layoutInflater;

    public final class RootSectionClass{
        public TextView root_section_des;
    }

    public SubSectionAdapter(Context context,Board[] boards){
        this.context=context;
        this.boards=boards;
        layoutInflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return boards.length;
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
            convertView= layoutInflater.inflate(R.layout.sectionlist,null);
            rootSectionClass.root_section_des=(TextView)convertView.findViewById(R.id.root_section_des);
            convertView.setTag(rootSectionClass);
        }else{
            rootSectionClass=(RootSectionClass)convertView.getTag();
        }

        rootSectionClass.root_section_des.setText(boards[position].getDescription());
        return convertView;
    }
}
