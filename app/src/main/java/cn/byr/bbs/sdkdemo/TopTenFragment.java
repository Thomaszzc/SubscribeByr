package cn.byr.bbs.sdkdemo;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import cn.byr.bbs.sdkdemo.bean.Article;

/**
 * Created by Thomas on 15/5/7.
 */
public class TopTenFragment extends ListFragment {

    private static final String ARG_SECTION_NUMBER="section_number";

    private ContentProvider cp;
    public TextView tv_lastUpdateTime;
    private View view;
    public ListView listView_topTen;
    public SimpleAdapter adapter;

    private Article[] article;
    public void setArticle(Article[] article){
        this.article=article;
    }




    private static TopTenFragment topTenFragment;

    public TopTenFragment(){}
    public static TopTenFragment newInstance(int sectionNumber){
        if(topTenFragment==null){
            topTenFragment=new TopTenFragment();
            Bundle args=new Bundle();
            args.putInt(ARG_SECTION_NUMBER,sectionNumber);
            topTenFragment.setArguments(args);
        }
        return topTenFragment;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.topten, container, false);
       // ListView listView=new ListView();
      //  listView_topTen=(ListView)view.findViewById(R.id.lv_topten);
        tv_lastUpdateTime=(TextView)view.findViewById(R.id.tv_last_update_time);

       /* listView_topTen.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(),position,Toast.LENGTH_LONG).show();
           //     System.out.print("position:"+position);
           //     selectTopTenItem(position);

            }
        });*/

        cp=new ContentProvider(this.getActivity());
        cp.getTopTenInfo();

        tv_lastUpdateTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"click",Toast.LENGTH_LONG).show();
            }
        });

       // setListAdapter(adapter);

        return view;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
       // String item=adapter.getItem(position);
       // Toast.makeText(getActivity(),position,Toast.LENGTH_LONG).show();
        System.out.print(position);

        FragmentTransaction transaction=getFragmentManager().beginTransaction();

        transaction.replace(R.id.container,ArticleFragment.newInstance(position+1,article[position]));
        transaction.addToBackStack(null);
        transaction.commit();
    }
    public static interface TopTenCallbacks {
        /**
         * Called when an item in the navigation drawer is selected.
         */
        void onTopTenItemSelected(int position);
    }

}
