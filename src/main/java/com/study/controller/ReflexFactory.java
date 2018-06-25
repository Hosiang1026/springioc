package com.study.controller;

import com.study.service.Fruit;

/**
 *  反射+简单工厂模式
 *
 *  @author Howe Hsiang
 */

public class ReflexFactory {

    public static Fruit getInstance(String className){

        Fruit f = null;
        try {
            f = (Fruit) Class.forName(className).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }

}
