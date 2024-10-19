package me.david.java_bootcamp.service;

import me.david.java_bootcamp.domain.model.User;

public interface UserService {

    User FindById(Long id);

    User create(User usertoCreate);

}
