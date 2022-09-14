package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author lijinghuan
 * @email 694685792@qq.com
 * @date 2022-09-05 23:36:32
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
