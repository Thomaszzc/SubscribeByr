package cn.byr.bbs.sdkdemo;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thomas on 15/5/7.
 */
public class WordSubscribeFragment extends Fragment {


    private static final String ARG_SECTION_NUMBER="selection_number";
    private static WordSubscribeFragment wordSubscribeFragment;



    private ListView lv_word_subscribe;

    public static WordSubscribeFragment newInstance(int sectionNumber){
        if(wordSubscribeFragment==null) {
            wordSubscribeFragment=new WordSubscribeFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            wordSubscribeFragment.setArguments(args);
        }
        return wordSubscribeFragment;
    }
    public WordSubscribeFragment(){}


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.subscribe,container,false);


        lv_word_subscribe=(ListView)view.findViewById(R.id.subcribe_id);

        List<String> itemList=new ArrayList<>();
        itemList.add("百度");
        itemList.add("美团");

        ArrayAdapter adapter=new ArrayAdapter(getActivity(),android.R.layout.simple_list_item_1,itemList);
        lv_word_subscribe.setAdapter(adapter);


        return view;
    }
}
