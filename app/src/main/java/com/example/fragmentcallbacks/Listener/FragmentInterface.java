package com.example.fragmentcallbacks.Listener;

/**
 * Step 1: Create interface. Create Method Signature.
 * Step 2: Implement Interface and logic in method.
 * Step 3: Retrieve Interface from context in onAttach.
 * Step 4: Call interface.method().
 */
public interface FragmentInterface {
    void toStartingFragment();
    void toEndingFragment(String text);
}
