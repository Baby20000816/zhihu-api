package com.scs.soft.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author jh_wu
 * @ClassName Columns
 * @Description TODO
 * @Date 2020/1/20:17:27
 * @Version 1.0
 **/
@Data
@Builder
public class Columns {
    private Integer id;
    private String title;
    private String description;
    private String url;
    private String imageUrl;
    private Integer follows;
    private Integer articlesCount;
}
