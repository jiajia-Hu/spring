package ioc;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {

    /*容器构造的时候 类就创建了
    * xml 的property的name是根据setter方法来赋值的
    * set后面的就是name
    * */
    @Test
    public void test01(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ioc/ioc.xml");
        System.out.println("----------");
        Person person1 = (Person) applicationContext.getBean("person1");
        System.out.println(person1);
    }


    /*根据bean的类型，从IOC容器中获取bean的实例
    applicationContext.getBean(Person.class);
    org.springframework.beans.factory.NoUniqueBeanDefinitionException:
    No qualifying bean of type 'ioc.Person' available:
    expected single matching bean but found 2: person1,person2*/
    @Test
    public void test02(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ioc/ioc.xml");
        Person person = applicationContext.getBean("person2",Person.class);
        System.out.println(person);
    }

    /*
    * 通过构造器为bean属性赋值
    * */
    @Test
    public void test03(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ioc/ioc.xml");
        Person person = applicationContext.getBean("person3",Person.class);
        System.out.println(person);
    }


}