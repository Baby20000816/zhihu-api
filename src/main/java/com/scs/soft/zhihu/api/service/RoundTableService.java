package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.entity.RoundTable;
import com.scs.soft.zhihu.api.entity.Special;

import java.util.List;
import java.util.Map;

/**
 * @author jh_wu
 * @ClassName RoundTableService
 * @Description TODO
 * @Date 2020/1/17
 * @Version 1.0
 **/
public interface RoundTableService {
    /**
     * 查询所有专题
     *
     * @return List<Map>
     */
    List<Map> selectAll();

    /**
     * 查询最新专题
     *
     * @return List<RoundTable>
     */
    List<RoundTable> selectRecent();
}
