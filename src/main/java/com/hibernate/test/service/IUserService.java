package com.hibernate.test.service;

import com.hibernate.test.common.ModelResult;
import com.hibernate.test.model.entity.User;

import java.util.List;

/**
 * @Description
 * @Author LANRY
 * @Date 2018-11-19 14:23
 * @Company www.midea.com
 */
public interface IUserService {

    ModelResult<List<User>> findUserByUsernameLike(String name);

    ModelResult<User> getUserById(Integer id);

    ModelResult<Integer> saveUser(User user);

}
