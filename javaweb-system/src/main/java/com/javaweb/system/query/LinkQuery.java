// +----------------------------------------------------------------------
// | JavaWeb混编版框架 [ JavaWeb ]
// +----------------------------------------------------------------------
// | 版权所有 2019~2020 南京JavaWeb研发中心
// +----------------------------------------------------------------------
// | 官方网站: http://www.javaweb.vip/
// +----------------------------------------------------------------------
// | 作者: 鲲鹏 <1175401194@qq.com>
// +----------------------------------------------------------------------

package com.javaweb.system.query;

import com.javaweb.common.common.BaseQuery;
import lombok.Data;

/**
 * <p>
 * 友链查询条件
 * </p>
 *
 * @author 鲲鹏
 * @since 2020-05-03
 */
@Data
public class LinkQuery extends BaseQuery {

    /**
     * 友链名称
     */
    private String name;

    /**
     * 类型：1友情链接 2合作伙伴
     */
    private Integer type;

    /**
     * 平台：1PC站 2WAP站 3微信小程序 4APP应用
     */
    private Integer platform;

    /**
     * 友链形式：1文字链接 2图片链接
     */
    private Integer form;

    /**
     * 状态：1在用 2停用
     */
    private Integer status;

}
