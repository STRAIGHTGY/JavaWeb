// +----------------------------------------------------------------------
// | JavaWeb混编版框架 [ JavaWeb ]
// +----------------------------------------------------------------------
// | 版权所有 2019~2020 南京JavaWeb研发中心
// +----------------------------------------------------------------------
// | 官方网站: http://www.javaweb.vip/
// +----------------------------------------------------------------------
// | 作者: 鲲鹏 <1175401194@qq.com>
// +----------------------------------------------------------------------

package com.javaweb.system.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 部门列表Vo
 * </p>
 *
 * @author 鲲鹏
 * @since 2020-05-03
 */
@Data
public class DeptListVo {

    /**
     * 部门ID
     */
    private Integer id;

    /**
     * 部门名称
     */
    private String name;

    /**
     * 上级ID
     */
    private Integer pid;

    /**
     * 类型：1公司 2部门
     */
    private Integer type;

    /**
     * 类型描述
     */
    private String typeName;

    /**
     * 是否有子级：1是 2否
     */
    private Integer hasChild;

    /**
     * 是否有子级描述
     */
    private String hasChildName;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 添加人
     */
    private Integer createUser;

    /**
     * 添加人名称
     */
    private String createUserName;

    /**
     * 添加时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private Date createTime;

    /**
     * 更新人
     */
    private Integer updateUser;

    /**
     * 更新人名称
     */
    private String updateUserName;

    /**
     * 更新时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private Date updateTime;

}