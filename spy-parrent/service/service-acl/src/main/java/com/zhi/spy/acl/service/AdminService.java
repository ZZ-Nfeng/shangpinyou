package com.zhi.spy.acl.service;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zhi.spy.model.acl.Admin;
import com.zhi.spy.vo.acl.AdminQueryVo;

public interface AdminService extends IService<Admin> {

    //1 用户列表
    IPage<Admin> selectPageUser(Page<Admin> pageParam, AdminQueryVo adminQueryVo);
}
