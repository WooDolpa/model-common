package com.model.common.model;

import com.model.common.enums.DataStatus;
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
public class SliderModel {

    /** 슬라이드 넘버 **/
    private int sliderNo;
    /** 제목 **/
    private String title;
    /** 내용 **/
    private String content;
    /** 이미지 경로 **/
    private String imgUrl;
    /** 순번 **/
    private int sort;
    /** 이미지 넘버 **/
    private int imgNum;
    /** 데이터 상태 **/
    private DataStatus dataStatus;
    /** 등록일 **/
    private String regDatetime;
    /** 수정일 **/
    private String updDatetime;

    @Builder
    public SliderModel(int sliderNo, String title, String content, String imgUrl, int sort, int imgNum, DataStatus dataStatus, String regDatetime, String updDatetime) {
        this.sliderNo = sliderNo;
        this.title = title;
        this.content = content;
        this.imgUrl = imgUrl;
        this.sort = sort;
        this.imgNum = imgNum;
        this.dataStatus = dataStatus;
        this.regDatetime = regDatetime;
        this.updDatetime = updDatetime;
    }
}
