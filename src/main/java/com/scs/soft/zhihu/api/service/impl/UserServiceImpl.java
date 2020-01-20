package com.scs.soft.zhihu.api.service.impl;

import com.scs.soft.zhihu.api.entity.Favorite;
import com.scs.soft.zhihu.api.entity.User;
import com.scs.soft.zhihu.api.mapper.FavoriteMapper;
import com.scs.soft.zhihu.api.mapper.UserMapper;
import com.scs.soft.zhihu.api.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author jh_wu
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Date 2020/1/20:18:54
 * @Version 1.0
 **/
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public List<Map> selectAll() {
        return userMapper.selectAll();
    }

    @Override
    public List<User> selectRecent() {
        return userMapper.selectRecent();
    }
}
