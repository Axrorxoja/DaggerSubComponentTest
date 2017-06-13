package com.example.axrorxoja.myapplication.di.module.appModule;

import android.support.v4.app.Fragment;

import com.example.axrorxoja.myapplication.di.subcomponent.fragment.MainLeftSubComponent;
import com.example.axrorxoja.myapplication.di.subcomponent.fragment.MainRightSubComponent;
import com.example.axrorxoja.myapplication.view.main.fragment.MainLeftFragment;
import com.example.axrorxoja.myapplication.view.main.fragment.MainRightFragment;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

/**
 * Created by axrorxoja on 6/12/17.
 */
@Module(
        subcomponents =
                {
                        MainLeftSubComponent.class,
                        MainRightSubComponent.class
                })
public abstract class MainModule
    {
        @Binds
        @IntoMap
        @FragmentKey(MainLeftFragment.class)
        abstract AndroidInjector.Factory<? extends Fragment> bindMainLeft(MainLeftSubComponent.Builder builder);

        @Binds
        @IntoMap
        @FragmentKey(MainRightFragment.class)
        abstract AndroidInjector.Factory<? extends Fragment> bindMainRight(MainRightSubComponent.Builder builder);

    }
