package com.zhi.spy.product.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zhi.spy.model.product.Category;
import com.zhi.spy.vo.product.CategoryQueryVo;


public interface CategoryService extends IService<Category> {

    //商品分类列表
    IPage<Category> selectPageCategory(Page<Category> pageParam, CategoryQueryVo categoryQueryVo);
}
