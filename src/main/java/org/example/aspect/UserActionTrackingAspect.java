package org.example.aspect;

import lombok.extern.java.Log;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Log
@Component
@Aspect
public class UserActionTrackingAspect {

    @Before("@annotation(org.example.aspect.TrackUserAction)")
    public void trackUserAction(JoinPoint joinPoint) {
        String user = "currentUser"; // Пример
        String methodName = joinPoint.getSignature().toString();
        Object[] args = joinPoint.getArgs();


        System.out.println("Перехваченный метод: " + methodName);

        log.info("Ползователь " + user + " вызван " + methodName + " с аргументами: " + Arrays.toString(args));
    }

}
