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
public class NavigationModel {

    private int navNo;                      // 네비게이션 번호
    private String title;                   // 제목
    private int sort;                       // 순번
    private String link;                    // 경로
    private DataStatus dataStatus;          // 데이터 상태
    private String regDatetime;             // 등록일
    private String updDatetime;             // 수정일

    @Builder
    public NavigationModel(int navNo, String title, int sort, String link, DataStatus dataStatus, String regDatetime, String updDatetime) {
        this.navNo = navNo;
        this.title = title;
        this.sort = sort;
        this.link = link;
        this.dataStatus = dataStatus;
        this.regDatetime = regDatetime;
        this.updDatetime = updDatetime;
    }

}
