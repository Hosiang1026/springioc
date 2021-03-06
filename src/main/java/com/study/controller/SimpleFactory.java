package com.study.controller;

import com.study.service.Fruit;
import com.study.service.Impl.Apple;
import com.study.service.Impl.Orange;

/**
 *  简单工厂模式
 *  工厂类
 *  @author Howe Hsiang
 */

public class SimpleFactory {

    public static Fruit getInstance(String className){

        Fruit f = null;
        if(className.equals("apple")){
            f = new Apple();
        }
        if(className.endsWith("orange")){
            f = new Orange();
        }
        return f;
    }

}
