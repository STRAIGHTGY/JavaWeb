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
 * 布局查询条件
 * </p>
 *
 * @author 鲲鹏
 * @since 2020-05-03
 */
@Data
public class LayoutQuery extends BaseQuery {

    /**
     * 类型：1新闻资讯 2其他
     */
    private Integer type;

}
