package com.trip.service.test;


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

}
