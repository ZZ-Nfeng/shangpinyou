package com.zhi.spy.user.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhi.spy.enums.user.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
