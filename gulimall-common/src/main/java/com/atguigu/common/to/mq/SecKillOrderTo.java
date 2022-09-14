package com.atguigu.common.to.mq;

import lombok.Data;

import java.math.BigDecimal;

/**
 * <p>Title: SecKillOrderTo</p>
 */
@Data
public class SecKillOrderTo {

	/**
	 * 订单号
	 */
	private String orderSn;

	private Long promotionSessionId;//活动场次
	/**
	 * 商品id
	 */
	private Long skuId;
	/**
	 * 秒杀价格
	 */
	private BigDecimal seckillPrice;
	/**
	 * 购买数量
	 */
	private Integer num;

	//会员id
	private Long memberId;




}
