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
 * 消息模板 模块常量
 * </p>
 *
 * @author 鲲鹏
 * @since 2020-05-04
 */
public class MessageTemplateConstant {

    /**
     * 模板类型
     */
    public static Map<Integer, String> MESSAGETEMPLATE_TYPE_LIST = new HashMap<Integer, String>() {
        {
            put(1, "系统模板");
            put(2, "短信模板");
            put(3, "邮件模板");
            put(4, "微信模板");
            put(5, "推送模板");
        }
    };
    /**
     * 状态
     */
    public static Map<Integer, String> MESSAGETEMPLATE_STATUS_LIST = new HashMap<Integer, String>() {
        {
            put(1, "在用");
            put(2, "停用");
        }
    };
}