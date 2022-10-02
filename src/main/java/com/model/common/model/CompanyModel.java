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
public class CompanyModel {

    private int cpNo;               // 회사 일련번호
    private String cpName;          // 회사명
    private String cpImgUrl;        // 로고 이미지

    @Builder
    public CompanyModel(int cpNo, String cpName, String cpImgUrl) {
        this.cpNo = cpNo;
        this.cpName = cpName;
        this.cpImgUrl = cpImgUrl;
    }

}
