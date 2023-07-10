package com.zhi.spy.product.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.zhi.spy.model.product.SkuImage;

import java.util.List;


public interface SkuImageService extends IService<SkuImage> {

    //根据id查询商品图片列表
    List<SkuImage> getImageListBySkuId(Long id);
}
