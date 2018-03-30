package com.epam.springsecurityapp.service;

import com.epam.springsecurityapp.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);


}
