package com.trip.service;


import com.github.pagehelper.PageInfo;
import com.trip.model.User;

import java.util.List;

public interface UserService {

    List<User> getUsers();

    PageInfo<User> getUserPage(int pageIndex, int pageSize);

    User getByUID(Long uid);

    int save(User user);

    int delete(Long uid);

}
