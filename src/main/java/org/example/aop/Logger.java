package org.example.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Logger {


    @Before("@annotation(loggable)")
    public void logSomething(JoinPoint joinPoint,
                             Loggable loggable){

        System.out.printf("Making some good stuff in %s %d times%n",
                joinPoint.getSignature().getName(),
                loggable.count());

        for(int i =0; i< loggable.count(); i++){
            System.out.println(loggable.name() + ": " + "LoggingMessage");
        }
    }
}
