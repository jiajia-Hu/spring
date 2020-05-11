package ioc_3.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class UserServiceTest {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ioc_3/config/applicationContext3.xml");

    @Test
    public void test01(){
        BookService bookService = applicationContext.getBean(BookService.class);
        UserService userService = applicationContext.getBean(UserService.class);
        bookService.save();
        userService.save();
    }

}