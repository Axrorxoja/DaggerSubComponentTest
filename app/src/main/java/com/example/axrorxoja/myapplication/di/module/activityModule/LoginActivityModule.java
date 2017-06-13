package com.example.axrorxoja.myapplication.di.module.activityModule;

import com.example.axrorxoja.myapplication.di.scope.LoginActivityScope;

import java.util.concurrent.TimeUnit;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;

/**
 * Created by axrorxoja on 6/12/17.
 */
@Module
public class LoginActivityModule
    {
        @Provides
        @LoginActivityScope
        OkHttpClient providesOkHttpClient()
            {
                return new OkHttpClient.Builder()
                        .readTimeout(60, TimeUnit.SECONDS)
                        .writeTimeout(60, TimeUnit.SECONDS)
                        .connectTimeout(60, TimeUnit.SECONDS)
                        .build();
            }
    }
