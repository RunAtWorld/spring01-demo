
package dev.lpf.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * 功能描述
 *
 * @author l00523381
 * @since 2019-09-20
 */
@Component
@Aspect
public class ServiceLogAspect {

    @Pointcut("execution(* dev.lpf.demo.aop.*.service..*(..))")
    public void pointcut() {
    }

    @Before("pointcut()")
    public void doBefore(JoinPoint joinPoint) {
        System.out.printf("开始执行方法: %s ==> %s ...%n", joinPoint.getSignature().getDeclaringType(),
            joinPoint.getSignature().getName());
        System.out.printf("参数: %s  ...%n", Arrays.asList(joinPoint.getArgs()));
    }

    @After("pointcut()")
    public void doAfter(JoinPoint joinPoint) {
        System.out.println("" + joinPoint.getSignature().getName() + "执行结束...");
    }

    @AfterReturning(value = "pointcut()", returning = "returnObject")
    public void doReturn(JoinPoint joinPoint, Object returnObject) {
        System.out.println("方法:" + joinPoint.getSignature().getName()  + " 正常返回,返回值" + returnObject);
    }

    @Around(value = "pointcut()")
    public Object doAround(ProceedingJoinPoint joinPoint) {
        Object ret=null;
        try {
            System.out.println("环绕方法:" + joinPoint.getSignature().getName() +"开始");
            ret = joinPoint.proceed();
        } catch (Throwable e) {
            // e.printStackTrace();
            // throw e;
            System.out.println("环绕时获取到异常信息：" + e.getMessage());
        } finally {
            System.out.println("环绕  方法:" + joinPoint.getSignature().getName() +"结束");
        }
        return ret;
    }

    @AfterThrowing(value = "pointcut()", throwing = "exception")
    public void doException(JoinPoint joinPoint, Exception exception) {
        System.out.println("方法:" + joinPoint.getSignature().getName() + " 运行出现异常: " + exception.getMessage());
    }

}
