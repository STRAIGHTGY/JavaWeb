// +----------------------------------------------------------------------
// | JavaWeb混编版框架 [ JavaWeb ]
// +----------------------------------------------------------------------
// | 版权所有 2019~2020 南京JavaWeb研发中心
// +----------------------------------------------------------------------
// | 官方网站: http://www.javaweb.vip/
// +----------------------------------------------------------------------
// | 作者: 鲲鹏 <1175401194@qq.com>
// +----------------------------------------------------------------------

package com.javaweb.system.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 广告位描述 模块常量
 * </p>
 *
 * @author 鲲鹏
 * @since 2020-05-01
 */
public class AdSortConstant {

    /**
     * 站点类型
     */
    public static Map<Integer, String> ADSORT_PLATFORM_LIST = new HashMap<Integer, String>() {
        {
            put(1, "PC网站");
            put(2, "WAP手机站");
            put(3, "微信小程序");
            put(4, "APP移动端");
        }
    };
}