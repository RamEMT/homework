package com.mybatis.homework.mapper;

import com.mybatis.homework.entity.Address;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: Ram
 * @Since: 2020.10.27 19:43
 */
public interface AddressMapper {
    /**
     * 用户添加地址
     *
     * @param address 地址信息
     * @return 影响行数
     */
    int insertAddress(@Param("address") Address address);

    /**
     *  修改默认地址
     * @param aid 地址id
     * @return 影响行数
     */
    int updateDefaultAddress(@Param("aid") Integer aid);

    /**
     *  修改地址信息
     * @param address 地址
     * @return 影响行数
     */
    int updateAddress(@Param("address") Address address);

    /**
     * 业务删除地址
     * @param aid 通过地址id
     * @return 影响行数
     */
    int deleteAddress(@Param("aid") Integer aid);

}
