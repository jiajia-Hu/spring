package ioc_2.bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

import java.sql.SQLException;

import static org.junit.Assert.*;

public class BookTest {
//    ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc_2/config/applicationContext.xml");



    /**
     * bean的生命周期
     * 单例：(容器启动)构造器---> 初始化init---->  销毁(容器关闭ioc.close())
     * 多例：获取对象才创建(构造---< 初始化init----->不会销毁
     * 后置处理器： (容器启动)构造器-----> 后置处理器befor ------>初始化init------>后置处理器after
     *
     * 无论bean是否有init 后置处理器都会工作
     */
    @Test
    public void test01(){
        ConfigurableApplicationContext ioc = new ClassPathXmlApplicationContext("ioc_2/config/applicationContext.xml");
        System.out.println("-------");
        //ioc.close();
    }


    @Test
    public void test02() throws SQLException {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc_2/config/applicationContext02.xml");
        DataSource dataSource = ioc.getBean(DataSource.class);
        System.out.println(dataSource.getConnection());
    }

}