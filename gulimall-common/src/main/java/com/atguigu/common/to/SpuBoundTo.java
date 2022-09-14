package com.atguigu.common.to;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class SpuBoundTo {
    private long spuId;
    private BigDecimal buyBounds;
    private BigDecimal growBounds;

}
