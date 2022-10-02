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
public class AwardTypeModel {

    /** id **/
    private int id;
    /** 타입 명 **/
    private String name;
    /** 순번 **/
    private int rank;
    /** 데이터 상태 **/
    private DataStatus dataStatus;
    /** 등록일 **/
    private String regDatetime;
    /** 수정일 **/
    private String updDatetime;

    @Builder
    public AwardTypeModel(int id, String name, int rank, DataStatus dataStatus, String regDatetime, String updDatetime) {
        this.id = id;
        this.name = name;
        this.rank = rank;
        this.dataStatus = dataStatus;
        this.regDatetime = regDatetime;
        this.updDatetime = updDatetime;
    }
}
