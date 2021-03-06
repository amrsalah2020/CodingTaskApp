package com.salah.amr.codingtaskapp.dagger;

import com.salah.amr.codingtaskapp.MyApp;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Amr Salah on 1/31/2018.
 */
@Singleton
@Component(modules = {NetModule.class , AppModule.class})
public interface AppComponent {

    ControllerComponent newControllerComponent(ControllerModule module);
    WidgetComponent newWidgetComponent(WidgetModule module);
    void inject(MyApp target);
}
