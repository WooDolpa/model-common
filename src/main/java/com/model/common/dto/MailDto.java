package com.model.common.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * packageName : com.model.common.dto
 * className : MailDto
 * user : jwlee
 * date : 2022/10/02
 */
public class MailDto {

    @Data
    @NoArgsConstructor
    public static class MailReqDto {

        private String host;
        private int port;
        private String id;
        private String password;
        private String fromAddress;
        private String title;
        private String content;
        private String toAddress;

        @Builder
        public MailReqDto(String host, int port, String id, String password, String fromAddress, String title, String content, String toAddress) {
            this.host = host;
            this.port = port;
            this.id = id;
            this.password = password;
            this.fromAddress = fromAddress;
            this.title = title;
            this.content = content;
            this.toAddress = toAddress;
        }
    }

}
