// +----------------------------------------------------------------------
// | JavaWeb混编版框架 [ JavaWeb ]
// +----------------------------------------------------------------------
// | 版权所有 2019~2020 南京JavaWeb研发中心
// +----------------------------------------------------------------------
// | 官方网站: http://www.javaweb.vip/
// +----------------------------------------------------------------------
// | 作者: 鲲鹏 <1175401194@qq.com>
// +----------------------------------------------------------------------

package com.javaweb.system.service;

import com.javaweb.system.entity.ItemCate;
import com.javaweb.common.common.IBaseService;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 栏目 服务类
 * </p>
 *
 * @author 鲲鹏
 * @since 2020-05-03
 */
public interface IItemCateService extends IBaseService<ItemCate> {

    /**
     * 根据栏目ID获取栏目名称
     * @param cateId 栏目ID
     * @param delimiter 拼接字符
     * @return
     */
    String getCateNameByCateId(Integer cateId, String delimiter);

    /**
     * 根据站点ID获取栏目
     *
     * @param itemId   站点ID
     * @param pid 栏目ID
     * @return
     */
    List<Map<String, Object>> getItemCateListByItemId(Integer itemId, Integer pid);

}