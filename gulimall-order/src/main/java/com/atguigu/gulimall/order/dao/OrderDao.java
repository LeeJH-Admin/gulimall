package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author lijinghuan
 * @email 694685792@qq.com
 * @date 2022-09-07 22:38:42
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
