package com.scs.soft.zhihu.api.controller;

import com.scs.soft.zhihu.api.common.Result;
import com.scs.soft.zhihu.api.service.RoundTableService;
import com.scs.soft.zhihu.api.service.SpecialService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author jh_wu
 * @ClassName RoundTableController
 * @Description TODO
 * @Date 2020/1/17:22:05
 * @Version 1.0
 **/
@RestController
@RequestMapping(value = "/api/roundtable")
public class RoundTableController {
    @Resource
    private RoundTableService roundTableService;

    @GetMapping
    public Result getRecent(){

        return Result.success(roundTableService.selectRecent());
    }

    @GetMapping(value = "/all")
    public Result getAll(){
        return Result.success(roundTableService.selectAll());
    }
}
