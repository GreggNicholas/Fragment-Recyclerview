package com.example.fragmentcallbacks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.fragmentcallbacks.Fragment.EndingFragment;
import com.example.fragmentcallbacks.Fragment.StartingFragment;
import com.example.fragmentcallbacks.Listener.FragmentInterface;

public class MainActivity extends AppCompatActivity implements FragmentInterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    toStartingFragment();


    }

    @Override
    public void toStartingFragment() {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.main_container, StartingFragment.newInstance())
                .commit();
    }

    @Override
    public void toEndingFragment(String text) {
        EndingFragment endingFragment = EndingFragment.newInstance("Meow");
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.main_container, endingFragment)
                .commit();
    }
}
