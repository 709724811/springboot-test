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

    @Query("from User where name = :name")
    List<User> findUserByUsernameLike(@Param("name") String name);

    @Query("from User where id = :id")
    User getUserById(@Param("id") Integer id);

    /**
     *
     * @param user 用户
     * @return
     */
    @Modifying
    @SQLInsert(sql="insert into t_user (name,age,number) values (?1, ?2, ?3)")
    @Override
    User save(@Param("user") User user);
}
