package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.entity.Columns;
import com.scs.soft.zhihu.api.entity.Favorite;

import java.util.List;
import java.util.Map;

/**
 * @author jh_wu
 * @ClassName FavoriteMapper
 * @Description TODO
 * @Date 2020/1/20
 * @Version 1.0
 **/
public interface FavoriteService {
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
    List<Favorite> selectRecent();
}
