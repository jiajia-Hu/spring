package ioc.factory;

import ioc.bean.Book;
import org.springframework.beans.factory.FactoryBean;

import java.util.UUID;


/**实现了FactoryBean　的类就是spring 的工厂类
 * 1.实现FactoryBean
 * 2.在xml里面进行注册
 * */
public class MyFactoryImpl implements FactoryBean<Book> {

    /**
     * getObject：工厂方法：返回创建的对象
     * */
    @Override
    public Book getObject() throws Exception {
        System.out.println("MyFactoryImpl 创建对象");
        Book book = new Book();
//        book.setName("Thinking in Java");
//        book.setAuthor("Bruce Eckel");
        book.setName(UUID.randomUUID().toString());
        return book;
    }

    /**
     *getObjectType 返回创建的对象的类型
     * spring 调用这个方法确认创建的对象是什么类型
     * @return
     */
    @Override
    public Class<?> getObjectType() {
        return Book.class;
    }

    /**
     * isSingleton 是单例？
     * false : 不是
     * true ： 是
     * @return
     */
    @Override
    public boolean isSingleton() {
        return true;
    }
}
