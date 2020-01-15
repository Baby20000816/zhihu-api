package com.scs.soft.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author jh_wu
 * @ClassName Section
 * @Description TODO
 * @Date 2020/1/15:18:04
 * @Version 1.0
 **/
@Data
@Builder
public class Section {
    private String sectionId;
    private String specialId;
    private String sectionTitle;
}
