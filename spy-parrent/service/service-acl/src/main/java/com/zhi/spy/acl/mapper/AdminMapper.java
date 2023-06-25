package com.zhi.spy.acl.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhi.spy.model.acl.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface AdminMapper extends BaseMapper<Admin> {
}
