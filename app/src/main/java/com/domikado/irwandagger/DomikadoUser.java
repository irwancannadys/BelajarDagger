package com.domikado.irwandagger;
// Created by irwancannady (irwancannady@gmail.com) on 1/27/17 at 5:50 PM.

import java.util.Locale;


public class DomikadoUser {

    public String say(String string){
        return String.format(Locale.getDefault()," [Irwan] Domikado %s", string);
    }
}
