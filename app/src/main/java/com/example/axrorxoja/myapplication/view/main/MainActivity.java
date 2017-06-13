package com.example.axrorxoja.myapplication.view.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import com.example.axrorxoja.myapplication.R;
import com.example.axrorxoja.myapplication.view.login.LoginActivity;
import com.example.axrorxoja.myapplication.view.main.fragment.MainLeftFragment;
import com.example.axrorxoja.myapplication.view.main.fragment.MainRightFragment;
import com.google.gson.Gson;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.HasSupportFragmentInjector;

public class MainActivity extends
        AppCompatActivity implements HasSupportFragmentInjector
        //        DaggerAppCompatActivity
    {

        private static final String TAG = "MainActivity";
        int counter = 0;
        @Inject Gson gson;
        @Inject DispatchingAndroidInjector<Fragment> injector;

        @Override
        protected void onCreate(Bundle savedInstanceState)
            {
                AndroidInjection.inject(this);
                Log.d("MainActivity", "gson.hashCode:" + gson.hashCode());
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
                Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
                setSupportActionBar(toolbar);

                findViewById(R.id.fab).setOnClickListener(view -> startTransAction());
                findViewById(R.id.fabRouter).setOnClickListener(view -> routeToNext());
            }

        public void startTransAction()
            {
                Fragment item;
                if (counter % 2 == 0) item = MainRightFragment.newInstance();
                else item = MainLeftFragment.newInstance();

                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.container, item)
                        .commit();
                counter++;
            }

        public void routeToNext()
            {
                startActivity(new Intent(this, LoginActivity.class));
            }

        @Override
        public AndroidInjector<Fragment> supportFragmentInjector()
            {
                return injector;
            }
    }
