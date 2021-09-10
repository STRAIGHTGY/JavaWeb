// +----------------------------------------------------------------------
// | JavaWeb混编版框架 [ JavaWeb ]
// +----------------------------------------------------------------------
// | 版权所有 2019~2020 南京JavaWeb研发中心
// +----------------------------------------------------------------------
// | 官方网站: http://www.javaweb.vip/
// +----------------------------------------------------------------------
// | 作者: 鲲鹏 <1175401194@qq.com>
// +----------------------------------------------------------------------

package com.javaweb.admin.controller;


import com.javaweb.common.utils.JsonResult;
import com.javaweb.common.annotation.Log;
import com.javaweb.common.enums.BusinessType;
import com.javaweb.admin.entity.Test2;
import com.javaweb.admin.query.Test2Query;
import com.javaweb.admin.service.ITest2Service;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.javaweb.common.common.BaseController;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 测试案例 控制器
 * </p>
 *
 * @author 鲲鹏
 * @since 2021-01-29
 */
@Controller
@RequestMapping("/test2")
public class Test2Controller extends BaseController {

    @Autowired
    private ITest2Service test2Service;

    /**
     * 获取数据列表
     *
     * @param query 查询条件
     * @return
     */
    @RequiresPermissions("sys:test2:list")
    @ResponseBody
    @PostMapping("/list")
    public JsonResult list(Test2Query query) {
        return test2Service.getList(query);
    }

    /**
     * 添加记录
     *
     * @param entity 实体对象
     * @return
     */
    @RequiresPermissions("sys:test2:add")
    @Log(title = "测试案例", businessType = BusinessType.INSERT)
    @ResponseBody
    @PostMapping("/add")
    public JsonResult add(@RequestBody Test2 entity) {
        return test2Service.edit(entity);
    }

    /**
     * 修改记录
     *
     * @param entity 实体对象
     * @return
     */
    @RequiresPermissions("sys:test2:update")
    @Log(title = "测试案例", businessType = BusinessType.UPDATE)
    @ResponseBody
    @PostMapping("/update")
    public JsonResult update(@RequestBody Test2 entity) {
        return test2Service.edit(entity);
    }

    /**
     * 获取记录详情
     *
     * @param id    记录ID
     * @param model 模型
     * @return
     */
    @Override
    public String edit(Integer id, Model model) {
        Map<String, Object> info = new HashMap<>();
        if (id != null && id > 0) {
            info = test2Service.info(id);
        }
        model.addAttribute("info", info);
        return super.edit(id, model);
    }

    /**
     * 删除记录
     *
     * @param id 记录ID
     * @return
     */
    @RequiresPermissions("sys:test2:delete")
    @Log(title = "测试案例", businessType = BusinessType.DELETE)
    @ResponseBody
    @GetMapping("/delete/{id}")
    public JsonResult delete(@PathVariable("id") Integer id) {
        return test2Service.deleteById(id);
    }
	
	/**
     * 批量删除
     *
     * @param ids 记录ID
     * @return
     */
    @RequiresPermissions("sys:test2:dall")
    @Log(title = "测试案例", businessType = BusinessType.BATCH_DELETE)
    @ResponseBody
    @GetMapping("/batchDelete/{ids}")
    public JsonResult batchDelete(@PathVariable("ids") String ids) {
        return test2Service.deleteByIds(ids);
    }

}
