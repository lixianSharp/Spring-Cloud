package com.atguigu.springcloud.alibaba.dao;

import com.atguigu.springcloud.alibaba.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author lxy
 * @Date 2020/8/11
 * @Descript
 **/
@Mapper
public interface PaymentDao {

    /**
     * 新增
     * @param payment
     * @return
     */
    public int create(Payment payment);


    /**
     * 查询
     * @param id
     * @return
     */
    public Payment getPaymentById(@Param("id") Long id);
}
