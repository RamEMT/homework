package com.mybatis.homework.mapper;

import com.mybatis.homework.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: Ram
 * @Since: 2020.10.27 19:43
 */
public interface UserMapper {
    /**
     * 获取用户信息、地址
     * @param uid 通过用户id
     * @return 集合
     */
    List<User> selectUserById(@Param("uid") Integer uid);
}
