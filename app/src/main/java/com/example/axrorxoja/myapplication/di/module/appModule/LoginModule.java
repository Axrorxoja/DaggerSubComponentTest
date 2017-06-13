package com.example.axrorxoja.myapplication.di.module.appModule;

import android.support.v4.app.Fragment;

import com.example.axrorxoja.myapplication.di.subcomponent.fragment.LoginLeftSubComponent;
import com.example.axrorxoja.myapplication.di.subcomponent.fragment.LoginRightSubComponent;
import com.example.axrorxoja.myapplication.view.login.fragment.LoginLeftFragment;
import com.example.axrorxoja.myapplication.view.login.fragment.LoginRightFragment;

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
                        LoginLeftSubComponent.class,
                        LoginRightSubComponent.class
                })
public abstract class LoginModule
    {
        @Binds
        @IntoMap
        @FragmentKey(LoginLeftFragment.class)
        abstract AndroidInjector.Factory<? extends Fragment> bindLoginLeft(LoginLeftSubComponent.Builder builder);

        @Binds
        @IntoMap
        @FragmentKey(LoginRightFragment.class)
        abstract AndroidInjector.Factory<? extends Fragment> bindLoginRight(LoginRightSubComponent.Builder builder);

    }
