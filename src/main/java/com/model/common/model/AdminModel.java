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
public class AdminModel {

    private int adminNo;                    // 관리자 번호
    private String id;                      // 아이디
    private String password;                // 패스워드
    private String name;                    // 이름
    private String email;                   // 이메일
    private String regDatetime;             // 등록일
    private String updDatetime;             // 수정일

    @Builder
    public AdminModel(int adminNo, String id, String password, String name, String email, String regDatetime, String updDatetime) {
        this.adminNo = adminNo;
        this.id = id;
        this.password = password;
        this.name = name;
        this.email = email;
        this.regDatetime = regDatetime;
        this.updDatetime = updDatetime;
    }


}
