package com.example.axrorxoja.myapplication.di.subcomponent.fragment;

import com.example.axrorxoja.myapplication.di.module.fragmentModule.MainLeftModule;
import com.example.axrorxoja.myapplication.di.scope.MainLeftFragmentScope;
import com.example.axrorxoja.myapplication.view.main.fragment.MainLeftFragment;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@MainLeftFragmentScope
@Subcomponent(modules = {MainLeftModule.class})
public interface MainLeftSubComponent extends AndroidInjector<MainLeftFragment>
    {
        @Subcomponent.Builder
        abstract class Builder extends AndroidInjector.Builder<MainLeftFragment>
            {
            }
    }
