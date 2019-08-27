package com.asp.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import com.asp.shapes.Circle;

@Aspect
public class LoginAspect {

	@Before("allGetters()&&allMethods()")
	public void login()
	{
		System.out.println("hjgfgas");
	}
		/*public void login(JoinPoint joinPoint )
		{
			Circle circle=(Circle)joinPoint.getTarget();
			System.out.println(circle.getName()+" "+"advice");
		}*/
	@Pointcut("execution( * get*())")
	public void allGetters()
	{
		
	}
	@Pointcut("within(com.asp.shapes.Circle)")
	public void allMethods()
	{
		
	}
}
