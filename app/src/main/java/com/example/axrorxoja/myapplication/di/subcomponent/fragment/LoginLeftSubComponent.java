package com.example.axrorxoja.myapplication.di.subcomponent.fragment;

import com.example.axrorxoja.myapplication.di.module.fragmentModule.LoginLeftModule;
import com.example.axrorxoja.myapplication.di.scope.LoginLeftFragmentScope;
import com.example.axrorxoja.myapplication.view.login.fragment.LoginLeftFragment;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;


@LoginLeftFragmentScope
@Subcomponent(modules = {LoginLeftModule.class})
public interface LoginLeftSubComponent extends AndroidInjector<LoginLeftFragment>
    {
        @Subcomponent.Builder
        abstract class Builder extends AndroidInjector.Builder<LoginLeftFragment>
            {
            }
    }
