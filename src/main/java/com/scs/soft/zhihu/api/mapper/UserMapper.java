package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.entity.Columns;
import com.scs.soft.zhihu.api.entity.User;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author jh_wu
 * @ClassName UserMapper
 * @Description TODO
 * @Date 2020/1/20
 * @Version 1.0
 **/
public interface UserMapper {
    /**
     * 查询最新专题
     *
     * @return List<Columns>
     */
    @Select("SELECT * FROM t_user ORDER BY id DESC  ")
    List<User> selectRecent();


    /**
     * 查询所有专题
     *
     * @return List<Map>
     */
    @Select("SELECT * FROM t_user")
    @Results({
            @Result(id = true, property = "id",column = "id",javaType = String.class),
            @Result(property = "mobile",column = "mobile",javaType = String.class),
            @Result(property = "email",column = "email",javaType = String.class),
            @Result(property = "password",column = "password",javaType = String.class),
            @Result(property = "name",column = "name",javaType = String.class),
            @Result(property = "urlToken",column = "url_token",javaType = String.class),
            @Result(property = "avatarUrl",column = "avatar_url",javaType = String.class),
            @Result(property = "url",column = "url",javaType = String.class),
            @Result(property = "headline",column = "headline",javaType = String.class),
            @Result(property = "description",column = "description",javaType = String.class),
            @Result(property = "gender",column = "gender",javaType = Short.class),
            @Result(property = "location",column = "location",javaType = String.class),
            @Result(property = "business",column = "business",javaType = String.class),
            @Result(property = "employment",column = "employment",javaType = String.class),
            @Result(property = "education",column = "education",javaType = String.class),
            @Result(property = "userCover",column = "userCover",javaType = String.class),
            @Result(property = "created",column = "created",javaType = String.class),
            @Result(property = "sections",column = "id"
//                    many = @Many(select = "com.scs.soft.zhihu.api.mapper.SectionMapper.getSectionsBySpecialId")
            ),
    })
    List<Map> selectAll();

}

