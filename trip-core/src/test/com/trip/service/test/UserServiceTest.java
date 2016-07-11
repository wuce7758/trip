package com.trip.service.test;


import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.trip.model.User;
import com.trip.service.UserService;
import com.trip.test.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceTest extends BaseTest {

    @Autowired
    private UserService userService;

    @Test
    public void testUsers(){
        System.out.println(userService.getUsers());
    }

    @Test
    public void testUsersPage(){
        PageInfo<User> userPage = userService.getUserPage(1, 2);
        System.out.println(JSON.toJSONString(userPage));
    }


}
