package com.atguigu.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * ้่ดงๅๅ 
 *
 * @author lijinghuan
 * @email 694685792@qq.com
 * @date 2022-09-07 22:38:41
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

