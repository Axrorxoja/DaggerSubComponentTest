package com.example.axrorxoja.myapplication.di.module.activityModule;

import com.example.axrorxoja.myapplication.di.scope.MainActivityScope;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import dagger.Module;
import dagger.Provides;

/**
 * Created by axrorxoja on 6/12/17.
 */
@Module
public class MainActivityModule
    {
        @MainActivityScope
        @Provides
        Gson provideGson()
            {
                return new GsonBuilder()
                        .create();
            }
    }
