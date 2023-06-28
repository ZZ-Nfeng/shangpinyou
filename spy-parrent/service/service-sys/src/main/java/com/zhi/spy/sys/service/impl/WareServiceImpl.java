package com.zhi.spy.sys.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhi.spy.model.sys.Ware;
import com.zhi.spy.sys.mapper.WareMapper;
import com.zhi.spy.sys.service.WareService;
import org.springframework.stereotype.Service;


@Service
public class WareServiceImpl extends ServiceImpl<WareMapper, Ware> implements WareService {

}
