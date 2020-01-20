package com.scs.soft.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author jh_wu
 * @ClassName User
 * @Description TODO
 * @Date 2020/1/20:17:33
 * @Version 1.0
 **/
@Data
@Builder
public class User {
    private String id;
    private String mobile;
    private String email;
    private String password;
    private String name;
    private String urlToken;
    private String avatarUrl;
    private String url;
    private String headline;
    private String description;
    private Short gender;
    private String location;
    private String business;
    private String employment;
    private String education;
    private String userCover;
    private String created;
}
