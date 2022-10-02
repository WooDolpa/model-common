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
public class MsgModel {

    private String errorId;
    private String errorCd;
    private String errorMsg;

    @Builder
    public MsgModel(String errorId, String errorCd, String errorMsg) {
        this.errorId = errorId;
        this.errorCd = errorCd;
        this.errorMsg = errorMsg;
    }
}
