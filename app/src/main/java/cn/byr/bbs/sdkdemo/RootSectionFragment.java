package cn.byr.bbs.sdkdemo;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import cn.byr.bbs.sdkdemo.adapter.RootSectionAdapter;
import cn.byr.bbs.sdkdemo.bean.RootSection;
import cn.byr.bbs.sdkdemo.bean.Section;

/**
 * Created by Thomas on 15/6/1.
 */
public class RootSectionFragment extends Fragment {
    private static final String ARG_SECTION_NUMBER="selection_number";

    private static ListView lv_root_section;

    private ContentProvider cp;
    private static Section[] sections;



    private static RootSectionFragment rootSectionFragment;
    public static RootSectionFragment newInstance(int sectionNumber){
        if(rootSectionFragment==null) {
            rootSectionFragment = new RootSectionFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            rootSectionFragment.setArguments(args);
        }
        return rootSectionFragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.rootsection,container,false);
        lv_root_section=(ListView)view.findViewById(R.id.root_section_list);
        lv_root_section.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                FragmentTransaction transaction= getFragmentManager().beginTransaction();
                transaction.replace(R.id.container,SubSectionFragment.getInstance(sections[position].getName()));
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });


        cp=ContentProvider.getInStance(getActivity());
        cp.getRootSection();
        return view;
    }
    public static void setRootSectionView(Section[] section){

        sections=section;

        RootSectionFragment rootSectionFragment1=rootSectionFragment;
        RootSectionAdapter adapter=new RootSectionAdapter(rootSectionFragment1.getActivity(), section);
        lv_root_section.setAdapter(adapter);
    }


}
