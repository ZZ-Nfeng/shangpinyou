package com.zhi.spy.product.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhi.spy.model.product.Category;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 商品三级分类 Mapper 接口
 * </p>
 *
 * @author atguigu
 * @since 2023-04-04
 */
@Mapper
public interface CategoryMapper extends BaseMapper<Category> {

}
