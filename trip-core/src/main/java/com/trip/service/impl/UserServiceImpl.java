package com.trip.service.impl;

import com.trip.base.BaseServiceImpl;
import com.trip.model.User;
import com.trip.service.UserService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {

    @Override
    public List<User> getUsers() {
        Example example = new Example(User.class);
        return super.selectList(example);
    }

    @Override
    public User getByUID(Long uid) {
        return super.selectByPrimaryKey(uid);
    }

    @Override
    public int save(User user) {
        return super.save(user);
    }

    @Override
    public int delete(Long uid) {
        return super.delete(uid);
    }
}
