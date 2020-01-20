package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.entity.RoundTable;
import com.scs.soft.zhihu.api.entity.Special;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.sql.Date;
import java.util.List;
import java.util.Map;

/**
 * @author jh_wu
 * @ClassName RoundTableMapper
 * @Description TODO
 * @Date 2020/1/17
 * @Version 1.0
 **/
public interface RoundTableMapper {
    /**
     * 查询最新专题
     *
     * @return List<RoundTable>
     */
    @Select("SELECT * FROM t_round_table ORDER BY id DESC  ")
    List<RoundTable> selectRecent();


    /**
     * 查询所有专题
     *
     * @return List<Map>
     */
    @Select("SELECT * FROM t_round_table")
    @Results({
            @Result(id = true, property = "id",column = "id",javaType = Integer.class),
            @Result(property = "name",column = "name",javaType = String.class),
            @Result(property = "banner",column = "banner",javaType = String.class),
            @Result(property = "tinyBanner",column = "tiny_banner",javaType = String.class),
            @Result(property = "urlToken",column = "url_token",javaType = String.class),
            @Result(property = "visitsCount",column = "visits_count",javaType = Integer.class),
            @Result(property = "includeCount",column = "include_count",javaType = Integer.class),
            @Result(property = "sections",column = "id"
//                    many = @Many(select = "com.scs.soft.zhihu.api.mapper.SectionMapper.getSectionsBySpecialId")
                    ),
    })
    List<Map> selectAll();

}
