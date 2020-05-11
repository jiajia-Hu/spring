package aop_1;


/**
 * spring 实现了AOP的功能， 底层就是动态代理
 * 将某段代码动态的切入到指定的方法的指定位置（前 后 中间）进行运行的编程方式
 */

public interface Calculator {

    int add(int i, int j);
    int sub(int i, int j);
    int mul(int i, int j);
    int div(int i, int j);

}
