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
public class CategoryItemModel {

    /** 아이템 ID **/
    private int id;
    /** 카테고리 ID **/
    private int categoryId;
    /** 제목 **/
    private String title;
    /** 내용 **/
    private String description;
    /** 이미지 경로 **/
    private String img;
    /** 블로그 경로 **/
    private String url;
    /** 순번 **/
    private int rank;
    /** 이미지 번호 **/
    private int imgNumber;
    /** 데이터 상태 **/
    private DataStatus dataStatus;
    /** 등록일 **/
    private String regDatetime;
    /** 수정일 **/
    private String updDatetime;

    @Builder
    public CategoryItemModel(int id, int categoryId, String title, String description, String img, String url, int rank, int imgNumber, DataStatus dataStatus, String regDatetime, String updDatetime) {
        this.id = id;
        this.categoryId = categoryId;
        this.title = title;
        this.description = description;
        this.img = img;
        this.url = url;
        this.rank = rank;
        this.imgNumber = imgNumber;
        this.dataStatus = dataStatus;
        this.regDatetime = regDatetime;
        this.updDatetime = updDatetime;
    }
}
