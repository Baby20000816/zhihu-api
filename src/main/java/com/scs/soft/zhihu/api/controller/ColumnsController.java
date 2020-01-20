package com.scs.soft.zhihu.api.controller;

import com.scs.soft.zhihu.api.common.Result;
import com.scs.soft.zhihu.api.service.ColumnsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author jh_wu
 * @ClassName ColumnsController
 * @Description TODO
 * @Date 2020/1/20:18:24
 * @Version 1.0
 **/
@RestController
@RequestMapping(value = "/api/columns")
public class ColumnsController {
    @Resource
    private ColumnsService columnsService;

    @GetMapping
    public Result getRecent(){

        return Result.success(columnsService.selectRecent());
    }

    @GetMapping(value = "/all")
    public Result getAll(){
        return Result.success(columnsService.selectAll());
    }
}
