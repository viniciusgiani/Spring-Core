package com.springcore.AOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class CalculatorLoggingAspect {
    private final Logger log = LoggerFactory.getLogger(this.getClass());
    @Before("execution(* ArithmeticCalculator.add(..))")
    public void logBefore(JoinPoint joinPoint) {
        var name = joinPoint.getSignature().getName();
        var args = Arrays.toString(joinPoint.getArgs());
        log.info("The method {}() begins with {} ", name , args);
    }

    @After("execution(* *.*(..))")
    public void logAfter(JoinPoint joinPoint) {
        var name = joinPoint.getSignature().getName();
        log.info("The method {}() ends", name);
    }

    @AfterReturning("execution(* *.*(..))")
    public void logAfterReturning(JoinPoint joinPoint) {
        var name = joinPoint.getSignature().getName();
        log.info("The method {}() has ended.", name);
    }

    @AfterReturning(
            pointcut = "execution(* *.*(..))",
            returning = "result")
    public void logAfterReturning(JoinPoint joinPoint, Object result) {
        var name = joinPoint.getSignature().getName();
        log.info("The method {}() ends with {}", name, result);
    }

    @AfterThrowing("execution(* *.*(..))")
    public void logAfterThrowing(JoinPoint joinPoint) {
        var name = joinPoint.getSignature().getName();
        log.error("An exception has been thrown in {}()", name);
    }

    @AfterThrowing(pointcut = "execution(* *.*(..))", throwing = "ex")
    public void logAfterThrowing(JoinPoint joinPoint, Throwable ex) {
        var name = joinPoint.getSignature().getName();
        log.error("An exception {} has been thrown in {}()", ex, name);
    }

    @Around("execution(* *.*(..))")
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        var name = joinPoint.getSignature().getName();
        var args = Arrays.toString(joinPoint.getArgs());
        log.info("The method {}() begins with {}.", name, args);
    try {
        var result = joinPoint.proceed();
        log.info("The method {}() ends with {}.", name, result);
        return result;
    }
    catch (IllegalArgumentException ex) {
        log.error("Illegal argument {} in {}()", args, name);
        throw ex;
    }
    }
}
