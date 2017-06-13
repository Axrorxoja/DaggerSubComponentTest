package com.example.axrorxoja.myapplication.di.subcomponent.activity;


import com.example.axrorxoja.myapplication.di.module.activityModule.MainActivityModule;
import com.example.axrorxoja.myapplication.di.module.appModule.MainModule;
import com.example.axrorxoja.myapplication.di.scope.MainActivityScope;
import com.example.axrorxoja.myapplication.view.main.MainActivity;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@MainActivityScope
@Subcomponent(modules = {MainModule.class, MainActivityModule.class})
public interface MainActivitySubComponent extends AndroidInjector<MainActivity>
    {
        @Subcomponent.Builder
        abstract class Builder extends AndroidInjector.Builder<MainActivity>
            {
            }
    }
