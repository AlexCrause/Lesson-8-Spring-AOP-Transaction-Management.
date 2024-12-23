package org.example.service;

import org.example.aspect.TrackUserAction;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @TrackUserAction
    public void createUser(String username, String password) {
        // Логика создания пользователя
        System.out.println("Создание пользователя с именем пользователя: " + username);
    }

    @TrackUserAction
    public void deleteUser(String username) {
        // Логика удаления пользователя
        System.out.println("Удаление пользователя с именем пользователя: " + username);
    }
}
