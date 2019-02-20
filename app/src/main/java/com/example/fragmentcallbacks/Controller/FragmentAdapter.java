package com.example.fragmentcallbacks.Controller;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragmentcallbacks.Listener.FragmentInterface;
import com.example.fragmentcallbacks.R;
import com.example.fragmentcallbacks.Viewer.FragmentViewHolder;

import java.util.List;

public class FragmentAdapter extends RecyclerView.Adapter<FragmentViewHolder> {
    private final FragmentInterface fragmentInterface;
    private Context context;
    private List<Integer> meowlist;


    public FragmentAdapter(List<Integer> meowlist, FragmentInterface fragmentInterface) {
        this.meowlist = meowlist;
        this.fragmentInterface = fragmentInterface;
    }


    @NonNull
    @Override
    public FragmentViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
        View childView;
        LayoutInflater inflater = LayoutInflater.from(context);
        childView = inflater.inflate(R.layout.cardview_itemlist, viewGroup, false);
        return new FragmentViewHolder(childView);
    }

    @Override
    public void onBindViewHolder(@NonNull FragmentViewHolder fragmentViewHolder, int position) {
fragmentViewHolder.onBind(meowlist.get(position), fragmentInterface);
    }



    @Override
    public int getItemCount() {
        return meowlist.size();
    }
}
