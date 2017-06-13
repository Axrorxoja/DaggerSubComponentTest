package com.example.axrorxoja.myapplication.di.subcomponent.activity;

import com.example.axrorxoja.myapplication.di.module.activityModule.LoginActivityModule;
import com.example.axrorxoja.myapplication.di.module.appModule.LoginModule;
import com.example.axrorxoja.myapplication.di.scope.LoginActivityScope;
import com.example.axrorxoja.myapplication.view.login.LoginActivity;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;


@LoginActivityScope
@Subcomponent(modules = {LoginModule.class, LoginActivityModule.class})
public interface LoginActivitySubComponent extends AndroidInjector<LoginActivity>
    {
        @Subcomponent.Builder
        abstract class Builder extends AndroidInjector.Builder<LoginActivity>
            {
            }
    }
