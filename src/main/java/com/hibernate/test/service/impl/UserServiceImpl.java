package com.hibernate.test.service.impl;

import com.hibernate.test.common.ListResult;
import com.hibernate.test.common.ModelResult;
import com.hibernate.test.enums.ResultCodeEnum;
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
    public ListResult<User> findUserByUsernameLike(String name) {
        ListResult<User> result = new ListResult<>();
        List<User> userList =  userRepository.findUserByUsernameLike(name);
        result.withError(ResultCodeEnum.SUCCESS);
        result.setResult(userList);
        return result;
    }

    @Override
    public ModelResult<User> getUserById(Integer id) {
        ModelResult<User> result = new ModelResult<>();
        User user = userRepository.getUserById(id);
        result.withError(ResultCodeEnum.SUCCESS);
        result.setResult(user);
        return result;
    }

    @Override
    public ModelResult<Integer> saveUser(User user) {
        ModelResult<Integer> result = new ModelResult<>();
        user = userRepository.save(user);
        result.withError(ResultCodeEnum.SUCCESS);
        result.setResult(user.getId());
        return result;
    }
}
