package com.trip.service;


import com.trip.model.User;

import java.util.List;

public interface UserService {

    List<User> getUsers();

    User getByUID(Long uid);

    int save(User user);

    int delete(Long uid);

}
