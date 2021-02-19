package org.comstudy21.myweb.common;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class LogAdvice {
	@Pointcut("execution(* org.comstudy21.myweb..*Impl.get*(..))")
	public void getPointcut() {}
	
	@Before("H2DbCtrl.allPointcut()")
	public void printLogAll(JoinPoint jp) {
		System.out.println("[공통로그] 모든 비즈니스 로직 수행 전에 실행 ...");
	}
	
	@AfterReturning(pointcut="getPointcut()", returning = "returnObj")
	public void printLogGet(JoinPoint jp, Object returnObj) {
		String method = jp.getSignature().getName();
		System.out.println("[return 후 처리] " + method);
		System.out.println("returnObj => " + returnObj.toString());
	}
}
