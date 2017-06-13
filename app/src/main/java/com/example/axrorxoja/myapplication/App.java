package com.example.axrorxoja.myapplication;

import android.app.Activity;
import android.app.Application;

import com.example.axrorxoja.myapplication.di.component.DaggerAppComponent;
import com.example.axrorxoja.myapplication.di.module.appModule.AppModule;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

/**
 * Created by axrorxoja on 6/12/17.
 */

public class App extends Application implements HasActivityInjector
    {
                @Inject DispatchingAndroidInjector<Activity> injectorActivity;
        @Override
        public void onCreate()
            {
                super.onCreate();
                DaggerAppComponent.builder().appModule(new AppModule(this)).build().injectApp(this);
            }

        @Override
        public AndroidInjector<Activity> activityInjector()
            {
                return injectorActivity;
            }
    }
