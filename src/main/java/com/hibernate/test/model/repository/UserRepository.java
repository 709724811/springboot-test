package com.hibernate.test.model.repository;

import com.hibernate.test.model.entity.User;
import org.hibernate.annotations.SQLInsert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * @Description OR映射
 * @Author LANRY
 * @Date 2018-11-19 14:18
 * @Company www.midea.com
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    /**
     * 模糊查询
     * @param name 姓名
     * @return
     */
    @Query(value="from User where name like CONCAT('%',:name,'%')")
    List<User> findUserByUsernameLike(@Param("name") String name);

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    @Query("from User where id = :id")
    User getUserById(@Param("id") Integer id);

    /**
     * 保存用户信息
     * @param user 用户
     * @return 返回用户信息
     */
    @Modifying
    @SQLInsert(sql="insert into t_user (name,age,number) values (?1, ?2, ?3)")
    @Override
    User save(@Param("user") User user);
}
