package com.domikado.irwandagger;
// Created by irwancannady (irwancannady@gmail.com) on 1/27/17 at 5:50 PM.


import com.domikado.irwandagger.module.DataModule;

import dagger.Component;


@Component(modules = DataModule.class)
public interface ApplicationComponent {

    void inject(MainActivity mainActivity);
}
