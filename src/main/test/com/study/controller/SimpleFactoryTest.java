package com.study.controller;

import com.study.service.Fruit;
import org.junit.Test;

/**
 * 测试简单工厂模式
 *
 * @author Howe Hsiang
 */
public class SimpleFactoryTest extends BaseTest {

    @Test
    public void getInstance() {

        //苹果
        Fruit apple = SimpleFactory.getInstance("apple");
        apple.eat();

        //橘子
        Fruit orange = SimpleFactory.getInstance("orange");
        orange.eat();
    }

}




