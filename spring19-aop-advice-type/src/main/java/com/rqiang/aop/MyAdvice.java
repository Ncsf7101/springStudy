package com.rqiang.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


@Component //springIOC控制
@Aspect  //AOP处理标识
public class MyAdvice {

//    @Pointcut("execution(void com.rqiang.dao.BookDao.update())") //设置切入点位置
//    @Pointcut("execution(void com.rqiang.dao.impl.BookDaoImpl.update())") //设置切入点位置
//  @Pointcut("execution(* com.rqiang.*.*Dao.update*(..))")
    @Pointcut("execution(* com.rqiang.dao.*BookDao.update(..))")
    private void pt(){//定义切入点，私有方法空壳
    }
    @Pointcut("execution(* com.rqiang.dao.*BookDao.select(..))")
    private void pt2(){//定义切入点，私有方法空壳
    }

    //@Before("MyAdvice.pt()")
//    @Before("pt()") //绑定共性功能, 描述的是抽取的共性功能，根据共性绑定的位置不同，最终运行代码会加入的合理的位置
//    前置通知*
//    后置通知*
//    环绕通知**
//    返回后通知
//    抛出异常后通知
    public void before(){  //名称随意，共性功能
        System.out.println("before advice..");
    }

//    @After("pt()")
    public void after(){
        System.out.println("after advice..");
    }

    //@Around("pt()")
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("before advice..");
        pjp.proceed();//表示对原始操作的调用
        System.out.println("after advice..");
    }
    @Around("pt2()") //环绕通知需要把返回值接进来再送出去
    public Object aroundSlect(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("before advice..");
        Object ret = pjp.proceed();//表示对原始操作的调用
        System.out.println("after advice..");
        return ret;
    }

//    @AfterReturning("pt2()") //没抛异常正常时候才运行，@After异常时也运行，异常正常抛出

//    @AfterThrowing("pt2()") // 抛出异常才运行，没抛出异常不运行

}

