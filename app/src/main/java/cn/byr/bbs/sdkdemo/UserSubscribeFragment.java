package cn.byr.bbs.sdkdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Thomas on 15/5/7.
 */
public class UserSubscribeFragment extends Fragment {

    private static final String ARG_SECTION_NUMBER="selection_number";
    private static UserSubscribeFragment userSubscribeFragment;

    public static UserSubscribeFragment newInstance(int sectionNumber){
        if(userSubscribeFragment==null) {
            userSubscribeFragment=new UserSubscribeFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            userSubscribeFragment.setArguments(args);
        }
        return userSubscribeFragment;
    }
    public UserSubscribeFragment(){}
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.subscribe,container,false);
    }
}
