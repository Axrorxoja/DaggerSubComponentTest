package com.example.axrorxoja.myapplication.di.subcomponent.fragment;

import com.example.axrorxoja.myapplication.di.module.fragmentModule.LoginRightModule;
import com.example.axrorxoja.myapplication.di.scope.LoginRightFragmentScope;
import com.example.axrorxoja.myapplication.view.login.fragment.LoginRightFragment;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@LoginRightFragmentScope
@Subcomponent(modules = {LoginRightModule.class})
public interface LoginRightSubComponent extends AndroidInjector<LoginRightFragment>
    {

        @Subcomponent.Builder
        abstract class Builder extends AndroidInjector.Builder<LoginRightFragment>
            {
            }

    }
