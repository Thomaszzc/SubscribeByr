package cn.byr.bbs.sdkdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SearchView;

import cn.byr.bbs.sdkdemo.adapter.SearchAdapter;
import cn.byr.bbs.sdkdemo.bean.Threads;

/**
 * Created by Thomas on 15/6/3.
 */
public class SearchFragment extends Fragment{
    private SearchView searchView;//搜索栏
    private static ListView lv_search_res;//搜索结果

    private ContentProvider cp;
    private static String board;

    private static SearchFragment searchFragment;
    public static SearchFragment newInstance(String board_param){
        searchFragment=new SearchFragment();
        board=board_param;
        return searchFragment;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.search_fragment,null);

        cp=new ContentProvider(getActivity());

        lv_search_res=(ListView)view.findViewById(R.id.search_res_list);

        searchView=(SearchView)view.findViewById(R.id.seach_view);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                System.out.println("param:---------->" + board + "," + query);
                cp.searchArticle(board, query);

                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });

        return view;
    }
    public static void setSearchRes(Threads[] threads){

        SearchFragment searchFragment1=searchFragment;
        SearchAdapter adapter=new SearchAdapter(searchFragment1.getActivity(),threads);
        
        lv_search_res.setAdapter(adapter);
    }

}
