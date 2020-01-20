package com.scs.soft.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author jh_wu
 * @ClassName RoundTable
 * @Description TODO
 * @Date 2020/1/17:21:16
 * @Version 1.0
 **/
@Data
@Builder
public class RoundTable {
    private Integer id;
    private String name;
    private String banner;
    private String tinyBanner;
    private String urlToken;
    private Integer visitsCount;
    private Integer includeCount;
}
