package com.zhi.spy.acl.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhi.spy.model.acl.Permission;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface PermissionMapper extends BaseMapper<Permission> {
}
