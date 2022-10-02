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
public class GalleryTxtModel {

    /** 텍스트 넘버 **/
    private int txtNo;
    /** 텍스트 내용 **/
    private String txtContents;
    /** 등록일 **/
    private String regDatetime;
    /** 수정일 **/
    private String updDatetime;

    @Builder
    public GalleryTxtModel(int txtNo, String txtContents, String regDatetime, String updDatetime) {
        this.txtNo = txtNo;
        this.txtContents = txtContents;
        this.regDatetime = regDatetime;
        this.updDatetime = updDatetime;
    }

}
