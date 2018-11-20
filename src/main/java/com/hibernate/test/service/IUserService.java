package com.hibernate.test.service;

import com.hibernate.test.common.ListResult;
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

    /**
     * 模糊查询用户信息
     * @param name 用户姓名
     * @return
     */
    ListResult<User> findUserByUsernameLike(String name);

    /**
     * 根据用户id查询用户信息
     * @param id 用户id
     * @return
     */
    ModelResult<User> getUserById(Integer id);

    /**
     * 保存用户信息
     * @param user 用户信息
     * @return
     */
    ModelResult<Integer> saveUser(User user);

}
