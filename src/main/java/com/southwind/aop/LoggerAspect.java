package com.southwind.aop;

import jdk.nashorn.internal.scripts.JO;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LoggerAspect {

    @Before(value = "execution(public int com.southwind.utils.Impl.CalImpl1.*(..))")
    public  void before(JoinPoint joinPoint){
        // 获取 方法名
        String name = joinPoint.getSignature().getName();

        // 获取参数
        String args = Arrays.toString(joinPoint.getArgs());
        System.out.println(name + "方法的参数：" + args);
    }

    @After(value = "execution(public int com.southwind.utils.Impl.CalImpl1.*(..))")
    public void after(JoinPoint joinPoint){
        // 获取 方法名
        String name = joinPoint.getSignature().getName();
        System.out.println(name + "执行完毕！");
    }

    @AfterReturning(value = "execution(public int com.southwind.utils.Impl.CalImpl1.*(..))", returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result){
        //获取方法名
        String name = joinPoint.getSignature().getName();
        System.out.println(name + "的结果 = " + result);
    }

    @AfterThrowing(value = "execution(public int com.southwind.utils.Impl.CalImpl1.*(..))", throwing = "exception")
    public  void afterThrowing(JoinPoint joinPoint, Exception exception){
        //获取方法名
        String name = joinPoint.getSignature().getName();
        System.out.println(name + "方法抛出异常" + exception);
    }
}
