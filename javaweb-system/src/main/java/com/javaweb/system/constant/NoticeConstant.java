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
 * 通知公告 模块常量
 * </p>
 *
 * @author 鲲鹏
 * @since 2020-05-04
 */
public class NoticeConstant {

    /**
     * 通知来源
     */
    public static Map<Integer, String> NOTICE_SOURCE_LIST = new HashMap<Integer, String>() {
        {
            put(1, "云平台");
        }
    };
    /**
     * 是否置顶
     */
    public static Map<Integer, String> NOTICE_ISTOP_LIST = new HashMap<Integer, String>() {
        {
            put(1, "已置顶");
            put(2, "未置顶");
        }
    };
    /**
     * 发布状态
     */
    public static Map<Integer, String> NOTICE_STATUS_LIST = new HashMap<Integer, String>() {
        {
            put(1, "草稿箱");
            put(2, "立即发布");
            put(3, "定时发布");
        }
    };
    /**
     * 推送状态
     */
    public static Map<Integer, String> NOTICE_ISSEND_LIST = new HashMap<Integer, String>() {
        {
            put(1, "已推送");
            put(2, "未推送");
        }
    };
}