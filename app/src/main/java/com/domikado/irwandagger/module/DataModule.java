package com.domikado.irwandagger.module;
// Created by irwancannady (irwancannady@gmail.com) on 1/27/17 at 5:49 PM.


import com.domikado.irwandagger.DomikadoUser;
import com.domikado.irwandagger.Test;

import dagger.Module;
import dagger.Provides;

@Module
public class DataModule {

    public DataModule() {
    }

    @Provides
    DomikadoUser domikadoUser(){
        return new DomikadoUser();
    }

    @Provides
    Test test(){
        return new Test();
    }
}
