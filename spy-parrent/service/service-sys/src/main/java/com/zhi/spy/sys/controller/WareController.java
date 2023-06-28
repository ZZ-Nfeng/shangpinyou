package com.zhi.spy.sys.controller;


import com.zhi.spy.common.result.Result;
import com.zhi.spy.model.sys.Ware;
import com.zhi.spy.sys.service.WareService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/sys/ware")
//@CrossOrigin
@Api(tags = "仓库接口")
public class WareController {

    @Autowired
    private WareService wareService;

    //查询所有仓库列表
//    url: `${api_name}/findAllList`,
//    method: 'get'
    @ApiOperation("查询所有仓库列表")
    @GetMapping("findAllList")
    public Result findAllList() {
        List<Ware> list = wareService.list();
        return Result.ok(list);
    }

    @PostMapping("addWare")
    @ApiOperation("添加仓库")
    public Result addWare(@RequestBody Ware ware){
        wareService.save(ware);
        return Result.ok(ware);
    }
}

