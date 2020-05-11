package aop_1.impl;

import aop_1.CalculateProxy;
import aop_1.Calculator;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MyMathCalTest {

//    @Test
//    public void test(){
//        Calculator myMathCal = new MyMathCal();
//        int add = myMathCal.add(10, 23);
//        System.out.println(add);
//
//        Calculator proxy = CalculateProxy.getProxy(myMathCal);
//        //[interface aop_1.Calculator]
//        System.out.println(Arrays.asList(proxy.getClass().getInterfaces()));
//        proxy.add(1,2);
//
//    }
//    @Autowired
//
//    @Test
//    public  void test02(){
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("aop_1/config/applicationContext.xml");
//        Calculator calculator = applicationContext.getBean(Calculator.class);
//        calculator.add(2,4);
//        System.out.println(calculator);
//        /**
//         * ioc 保存的就是 class com.sun.proxy.$Proxy18
//         */
//        System.out.println(calculator.getClass());
//
//    }

    @Test
    public void test03(){
        /**
         * 如果没有接口
         */
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("aop_1/config/applicationContext.xml");
        MyMathCal bean = applicationContext.getBean(MyMathCal.class);
        bean.add(4,6);
        /**
         * cgLib 帮忙
         * class aop_1.impl.MyMathCal$$EnhancerBySpringCGLIB$$1999c240
         */
        System.out.println(bean.getClass());
    }

}