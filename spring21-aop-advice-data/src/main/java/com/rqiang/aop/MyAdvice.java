package com.rqiang.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class MyAdvice {
    //匹配业务层的所有方法
    @Pointcut("execution(* com.rqiang.dao.*Dao.find*(.. ))")
    private void daoPt(){}

//    @Before("daoPt()")
    public void before(JoinPoint jp){
        Object[] args = jp.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("before advice ..");
    }


    //@Around("daoPt()")
    public void runSpeed(ProceedingJoinPoint pjp) throws Throwable {
//        //获取执行签名信息
//        Signature signature = pjp.getSignature();
//        //通过签名获取执行类型（接口名）
//        String className = signature.getDeclaringTypeName();
//        //通过签名会哦去执行操作名称（方法名）
//        String methodName = signature.getName();
        Object[] args = pjp.getArgs();
        System.out.println(Arrays.toString(args));
        args[0] = 11;
//        long start = System.currentTimeMillis();
//        for(int i = 0; i < 10000; i++)
            pjp.proceed(args);
//        long end = System.currentTimeMillis();
//        System.out.println("万次执行：" + className + "." + methodName + (end - start) + "ms");
    }

    //@AfterReturning(value = "daoPt()", returning = "ret") //返回返回值吗，returning值 必须 等于形参名
    public void afterRuturning(Object ret){ //JoinPoint 有的话 必须放第一个
        System.out.println("afterReturning ..." + ret);
    }

    @AfterThrowing(value = "daoPt()",throwing = "t")
    public void afterThrowing(Throwable t){
        System.out.println("afterThrowing advice ..." + t);
    }
}
