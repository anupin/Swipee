package com.anupin.swipee;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

//import sharedpreference.SessionManager;

public class ActRed extends Fragment {

    private static final String TAG = "ActRed";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View vi = inflater.inflate(R.layout.activity_red, container, false);
        //checkIfAlreadyLoggedIn();
        return vi;
    }

    /*private void checkIfAlreadyLoggedIn(){
        if (new SessionManager(this.getActivity()).isLoggedIn()){
            goToMainActivity();
        }*/

    public void goToMainActivity(){
        Intent i = new Intent(getActivity(), SwipeMainActivity.class);
        startActivity(i);
        getActivity().finish();
    }
}
