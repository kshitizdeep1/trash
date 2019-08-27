package com.asp.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoginAspect {

	@Around("execution(public * get*())")
	public Object myAroundAdvice(ProceedingJoinPoint proceedJoinPoint) throws Throwable
	{
		Object object=null;
		
			System.out.println("Before Advice");
			object=proceedJoinPoint.proceed();
			System.out.println("After Returning Advice");		
		    return object;
	}
}
