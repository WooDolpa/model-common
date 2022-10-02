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
public class GalleryModel {

    /** 사진 시퀀스 **/
    private int galleryNo;
    /** 제목 **/
    private String galleryTitle;
    /** 설명 **/
    private String galleryDescription;
    /** 이미지 경로 **/
    private String galleryImg;
    /** 이미지 넘버 **/
    private int imgNum;
    /** 외부 연동 주소 **/
    private String galleryUrl;
    /** 순번 **/
    private int rank;
    /** 등록일 **/
    private String regDatetime;
    /** 수정일 **/
    private String updDatetime;

    @Builder
    public GalleryModel(int galleryNo, String galleryTitle, String galleryDescription, String galleryImg, int imgNum, String galleryUrl, int rank, String regDatetime, String updDatetime) {
        this.galleryNo = galleryNo;
        this.galleryTitle = galleryTitle;
        this.galleryDescription = galleryDescription;
        this.galleryImg = galleryImg;
        this.imgNum = imgNum;
        this.galleryUrl = galleryUrl;
        this.rank = rank;
        this.regDatetime = regDatetime;
        this.updDatetime = updDatetime;
    }
}
