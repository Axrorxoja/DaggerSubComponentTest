package com.example.axrorxoja.myapplication.di.module.appModule;

import android.app.Activity;

import com.example.axrorxoja.myapplication.di.subcomponent.activity.LoginActivitySubComponent;
import com.example.axrorxoja.myapplication.di.subcomponent.activity.MainActivitySubComponent;
import com.example.axrorxoja.myapplication.view.login.LoginActivity;
import com.example.axrorxoja.myapplication.view.main.MainActivity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = {LoginActivitySubComponent.class, MainActivitySubComponent.class})
public abstract class ActivityModule
    {
        @Binds
        @IntoMap
        @ActivityKey(LoginActivity.class)
        abstract AndroidInjector.Factory<? extends Activity> bindLoginActivity(LoginActivitySubComponent.Builder builder);

        @Binds
        @IntoMap
        @ActivityKey(MainActivity.class)
        abstract AndroidInjector.Factory<? extends Activity> bindMonitorActivity(MainActivitySubComponent.Builder builder);


    }
