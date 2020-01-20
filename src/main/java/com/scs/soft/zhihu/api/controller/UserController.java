package com.scs.soft.zhihu.api.controller;

import com.scs.soft.zhihu.api.common.Result;
import com.scs.soft.zhihu.api.service.ColumnsService;
import com.scs.soft.zhihu.api.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author jh_wu
 * @ClassName UserController
 * @Description TODO
 * @Date 2020/1/20:18:55
 * @Version 1.0
 **/
@RestController
@RequestMapping(value = "/api/user")
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping
    public Result getRecent(){

        return Result.success(userService.selectRecent());
    }

    @GetMapping(value = "/all")
    public Result getAll(){
        return Result.success(userService.selectAll());
    }
}
