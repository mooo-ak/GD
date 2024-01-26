package com.min.edu.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DaoLogAop_XML {

	public void adoPointCut() {}
	
	   public void before(JoinPoint j) {
	      Logger logger = LoggerFactory.getLogger(j.getTarget() + "");
	      logger.info("[AOP Logger] Dao 메소드 실행 전");
	      Object[] args = j.getArgs();
	      
	      if(args != null) {
	         logger.info("[AOP logger] {}", j.getSignature().getName());
	         for(int i=0; i<args.length; i++) {
	            logger.info(i + "번째 Object : {}", args[i]);
	         }
	         logger.info("[AOP logger] {}", j.getSignature().getName());
	      }
	      
	   }
	   
	   public void after(JoinPoint j, Object returnValue) {
	      Logger logger = LoggerFactory.getLogger(j.getTarget() + "");
	      logger.info("[AOP logger] 반환결과 : \t {}", returnValue);
	   }
	   
	   public void afterThrowing(JoinPoint j, Exception error) {
	      Logger logger = LoggerFactory.getLogger(j.getTarget() + "");
	      logger.info("[AOP logger] 오류 : \t {}", error.getMessage());
	   }
	
}
