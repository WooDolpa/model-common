package com.model.common.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * packageName : com.model.common.model
 * className : AdminModel
 * user : jwlee
 * date : 2022/10/02
 */
@Data
@NoArgsConstructor
public class ContentsModel {

    private int ctNo;
    private String ctTxt;
    private String regDatetime;
    private String updDatetime;

    @Builder
    public ContentsModel(int ctNo, String ctTxt, String regDatetime, String updDatetime) {
        this.ctNo = ctNo;
        this.ctTxt = ctTxt;
        this.regDatetime = regDatetime;
        this.updDatetime = updDatetime;
    }

}
