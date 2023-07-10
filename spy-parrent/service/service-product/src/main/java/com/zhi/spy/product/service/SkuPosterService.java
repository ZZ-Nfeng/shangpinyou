package com.zhi.spy.product.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.zhi.spy.model.product.SkuPoster;

import java.util.List;

public interface SkuPosterService extends IService<SkuPoster> {

    //根据id查询商品海报列表
    List<SkuPoster> getPosterListBySkuId(Long id);
}
