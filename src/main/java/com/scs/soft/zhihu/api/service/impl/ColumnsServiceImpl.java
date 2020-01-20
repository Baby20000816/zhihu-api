package com.scs.soft.zhihu.api.service.impl;

import com.scs.soft.zhihu.api.entity.Columns;
import com.scs.soft.zhihu.api.entity.RoundTable;
import com.scs.soft.zhihu.api.mapper.ColumnsMapper;
import com.scs.soft.zhihu.api.service.ColumnsService;
import com.scs.soft.zhihu.api.service.RoundTableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author jh_wu
 * @ClassName ColumnsServiceImpl
 * @Description TODO
 * @Date 2020/1/20:18:20
 * @Version 1.0
 **/
@Service
public class ColumnsServiceImpl implements ColumnsService {
    @Resource
    private ColumnsMapper columnsMapper;

    @Override
    public List<Map> selectAll() {
        return columnsMapper.selectAll();
    }

    @Override
    public List<Columns> selectRecent() {
        return columnsMapper.selectRecent();
    }
}

