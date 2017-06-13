package com.example.axrorxoja.myapplication.view.login.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.axrorxoja.myapplication.R;

import javax.inject.Inject;

import dagger.android.support.AndroidSupportInjection;
import okhttp3.OkHttpClient;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginLeftFragment extends Fragment
    {
        @Inject OkHttpClient client;

        public static LoginLeftFragment newInstance()
            {
                return new LoginLeftFragment();
            }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
            {
                return inflater.inflate(R.layout.fragment_login_left, container, false);
            }

        @Override
        public void onAttach(Context context)
            {
                AndroidSupportInjection.inject(this);
                Log.d("LoginLeftFragment", "client:" + (client.hashCode()));
                super.onAttach(context);
            }

        @Override
        public void onDetach()
            {
                super.onDetach();
            }
    }
