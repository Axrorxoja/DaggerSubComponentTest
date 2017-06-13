package com.example.axrorxoja.myapplication.di.subcomponent.fragment;

import com.example.axrorxoja.myapplication.di.module.fragmentModule.MainRightModule;
import com.example.axrorxoja.myapplication.di.scope.MainRightFragmentScope;
import com.example.axrorxoja.myapplication.view.main.fragment.MainRightFragment;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@MainRightFragmentScope
@Subcomponent(modules = MainRightModule.class)
public interface MainRightSubComponent extends AndroidInjector<MainRightFragment>
    {
        @Subcomponent.Builder
        abstract class Builder extends AndroidInjector.Builder<MainRightFragment>
            {
            }
    }
