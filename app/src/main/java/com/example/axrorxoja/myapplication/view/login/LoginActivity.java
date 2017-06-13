package com.example.axrorxoja.myapplication.view.login;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import com.example.axrorxoja.myapplication.R;
import com.example.axrorxoja.myapplication.view.login.fragment.LoginLeftFragment;
import com.example.axrorxoja.myapplication.view.login.fragment.LoginRightFragment;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.HasSupportFragmentInjector;
import okhttp3.OkHttpClient;

public class LoginActivity extends AppCompatActivity implements HasSupportFragmentInjector
    {
        int counter = 0;
        @Inject OkHttpClient client;
        @Inject DispatchingAndroidInjector<Fragment> injector;

        @Override
        protected void onCreate(Bundle savedInstanceState)
            {
                AndroidInjection.inject(this);
                Log.d("LoginActivity", "client:" + (client.hashCode()));
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_login);
                Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
                setSupportActionBar(toolbar);

                findViewById(R.id.fab).setOnClickListener(view -> startTransAction());
                findViewById(R.id.fabRouter).setOnClickListener(view -> finish());
            }

        public void startTransAction()
            {
                Fragment item;
                if (counter % 2 == 0) item = LoginRightFragment.newInstance();
                else item = LoginLeftFragment.newInstance();

                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.container, item)
                        .commit();
                counter++;
            }

        @Override
        public AndroidInjector<Fragment> supportFragmentInjector()
            {
                return injector;
            }
    }
