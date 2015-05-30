package cn.byr.bbs.sdkdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Thomas on 15/5/9.
 */
public class PageSubscribeFragment extends Fragment{


        private static final String ARG_SECTION_NUMBER="selection_number";
        private static PageSubscribeFragment pageSubscribeFragment;

        public static PageSubscribeFragment newInstance(int sectionNumber){
            if(pageSubscribeFragment==null) {
                pageSubscribeFragment=new PageSubscribeFragment();
                Bundle args = new Bundle();
                args.putInt(ARG_SECTION_NUMBER, sectionNumber);
                pageSubscribeFragment.setArguments(args);
            }
            return pageSubscribeFragment;
        }
        public PageSubscribeFragment(){}

        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            return inflater.inflate(R.layout.subscribe,container,false);
        }
}
