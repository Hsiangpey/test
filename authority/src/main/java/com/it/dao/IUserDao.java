package com.it.dao;

import com.it.entity.User;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;



public interface IUserDao {

    @Select("select * from user where username = #{username}")
    @Results({
            @Result(id = true,property = "id",column = "id"),
            @Result(column = "username",property = "username"),
            @Result(column = "username",property = "password")
    })
    public User findUserInfoByUserName(String userName);

}
