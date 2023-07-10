package com.zhi.spy.product.service;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zhi.spy.model.product.AttrGroup;
import com.zhi.spy.vo.product.AttrGroupQueryVo;

import java.util.List;


public interface AttrGroupService extends IService<AttrGroup> {

    //平台属性分组列表
    IPage<AttrGroup> selectPageAttrGroup(Page<AttrGroup> pageParam, AttrGroupQueryVo attrGroupQueryVo);

    //查询所有平台属性分组列表
    List<AttrGroup> findAllListAttrGroup();
}
