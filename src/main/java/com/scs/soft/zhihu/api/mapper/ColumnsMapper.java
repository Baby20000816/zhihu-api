package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.entity.Columns;
import com.scs.soft.zhihu.api.entity.RoundTable;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author jh_wu
 * @ClassName ColumnsMapper
 * @Description TODO
 * @Date 2020/1/20
 * @Version 1.0
 **/
public interface ColumnsMapper {
    /**
     * 查询最新专题
     *
     * @return List<Columns>
     */
    @Select("SELECT * FROM t_columns ORDER BY id DESC  ")
    List<Columns> selectRecent();


    /**
     * 查询所有专题
     *
     * @return List<Map>
     */
    @Select("SELECT * FROM t_columns")
    @Results({
            @Result(id = true, property = "id",column = "id",javaType = Integer.class),
            @Result(property = "title",column = "title",javaType = String.class),
            @Result(property = "description",column = "description",javaType = String.class),
            @Result(property = "url",column = "url",javaType = String.class),
            @Result(property = "imageUrl",column = "image_url",javaType = String.class),
            @Result(property = "followers",column = "followers",javaType = Integer.class),
            @Result(property = "articlesCount",column = "articles_count",javaType = Integer.class),
            @Result(property = "sections",column = "id"
//                    many = @Many(select = "com.scs.soft.zhihu.api.mapper.SectionMapper.getSectionsBySpecialId")
            ),
    })
    List<Map> selectAll();

}
