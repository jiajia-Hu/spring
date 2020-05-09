package ioc;


import ioc.bean.AirPlane;
import ioc.bean.Book;
import ioc.bean.Car;
import ioc.bean.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;

public class PersonTest {

//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ioc/config/ioc2.xml");
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ioc/config/ioc2.xml");
            ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ioc/config/ioc3.xml");
    /*容器构造的时候 类就创建了
    * xml 的property的name是根据setter方法来赋值的
    * set后面的就是name
    * */
    @Test
    public void test01(){
        System.out.println("----------");
        Person person1 = (Person) applicationContext.getBean("person1");
        System.out.println(person1);
    }


    /*根据bean的类型，从IOC容器中获取bean的实例
    applicationContext.getBean(Person.class);
    org.springframework.beans.factory.NoUniqueBeanDefinitionException:
    No qualifying bean of type 'ioc.bean.Person' available:
    expected single matching bean but found 2: person1,person2*/
    @Test
    public void test02(){
        Person person = applicationContext.getBean("person2",Person.class);
        System.out.println(person);
    }

    /*
    * 通过构造器为bean属性赋值
    * */
    @Test
    public void test03(){
        Person person3 = applicationContext.getBean("person3",Person.class);
        System.out.println(person3);

        Person person = applicationContext.getBean("person4",Person.class);
        System.out.println(person);
    }


    @Test
    public void test04(){
        Person person = (Person) applicationContext.getBean("person1");
        System.out.println(person.getName() == null);
        System.out.println(person.getEmail() == null);

        System.out.println("修改之前"+person.getCar());

        //默认单例模式 同一个一个car ref是地址引用
        Car car = person.getCar();
        car.setColor("绿色");
        Car car2 = (Car) applicationContext.getBean("car01");
        System.out.println(car == car2);
        System.out.println("改の后的绿色car"+person.getCar());
    }

    @Test
    public void test05(){
        Person person = (Person) applicationContext.getBean("person2");
        List<Book> bookList = person.getBooks();
        for (Book b:bookList) {
            System.out.println(b);
        }

        /*org.springframework.beans.factory.NoSuchBeanDefinitionException: No bean named 'book1' available*/
//        Book book1 = (Book) applicationContext.getBean("book1");
//        System.out.println(book1);
    }

    @Test
    public void test06(){
        Person person = (Person) applicationContext.getBean("person2");
        Map<String, Object> personMap = person.getMap();
        System.out.println(personMap);
        System.out.println(person.getProperties());
    }

    /*
    * 价格都被修改了，级联属性
    * */
    @Test
    public  void  test07(){
        Person person = (Person) applicationContext.getBean("person3");
        System.out.println("person的car"+person.getCar());
        Car car01 = (Car) applicationContext.getBean("car01");
        System.out.println("容器的car"+car01);
    }

    /*
    * org.springframework.beans.factory.BeanIsAbstractException: Error creating bean with name 'person4': Bean definition is abstract*/
    @Test
    public void test08(){
        Person person = (Person) applicationContext.getBean("person5");
        System.out.println(person);

        /*抽象bean不能获取*/
        Person person4 = (Person) applicationContext.getBean("person4");
        System.out.println(person4);
    }

    /*bean之间的依赖*/
    @Test
    public void test09(){
        System.out.println("---------");
        Book book = (Book) applicationContext.getBean("book1");
        Book book2 = (Book) applicationContext.getBean("book1");
        System.out.println(book == book2);
    }


    @Test
    public void test10(){
        System.out.println("启动容器完成----");
        AirPlane airPlane = (AirPlane) applicationContext.getBean("airPlane");
        System.out.println(airPlane);

        AirPlane airPlane2  = (AirPlane) applicationContext.getBean("airPlane2");
        System.out.println(airPlane2);
    }

    /**
     * ioc容器启动的时候不会创建实例， 只有在getBean的时候
     */
    @Test
    public void  test11(){
        Object myFactory = applicationContext.getBean("myfactory");
        Object myFactory2 = applicationContext.getBean("myfactory");
        System.out.println(myFactory);
        System.out.println(myFactory2);

    }
}