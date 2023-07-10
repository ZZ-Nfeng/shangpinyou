package com.zhi.spy.product.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhi.spy.model.product.Category;
import com.zhi.spy.product.mapper.CategoryMapper;
import com.zhi.spy.product.service.CategoryService;
import com.zhi.spy.vo.product.CategoryQueryVo;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;


@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

    //商品分类列表
    @Override
    public IPage<Category> selectPageCategory(Page<Category> pageParam,
                                              CategoryQueryVo categoryQueryVo) {
        String name = categoryQueryVo.getName();
        LambdaQueryWrapper<Category> wrapper = new LambdaQueryWrapper<>();
        if(!StringUtils.isEmpty(name)) {
            wrapper.like(Category::getName,name);
        }
        IPage<Category> categoryPage = baseMapper.selectPage(pageParam, wrapper);
        return categoryPage;
    }
}
