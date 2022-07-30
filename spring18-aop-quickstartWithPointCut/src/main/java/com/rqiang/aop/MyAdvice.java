package com.rqiang.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
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

    @Before("pt()") //绑定共性功能, 描述的是抽取的共性功能，根据共性绑定的位置不同，最终运行代码会加入的合理的位置
//    前置通知*
//    后置通知*
//    环绕通知**
//    返回后通知
//    抛出异常后通知
    public void method(){  //名称随意，共性功能
        System.out.println(System.currentTimeMillis());
    }
}

