package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.entity.Columns;
import com.scs.soft.zhihu.api.entity.RoundTable;

import java.util.List;
import java.util.Map;

/**
 * @author jh_wu
 * @ClassName Columns
 * @Description TODO
 * @Date 2020/1/20
 * @Version 1.0
 **/
public interface ColumnsService {
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
    List<Columns> selectRecent();
}
