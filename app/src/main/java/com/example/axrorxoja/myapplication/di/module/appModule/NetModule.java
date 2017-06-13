package com.example.axrorxoja.myapplication.di.module.appModule;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * Created by axrorxoja on 4/25/17.
 */
@Module
public class NetModule
    {
        @Singleton
        @Provides
        Gson provideGson()
            {
                return new GsonBuilder()
                        .create();
            }

        @Provides
        @Singleton
        OkHttpClient providesOkHttpClient()
            {
                return new OkHttpClient.Builder()
                        .readTimeout(60, TimeUnit.SECONDS)
                        .writeTimeout(60, TimeUnit.SECONDS)
                        .connectTimeout(60, TimeUnit.SECONDS)
                        .build();
            }

        @Provides
        @Singleton
        Retrofit provideRetrofit(Gson gson, OkHttpClient client)
            {
                return new Retrofit.Builder()
                        .baseUrl("")
                        .addConverterFactory(GsonConverterFactory.create(gson))
                        .client(client)
                        .build();
            }

    }
