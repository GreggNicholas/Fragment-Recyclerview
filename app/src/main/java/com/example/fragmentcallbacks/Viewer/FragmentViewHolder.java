package com.example.fragmentcallbacks.Viewer;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.fragmentcallbacks.Listener.FragmentInterface;
import com.example.fragmentcallbacks.R;

public class FragmentViewHolder extends RecyclerView.ViewHolder {
    private CardView cardView;
    private TextView textView;


    public FragmentViewHolder(@NonNull View itemView) {
        super(itemView);
        cardView = itemView.findViewById(R.id.cardview_layout);
        textView =  itemView.findViewById(R.id.textview_gridlayout);
    }

    public void onBind(Integer s, final FragmentInterface fragmentInterface) {
        textView.setText(String.valueOf(s));
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentInterface fragmentInterface1 = (FragmentInterface) itemView.getContext();
                fragmentInterface.toEndingFragment("meow");
            }
        });
    }

}
