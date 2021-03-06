// +----------------------------------------------------------------------
// | JavaWeb混编版框架 [ JavaWeb ]
// +----------------------------------------------------------------------
// | 版权所有 2019~2020 南京JavaWeb研发中心
// +----------------------------------------------------------------------
// | 官方网站: http://www.javaweb.vip/
// +----------------------------------------------------------------------
// | 作者: 鲲鹏 <1175401194@qq.com>
// +----------------------------------------------------------------------

package com.javaweb.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.javaweb.common.common.BaseQuery;
import com.javaweb.system.common.BaseServiceImpl;
import com.javaweb.common.config.CommonConfig;
import com.javaweb.common.utils.CommonUtils;
import com.javaweb.common.utils.JsonResult;
import com.javaweb.common.utils.StringUtils;
import com.javaweb.admin.constant.Test2Constant;
import com.javaweb.admin.entity.Test2;
import com.javaweb.admin.mapper.Test2Mapper;
import com.javaweb.admin.query.Test2Query;
import com.javaweb.admin.service.ITest2Service;
import com.javaweb.system.utils.UserUtils;
import com.javaweb.admin.vo.Test2ListVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 测试案例 服务实现类
 * </p>
 *
 * @author 鲲鹏
 * @since 2021-01-29
 */
@Service
public class Test2ServiceImpl extends BaseServiceImpl<Test2Mapper, Test2> implements ITest2Service {

    @Autowired
    private Test2Mapper test2Mapper;

    /**
     * 获取数据列表
     *
     * @param query 查询条件
     * @return
     */
    @Override
    public JsonResult getList(BaseQuery query) {
        Test2Query test2Query = (Test2Query) query;
        // 查询条件
        QueryWrapper<Test2> queryWrapper = new QueryWrapper<>();
        // 级别名称
        if (!StringUtils.isEmpty(test2Query.getName())) {
            queryWrapper.like("name", test2Query.getName());
        }
        queryWrapper.eq("mark", 1);
        queryWrapper.orderByDesc("id");

        // 查询数据
        IPage<Test2> page = new Page<>(test2Query.getPage(), test2Query.getLimit());
        IPage<Test2> data = test2Mapper.selectPage(page, queryWrapper);
        List<Test2> test2List = data.getRecords();
        List<Test2ListVo> test2ListVoList = new ArrayList<>();
        if (!test2List.isEmpty()) {
            test2List.forEach(item -> {
                Test2ListVo test2ListVo = new Test2ListVo();
                // 拷贝属性
                BeanUtils.copyProperties(item, test2ListVo);
                // 添加人名称
                if (test2ListVo.getCreateUser() != null && test2ListVo.getCreateUser() > 0) {
                    test2ListVo.setCreateUserName(UserUtils.getName((test2ListVo.getCreateUser())));
                }
                // 更新人名称
                if (test2ListVo.getUpdateUser() != null && test2ListVo.getUpdateUser() > 0) {
                    test2ListVo.setUpdateUserName(UserUtils.getName((test2ListVo.getUpdateUser())));
                }
                test2ListVoList.add(test2ListVo);
            });
        }
        return JsonResult.success("操作成功", test2ListVoList, data.getTotal());
    }

    /**
     * 获取记录详情
     *
     * @param id 记录ID
     * @return
     */
    @Override
    public Object getInfo(Serializable id) {
        Test2 entity = (Test2) super.getInfo(id);
        return entity;
    }

    /**
     * 添加或编辑记录
     *
     * @param entity 实体对象
     * @return
     */
    @Override
    public JsonResult edit(Test2 entity) {
        return super.edit(entity);
    }

    /**
     * 删除记录
     *
     * @param id 记录ID
     * @return
     */
    @Override
    public JsonResult deleteById(Integer id) {
        if (id == null || id == 0) {
            return JsonResult.error("记录ID不能为空");
        }
        Test2 entity = this.getById(id);
        if (entity == null) {
            return JsonResult.error("记录不存在");
        }
        return super.delete(entity);
    }

}