package com.mybatis.homework;

import com.mybatis.homework.entity.Address;
import com.mybatis.homework.mapper.AddressMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * @Author: Ram
 * @Since: 2020.10.27 21:03
 */
public class TestMain2 {
    public static void main(String[] args) {
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(
                TestMain.class.getClassLoader().getResourceAsStream("mybatis-config.xml")
        );

        SqlSession sqlSession = sessionFactory.openSession(true);
        AddressMapper addressMapper = sqlSession.getMapper(AddressMapper.class);

        Address address = new Address();
        address.setProvince("广西省");
        address.setCity("南宁市");
        address.setDistrict("兴宁区");
        address.setDetailed("朝阳广场");
        address.setUid(2);
        int i = addressMapper.insertAddress(address);


        
    }
}
