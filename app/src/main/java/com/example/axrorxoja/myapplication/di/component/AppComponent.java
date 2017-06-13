package com.example.axrorxoja.myapplication.di.component;

import com.example.axrorxoja.myapplication.App;
import com.example.axrorxoja.myapplication.di.module.appModule.ActivityModule;
import com.example.axrorxoja.myapplication.di.module.appModule.AppModule;
import com.example.axrorxoja.myapplication.di.module.appModule.NetModule;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules =
        {
                AppModule.class,
                AndroidInjectionModule.class,
                AndroidSupportInjectionModule.class,
                ActivityModule.class,
        })

public interface AppComponent
//        extends AndroidInjector<App>
    {
        /*@Component.Builder
        abstract class Builder extends AndroidInjector.Builder<App>
            {
            }*/
        void injectApp(App app);
    }
