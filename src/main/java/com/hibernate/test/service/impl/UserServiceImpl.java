package com.hibernate.test.service.impl;

import com.hibernate.test.common.ModelResult;
import com.hibernate.test.model.repository.UserRepository;
import com.hibernate.test.model.entity.User;
import com.hibernate.test.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description  用户服务
 * @Author LANRY
 * @Date 2018-11-19 14:24
 * @Company www.midea.com
 */
@Service("iUserService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public ModelResult<List<User>> findUserByUsernameLike(String name) {
        ModelResult<List<User>> result = new ModelResult<>();
        List<User> userList =  userRepository.findUserByUsernameLike(name);
        result.setResult(userList);
        return result;
    }

    @Override
    public ModelResult<User> getUserById(Integer id) {
        ModelResult<User> result = new ModelResult<>();
        User user = userRepository.getUserById(id);
        result.setResult(user);
        return result;
    }

    @Override
    public ModelResult<Integer> saveUser(User user) {
        ModelResult<Integer> result = new ModelResult<>();
        user = userRepository.save(user);
        result.setResult(user.getId());
        return result;
    }
}
