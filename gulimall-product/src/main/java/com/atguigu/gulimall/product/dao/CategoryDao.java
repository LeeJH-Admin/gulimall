package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author lijinghuan
 * @email 694685792@qq.com
 * @date 2022-09-04 23:58:32
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
