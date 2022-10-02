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
public class AwardModel {

    /** 일련번호 **/
    private int awardNo;
    /** 타입 **/
    private int awardType;
    /** 수상명 **/
    private String awardName;
    /** 연결 주소 **/
    private String url;
    /** 순번 **/
    private int rank;
    /** 데이터 상태 **/
    private DataStatus dataStatus;
    /** 등록일 **/
    private String regDatetime;

    @Builder
    public AwardModel(int awardNo, int awardType, String awardName, String url, int rank, DataStatus dataStatus, String regDatetime) {
        this.awardNo = awardNo;
        this.awardType = awardType;
        this.awardName = awardName;
        this.url = url;
        this.rank = rank;
        this.dataStatus = dataStatus;
        this.regDatetime = regDatetime;
    }

    private String name;

}
