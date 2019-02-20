package com.example.fragmentcallbacks.Fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragmentcallbacks.Listener.FragmentInterface;
import com.example.fragmentcallbacks.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class EndingFragment extends Fragment {
    private FragmentInterface mListener;

    public EndingFragment() {
    }

    public static EndingFragment newInstance(String text) {
        return new EndingFragment();
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
        return inflater.inflate(R.layout.fragment_ending, container, false);
    }


    @Override
    public void onDetach() {
        super.onDetach();
    }
}
