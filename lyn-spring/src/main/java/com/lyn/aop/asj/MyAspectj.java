package com.lyn.aop.asj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @program: spring
 * @author: lyn
 * * @create: 2020-07-11 16:32
 **/
// 声明一个切面
@Component
@Aspect
public class MyAspectj {

	// 声明一个切点
	@Pointcut("execution(* com.lyn.aop.service.*.*(..))")
	public void myPointcut(){
		System.out.println("调用对应的切点: myPointcut()");
	}

	// 设置一个通知

	/**
	 *  切面通知类
	 *  new AspectJAroundAdvice(candidateAdviceMethod, expressionPointcut, aspectInstanceFactory);
	 *  new AspectJMethodBeforeAdvice(// 切面通知类
	 * 						candidateAdviceMethod, expressionPointcut, aspectInstanceFactory);
	 *
	 * 	new AspectJAfterAdvice(// 切面通知类
	 * 						candidateAdviceMethod, expressionPointcut, aspectInstanceFactory);
	 * 	new AspectJAfterReturningAdvice(// 切面通知类
	 * 						candidateAdviceMethod, expressionPointcut, aspectInstanceFactory);
	 */
	@Before(value = "myPointcut()")
	public void mybefore(JoinPoint joinPoint){
		// 获取目标方法的名字
		String methodName = joinPoint.getSignature().getName();
		System.out.println("mybefore....., 目标方法的名字:  " + methodName);
	}

	@After(value = "myPointcut()")
	public void myafter(JoinPoint joinPoint){
		String methodName = joinPoint.getSignature().getName();
		System.out.println("myafter......, 目标方法的名字: " + methodName);
	}


	@AfterReturning(value = "myPointcut()",returning = "result")
	public void methodReturning(JoinPoint joinPoint,Object result) {
		System.out.println(result);
		String methodName = joinPoint.getSignature().getName();
		System.out.println("执行目标方法【"+methodName+"】之前执行<返回通知>,入参"+ Arrays.asList(joinPoint.getArgs()));
	}

	@AfterThrowing(value = "myPointcut()")
	public void methodAfterThrowing(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();

		System.out.println("执行目标方法【"+methodName+"】之前执行<异常通知>,入参"+Arrays.asList(joinPoint.getArgs()));
	}


}


