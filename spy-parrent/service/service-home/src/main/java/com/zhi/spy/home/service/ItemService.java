package com.zhi.spy.home.service;

import java.util.Map;

public interface ItemService {

    //详情
    Map<String, Object> item(Long id, Long userId);
}