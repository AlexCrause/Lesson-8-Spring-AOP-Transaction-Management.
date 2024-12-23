package org.example;

import org.example.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * 6. Домашнее задание
 * Вам необходимо разработать механизм регистрации действий пользователя в вашем Spring Boot приложении.
 * Используйте SpringAOP для создания журнала действий, в котором будет сохраняться информация о том,
 * какие методы сервиса вызывались, кеми с какими параметрами.
 *
 * 1. Создайте аннотацию `@TrackUserAction`.
 * 2. Реализуйте aspect, который будет регистрировать действия
 * пользователя, когда вызывается метод, отмеченный этой аннотацией.
 * 3. Примените аннотацию `@TrackUserAction` к нескольким методам в слое сервиса.
 * 4. Результаты регистрации сохраните в лог-файл
 */
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        var context = SpringApplication.run(Main.class, args);

        var userService = context.getBean(UserService.class);

        userService.createUser("Вася", "123");
        userService.deleteUser("Вася");
    }
}