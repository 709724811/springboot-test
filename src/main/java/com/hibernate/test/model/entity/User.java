package com.hibernate.test.model.entity;

import com.hibernate.test.common.BaseEntity;

import javax.persistence.*;

/**
 * @Description 用户实体
 * @Author LANRY
 * @Date 2018-11-19 11:37
 * @Company www.midea.com
 */
@Entity
@Table(name = "t_user")
public class User extends BaseEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Integer age;

    private Integer number;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
