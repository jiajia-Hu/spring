package aop_1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK的动态代理 如果目标代理对象没有实现任何的接口 是无法为他创建动态代理对象的
 * Class<?>[] interfaces = calculator.getClass().getInterfaces();
 * ★★★★★★★★★★★★★★★★★代理对象和被代理对象的唯一关联就是实现同一个接口★★★★★★★★★★★★★★★
 */
public class CalculateProxy {
    public static  Calculator getProxy(final Calculator calculator){

        ClassLoader classLoader = calculator.getClass().getClassLoader();
        Class<?>[] interfaces = calculator.getClass().getInterfaces();
        //方法执行器 帮目标对象执行目标方法
        InvocationHandler h = new InvocationHandler() {
            /**
             * @param proxy 代理对象，给jdk使用 不要用
             * @param method 当前将要执行的目标对象的方法
             * @param args 调用方法 参数值
             * @return 目标方法的返回值
             * @throws Throwable
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("动态代理执行的方法------");
                //利用反射执行目标方法
                Object invoke = method.invoke(calculator, args);
                //返回回去  外界拿到
                return invoke;
            }
        } ;
        Object o = Proxy.newProxyInstance(classLoader,interfaces, h);
        return (Calculator)o;

    }
}
