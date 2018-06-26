package com.study.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

/**
 *  反射+简单工厂模式+xml配置文件
 *  实例配置类PropertiesOperate
 *
 *  @author Howe Hsiang
 */

public class PropertiesOperate {

    private Properties pro = null;

    String url = this.getClass().getResource("/").getPath();

    private File file = new File(url+"fruit.properties");

    public PropertiesOperate(){
        this.pro = new Properties();
        if(file.exists()){
            try {
                pro.loadFromXML(new FileInputStream(file));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else{
            this.save();
        }
    }

    private void save(){
        this.pro.setProperty("apple","com.study.service.Impl.Apple");
        this.pro.setProperty("orange", "com.study.service.Impl.Orange");
        try {
            this.pro.storeToXML(new FileOutputStream(this.file),"Fruit");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public Properties getProperties(){
        return this.pro;
    }

}
