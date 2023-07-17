package com.zhi.spy.user.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhi.spy.enums.user.Leader;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LeaderMapper extends BaseMapper<Leader> {
}
