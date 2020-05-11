package aop_1;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.omg.PortableInterceptor.ObjectReferenceFactory;
import org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 如何讲这个类（切面类）中的方法(通知方法)动态的在目标方法的各个位置切入
 */
@Component
@Aspect
public class LogUtil {

    @Before("execution(public int aop_1.impl.MyMathCal.*(int, int))")
    public void doStart(JoinPoint joinPoint){
        Signature signature = joinPoint.getSignature();
        System.out.println("【"+signature.getName()+"】开始执行，用的参数列表【"+ Arrays.asList(joinPoint.getArgs())+"】");
    }

    @AfterReturning(value = "execution(public int aop_1.impl.MyMathCal.*(int, int))", returning = "obj")
    public void doReturn(JoinPoint joinPoint,Object obj){
        Signature signature = joinPoint.getSignature();
        System.out.println("【"+signature.getName()+"】正常执行return结果："+obj+"，用的参数列表【"+ Arrays.asList(joinPoint.getArgs())+"】");
    }
    @AfterThrowing(value = "execution(public int aop_1.impl.MyMathCal.div(int, int))",throwing = "exception")
    public void doException(JoinPoint joinPoint, Exception exception){
        Signature signature = joinPoint.getSignature();
        System.out.println("【"+signature.getName()+"】出现异常:"+exception+"用的参数列表【"+ Arrays.asList(joinPoint.getArgs())+"】");
    }

    @After("execution(public int aop_1.impl.MyMathCal.*(int, int))")
    public void doResult(JoinPoint joinPoint){
        Signature signature = joinPoint.getSignature();
        System.out.println("【"+signature.getName()+"】最终结果:用的参数列表【"+ Arrays.asList(joinPoint.getArgs())+"】");
    }
}
