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
 * 登录日志 模块常量
 * </p>
 *
 * @author 鲲鹏
 * @since 2020-05-04
 */
public class LoginLogConstant {

    /**
     * 登录状态
     */
    public static Map<Integer, String> LOGINLOG_STATUS_LIST = new HashMap<Integer, String>() {
        {
            put(1, "成功");
            put(2, "失败");
        }
    };
    /**
     * 类型
     */
    public static Map<Integer, String> LOGINLOG_TYPE_LIST = new HashMap<Integer, String>() {
        {
            put(1, "登录系统");
            put(2, "退出系统");
        }
    };
}