package com.study.controller;

import com.study.service.Fruit;
import org.junit.Test;

public class ReflexFactoryTest extends BaseTest {

    @Test
    public void getInstance() {

        Fruit apple = ReflexFactory.getInstance("com.study.service.Impl.Apple");
        apple.eat();

        Fruit orange = ReflexFactory.getInstance("com.study.service.Impl.Orange");
        orange.eat();
    }
}