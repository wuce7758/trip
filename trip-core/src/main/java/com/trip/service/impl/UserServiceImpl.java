package com.trip.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
    public PageInfo<User> getUserPage(int pageIndex, int pageSize) {
        PageHelper.startPage(pageIndex, pageSize);
        Example example = new Example(User.class);
        List<User> list = super.selectList(example);
        return new PageInfo<User>(list);
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
