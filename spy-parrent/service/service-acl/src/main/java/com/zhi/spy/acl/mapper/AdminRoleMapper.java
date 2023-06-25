package com.zhi.spy.acl.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhi.spy.model.acl.AdminRole;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface AdminRoleMapper extends BaseMapper<AdminRole> {
}
