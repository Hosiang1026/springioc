package com.study.controller;

import com.study.service.Fruit;
import org.junit.Test;
import java.util.Properties;

/**
 * 测试反射+简单工厂模式+xml配置文件
 *
 * @author Howe Hsiang
 */
public class PropertiesOperateTest extends BaseTest {

    @Test
    public void getProperties(){

        Properties pro=new PropertiesOperate().getProperties();

        //苹果
        Fruit apple = ReflexFactory.getInstance(pro.getProperty("apple"));
        apple.eat();

        //橘子
        Fruit orange = ReflexFactory.getInstance(pro.getProperty("orange"));
        orange.eat();

    }
}