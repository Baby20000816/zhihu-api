package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.entity.Favorite;
import com.scs.soft.zhihu.api.entity.User;

import java.util.List;
import java.util.Map;

/**
 * @author jh_wu
 * @ClassName UserService
 * @Description TODO
 * @Date 2020/1/20
 * @Version 1.0
 **/
public interface UserService {
    /**
     * 查询所有专题
     *
     * @return List<Map>
     */
    List<Map> selectAll();

    /**
     * 查询最新专题
     *
     * @return List<favorite>
     */
    List<User> selectRecent();
}
