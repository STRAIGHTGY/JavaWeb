// +----------------------------------------------------------------------
// | JavaWeb混编版框架 [ JavaWeb ]
// +----------------------------------------------------------------------
// | 版权所有 2019~2020 南京JavaWeb研发中心
// +----------------------------------------------------------------------
// | 官方网站: http://www.javaweb.vip/
// +----------------------------------------------------------------------
// | 作者: 鲲鹏 <1175401194@qq.com>
// +----------------------------------------------------------------------

package com.javaweb.admin.dto;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 商品SKU列表Dto
 */
@Data
public class ProductSkuListDto {

    /**
     * SKU值
     */
    private String attributeValue;

    /**
     * 商品图片
     */
    private String productPic;

    /**
     * 销售价
     */
    private BigDecimal price;

    /**
     * 成本价
     */
    private BigDecimal costPrice;

    /**
     * 原价
     */
    private BigDecimal originalPrice;

    /**
     * 库存
     */
    private Integer stock;

    /**
     * SKU编码
     */
    private String skuCode;

    /**
     * 体积(m³)
     */
    private BigDecimal volume;

    /**
     * 重量(KG)
     */
    private BigDecimal weight;

    /**
     * 状态：1在用 2停用
     */
    private Integer status;

}
