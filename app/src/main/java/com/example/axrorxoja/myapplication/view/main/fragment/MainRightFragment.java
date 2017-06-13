package com.example.axrorxoja.myapplication.view.main.fragment;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.axrorxoja.myapplication.R;
import com.google.gson.Gson;

import javax.inject.Inject;

import dagger.android.support.AndroidSupportInjection;
import dagger.android.support.DaggerFragment;

public class MainRightFragment extends DaggerFragment
    {
        @Inject Gson gson;

        public static MainLeftFragment newInstance()
            {
                return new MainLeftFragment();
            }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
            {
                return inflater.inflate(R.layout.fragment_main_right, container, false);
            }

        @Override
        public void onAttach(Context context)
            {
                AndroidSupportInjection.inject(this);
                Log.d("MainLeftFragment", "gson.hashCode:" + gson.hashCode());
                super.onAttach(context);
            }

        @Override
        public void onDetach()
            {
                super.onDetach();
            }
    }
