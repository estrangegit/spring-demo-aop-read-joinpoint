package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

@Aspect
@Component
@Order(1)
public class MyDemoLoggingAspect {
				
	@Before("com.luv2code.aopdemo.aspect.LuvAopExpressions.forDaoPackageNoGetterSetter()")
	public void beforeAnyMethodInDaoPackage(JoinPoint theJoinPoint) {
		System.out.println("\n=====>>> Executing @Before any method of any class in com.luv2code.aopdemo.dao");
		
		// display the method signature
		MethodSignature methodSig = (MethodSignature) theJoinPoint.getSignature(); 
		
		System.out.println("Method: " + methodSig);
		
		// display the method arguments
		// get args
		Object[] args = theJoinPoint.getArgs();
		
		// loop through args
		for (Object arg : args) {			
			if(arg instanceof Account) {
				// downcast and print Account specific stuff
				Account theAccount = (Account)arg;
				System.out.println("account name: " + theAccount.getName());
				System.out.println("account level: " + theAccount.getLevel());				
			}else {
				System.out.println(arg);				
			}
		}
	}		
}
