package ioc_2.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorImpl implements BeanPostProcessor {

    /**
     * postProcessBeforeInitialization 初始化之前调用后
     * @param bean 传入的bean
     * @param beanName xml中配置的id
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(beanName +"初始化前 postProcessBeforeInitialization"+"【"+bean+"】");
        //返回传入的bean
        return bean;
    }

    /**
     * postProcessAfterInitialization 初始化之后调用
     * @param bean 初始化之后返回的bean 返回的是什么 容器中就是什么
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(beanName +"初始化结束了----postProcessAfterInitialization"+"【"+bean+"】");

        return bean;
    }
}
