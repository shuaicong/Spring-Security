package com.imooc.web.aspect;

import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @描述: 
 * @作者: alter
 * @时间：2017年11月26日 下午4:12:50
 */
//@Aspect
//@Component
public class TimeAspect {

	
	@Around("execution(* com.imooc.web.controller.UserController.*(..))")
	public Object handleControllerMethod(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("time aspect start");
		
		Object[] args = pjp.getArgs();
		for(Object arg : args) {
			System.out.println("arg is "+arg);
		}
		long start = new Date().getTime();
		Object obj = pjp.proceed();
		System.out.println("time aspect 耗时："+  (new Date().getTime() - start));
		
		System.out.println("time aspect end");
		return obj;
	}
}
