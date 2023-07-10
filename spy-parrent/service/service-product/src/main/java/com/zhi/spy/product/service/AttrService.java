package com.zhi.spy.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhi.spy.model.product.Attr;

import java.util.List;


public interface AttrService extends IService<Attr> {

    //根据平台属性分组id查询
    List<Attr> getAttrListByGroupId(Long groupId);
}
