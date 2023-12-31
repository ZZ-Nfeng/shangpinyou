package com.zhi.spy.acl.service;



import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zhi.spy.model.acl.Role;
import com.zhi.spy.vo.acl.RoleQueryVo;

import java.util.Map;

public interface RoleService extends IService<Role> {
    //1 角色列表（条件分页查询）

    //获取所有角色，和根据用户id查询用户分配角色列表
    Map<String, Object> getRoleByAdminId(Long adminId);

    //为用户进行分配
    void saveAdminRole(Long adminId, Long[] roleIds);

    Page<Role> selectRolePage(Long current, Long limit, RoleQueryVo roleQueryVo);
}
