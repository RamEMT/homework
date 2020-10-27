package com.mybatis.homework;

import com.mybatis.homework.entity.User;
import com.mybatis.homework.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.util.List;

/**
 * @Author: Ram
 * @Since: 2020.10.27 20:14
 */
public class TestMain {

    public static void main(String[] args) {

        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(
                TestMain.class.getClassLoader().getResourceAsStream("mybatis-config.xml")
        );

        SqlSession sqlSession = sessionFactory.openSession(true);

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        List<User> users = userMapper.selectUserById(1);

        //获取地址信息
        users.forEach(System.out::println);

    }
}
