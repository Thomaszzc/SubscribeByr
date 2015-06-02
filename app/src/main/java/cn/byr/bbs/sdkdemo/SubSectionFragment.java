package cn.byr.bbs.sdkdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import cn.byr.bbs.sdkdemo.adapter.SubSectionAdapter;
import cn.byr.bbs.sdkdemo.bean.Board;

/**
 * Created by Thomas on 15/6/2.
 */
public class SubSectionFragment extends Fragment {
    private static final String ARG_SECTION_NUMBER="selection_number";

    private static SubSectionFragment subSectionFragment;
    private static String sectionName;
    private ContentProvider cp;

    private static ListView lv_sub_section;
    public static SubSectionFragment getInstance(String section_name){
            subSectionFragment=new SubSectionFragment();
            sectionName=section_name;
            return subSectionFragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.rootsection,null);

        lv_sub_section=(ListView)view.findViewById(R.id.root_section_list);
        cp=new ContentProvider(getActivity());
        System.out.println("sectionName---------------->:"+sectionName);


        cp.getSubSection(sectionName);


        return view;
    }
    public static void setSubSection(Board[] boards){
        for(Board board:boards)
        System.out.println(board.getDescription());

        SubSectionFragment subSectionFragment1=subSectionFragment;
        SubSectionAdapter adapter=new SubSectionAdapter(subSectionFragment1.getActivity(),boards);
        lv_sub_section.setAdapter(adapter);
    }
}
