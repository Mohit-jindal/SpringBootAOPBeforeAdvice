package com.infotech.app.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.infotech.app.model.Account;

@Aspect
@Component
public class AccountServiceAspect {

	@AfterReturning(value = "execution(* com.infotech.app.service.impl.AccountServiceImpl.*(..))",returning = "account")
	public void afterReturningAdvice(JoinPoint joinPoint, Account account)
	{
		System.out.println("After Returning method:" + joinPoint.getSignature());
		System.out.println("Account:"+account);
	}
	
	@AfterThrowing(value = "execution(* com.infotech.app.service.impl.AccountServiceImpl.*(..))",throwing = "ex")
	public void afterThrowingAdvice(JoinPoint joinPoint, Exception ex)
	{
		System.out.println("After Throwing exception in method:" + joinPoint.getSignature());
		System.out.println("Exception is:"+ex);
	}
}
