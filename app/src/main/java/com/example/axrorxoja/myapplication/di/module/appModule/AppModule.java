package com.example.axrorxoja.myapplication.di.module.appModule;

import com.example.axrorxoja.myapplication.App;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule
    {
        private App app;

        public AppModule(App app)
            {
                this.app = app;
            }

        @Provides
        @Singleton
        App providesApp()
            {
                return app;
            }
    }
