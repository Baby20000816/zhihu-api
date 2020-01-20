package com.scs.soft.zhihu.api.service.impl;

import com.scs.soft.zhihu.api.entity.Favorite;
import com.scs.soft.zhihu.api.mapper.FavoriteMapper;
import com.scs.soft.zhihu.api.service.FavoriteService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author jh_wu
 * @ClassName FavoriteServiceImpl
 * @Description TODO
 * @Date 2020/1/20:18:44
 * @Version 1.0
 **/
@Service
public class FavoriteServiceImpl implements FavoriteService {
    @Resource
    private FavoriteMapper favoriteMapper;

    @Override
    public List<Map> selectAll() {
        return favoriteMapper.selectAll();
    }

    @Override
    public List<Favorite> selectRecent() {
        return favoriteMapper.selectRecent();
    }
}
