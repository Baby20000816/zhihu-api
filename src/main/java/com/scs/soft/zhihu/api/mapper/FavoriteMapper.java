package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.entity.Columns;
import com.scs.soft.zhihu.api.entity.Favorite;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author jh_wu
 * @ClassName Favorite
 * @Description TODO
 * @Date 2020/1/20
 * @Version 1.0
 **/
public interface FavoriteMapper {
    /**
     * 查询最新专题
     *
     * @return List<Columns>
     */
    @Select("SELECT * FROM t_favorite ORDER BY id DESC  ")
    List<Favorite> selectRecent();


    /**
     * 查询所有专题
     *
     * @return List<Map>
     */
    @Select("SELECT * FROM t_favorite")
    @Results({
            @Result(id = true, property = "id",column = "id",javaType = Integer.class),
            @Result(property = "title",column = "title",javaType = String.class),
            @Result(property = "creatorName",column = "creator_name",javaType = String.class),
            @Result(property = "creatorAvatar",column = "creator_avatar",javaType = String.class),
            @Result(property = "followers",column = "followers",javaType = Integer.class),
            @Result(property = "totalCount",column = "total_count",javaType = Integer.class),
            @Result(property = "questionTitle",column = "question_title",javaType = String.class),
            @Result(property = "answerAuthorName",column = "answer_author_name",javaType = String.class),
            @Result(property = "answerContent",column = "answer_content",javaType = String.class),
            @Result(property = "voteupCount",column = "voteup_count",javaType = Integer.class),
            @Result(property = "commentCount",column = "comment_count",javaType = Integer.class),
            @Result(property = "sections",column = "id"
//                    many = @Many(select = "com.scs.soft.zhihu.api.mapper.SectionMapper.getSectionsBySpecialId")
            ),
    })
    List<Map> selectAll();

}
