package com.dao;


import com.pojo.User;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserDao extends tk.mybatis.mapper.common.Mapper<User> {
}