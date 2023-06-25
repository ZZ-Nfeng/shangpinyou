package com.zhi.spy.acl.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhi.spy.acl.mapper.AdminRoleMapper;
import com.zhi.spy.acl.service.AdminRoleService;
import com.zhi.spy.model.acl.AdminRole;
import org.springframework.stereotype.Service;

@Service
public class AdminRoleServiceImpl extends ServiceImpl<AdminRoleMapper, AdminRole> implements AdminRoleService {
}
