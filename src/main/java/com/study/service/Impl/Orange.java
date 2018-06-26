package com.study.service.Impl;

import com.study.service.Fruit;

/**
 * 简单工厂模式
 * 实现类Orange
 *
 * @author Howe Hsiang
 */
public class Orange implements Fruit {

    @Override
    public void eat() {
        System.out.println("吃橘子");
    }
}
