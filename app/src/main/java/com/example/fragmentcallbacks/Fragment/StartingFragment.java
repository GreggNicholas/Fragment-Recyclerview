package com.example.fragmentcallbacks.Fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.fragmentcallbacks.Controller.FragmentAdapter;
import com.example.fragmentcallbacks.Listener.FragmentInterface;
import com.example.fragmentcallbacks.R;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class StartingFragment extends Fragment {
    private FragmentInterface mListener;
    private RecyclerView recyclerView;
    private List<Integer> meowList = new ArrayList<>();

    public static StartingFragment newInstance() {
        return new StartingFragment();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof FragmentInterface) {
            mListener = (FragmentInterface) context;
        } else {
            throw new RuntimeException(context.toString() + "Must Implement mListener");
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_starting, container, false);
        return rootView;

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button toEndFrag = view.findViewById(R.id.button_starting);
        toEndFrag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.toEndingFragment("Hello World");
            }
        });

        FragmentAdapter adapter = new FragmentAdapter(meowList, mListener);
        recyclerView = view.findViewById(R.id.recyclerview_startingfragment);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(view.getContext(), 1));

    }

    // should listener be killed in ondestroy instead of ondetach?
    @Override
    public void onDestroy() {
        mListener = null;
        super.onDestroy();
    }
}
