import com.study.controller.BaseTest;
import com.study.entity.Grade;
import com.study.entity.Person;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.File;

/**
 * 测试类
 *
 * @author Howe Hsiang
 */
public class SpringIocTest extends BaseTest {

    @Test
    public void getSpringIocInfo() {

        //把input扔到工厂里面去，这个工厂就能为你提供实例了（装载配置文件）
        BeanFactory factory = new ClassPathXmlApplicationContext("Bean.xml");

        //你要一个叫Person的东西，那好，工厂就去找“Person"给你
        Person person =(Person) factory.getBean("Person");
        Grade grade=(Grade)factory.getBean("Grade");

        //person可以调用里面相关的方法，就相当于new了一个Person一样
        System.out.println(
         "姓名："+person.getName()+ "; " +
         "年龄："+person.getAge() + "; " +
         "数学成绩："+grade.getMath()+ "; " +
         "英语成绩："+grade.getEnglish());
    }

}




