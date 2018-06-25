package com.study.controller;

import com.study.service.Fruit;
import org.junit.Test;

/**
 * 测试反射+简单工厂模式
 *
 * @author Howe Hsiang
 */
public class ReflexFactoryTest extends BaseTest {

    @Test
    public void getInstance() {

        Fruit apple = ReflexFactory.getInstance("com.study.service.Impl.Apple");
        apple.eat();

        Fruit orange = ReflexFactory.getInstance("com.study.service.Impl.Orange");
        orange.eat();
    }
}