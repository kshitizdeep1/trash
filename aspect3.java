package com.asp.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoginAspect {

	@Before("allGetters() && allCircleMethods()")
		public void login()
		{
			System.out.println("login happend");
		}
	@Pointcut("execution(* get*())")
	public void allGetters()
	{
		
	}
	@Pointcut("within(com.asp.shapes.*)") 
	public void allCircleMethods()
	{
		
	}
}
