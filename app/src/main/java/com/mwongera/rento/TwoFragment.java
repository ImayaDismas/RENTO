package com.mwongera.rento;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by mwongera on 01/07/16.
 */
public class TwoFragment extends Fragment {
    private Menu menu;
    private boolean isListView;
    private RecyclerView mRecyclerView;
    private StaggeredGridLayoutManager mStaggeredLayoutManager;
    private TravelListAdapter mAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_two, container, false);

        isListView = true;

        RecyclerView mRecyclerView = (RecyclerView) rootView.findViewById(R.id.list);
        mStaggeredLayoutManager = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(mStaggeredLayoutManager);

        mAdapter = new TravelListAdapter(getActivity());
        mRecyclerView.setAdapter(mAdapter);

        TravelListAdapter.OnItemClickListener onItemClickListener = new TravelListAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View v, int position) {
                //Toast.makeText(getActivity(), "Clicked " + position, Toast.LENGTH_SHORT).show();

                if(position == 0)
                {
                    Intent intent = new Intent(getActivity(), KBCActivity.class);
                    intent.putExtra(DetailActivity.EXTRA_PARAM_ID, position);
                    startActivity(intent);
                }
                else if(position == 1)
                {
                    Intent intent = new Intent(getActivity(), KBFActivity.class);
                    intent.putExtra(DetailActivity.EXTRA_PARAM_ID, position);
                    startActivity(intent);
                }
                else if(position == 2)
                {
                    Intent intent = new Intent(getActivity(), KBPActivity.class);
                    intent.putExtra(DetailActivity.EXTRA_PARAM_ID, position);
                    startActivity(intent);
                }
                else if(position == 3)
                {
                    Intent intent = new Intent(getActivity(), KBSActivity.class);
                    intent.putExtra(DetailActivity.EXTRA_PARAM_ID, position);
                    startActivity(intent);
                }
                else if(position == 4)
                {
                    Intent intent = new Intent(getActivity(), KBUActivity.class);
                    intent.putExtra(DetailActivity.EXTRA_PARAM_ID, position);
                    startActivity(intent);
                }
                else if(position == 5)
                {
                    Intent intent = new Intent(getActivity(), KBVActivity.class);
                    intent.putExtra(DetailActivity.EXTRA_PARAM_ID, position);
                    startActivity(intent);
                }
                else if(position == 6)
                {
                    Intent intent = new Intent(getActivity(), KBWActivity.class);
                    intent.putExtra(DetailActivity.EXTRA_PARAM_ID, position);
                    startActivity(intent);
                }
                else if(position == 7)
                {
                    Intent intent = new Intent(getActivity(), KBZActivity.class);
                    intent.putExtra(DetailActivity.EXTRA_PARAM_ID, position);
                    startActivity(intent);
                }
                else if(position == 8)
                {
                    Intent intent = new Intent(getActivity(), KCBActivity.class);
                    intent.putExtra(DetailActivity.EXTRA_PARAM_ID, position);
                    startActivity(intent);
                }
                else if(position == 9)
                {
                    Intent intent = new Intent(getActivity(), KCEActivity.class);
                    intent.putExtra(DetailActivity.EXTRA_PARAM_ID, position);
                    startActivity(intent);
                }
                else if(position == 10)
                {
                    Intent intent = new Intent(getActivity(), KCFActivity.class);
                    intent.putExtra(DetailActivity.EXTRA_PARAM_ID, position);
                    startActivity(intent);
                }
                else if(position == 11)
                {
                    Intent intent = new Intent(getActivity(), KCHActivity.class);
                    intent.putExtra(DetailActivity.EXTRA_PARAM_ID, position);
                    startActivity(intent);
                }
            }
        };
        mAdapter.setOnItemClickListener(onItemClickListener);

        return rootView;
    }
}