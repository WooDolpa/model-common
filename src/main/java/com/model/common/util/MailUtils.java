package com.model.common.util;

import com.model.common.dto.MailDto;
import lombok.extern.slf4j.Slf4j;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeUtility;
import java.util.Date;
import java.util.Properties;

/**
 * packageName : com.model.common.model
 * className : AdminModel
 * user : jwlee
 * date : 2022/10/02
 */
@Slf4j
public class MailUtils {


    /**
     * 이메일 전송
     *
     * @param mailReqDto
     * @throws Exception
     */
    public static void sendMail (final MailDto.MailReqDto mailReqDto) throws Exception {

        Properties props = new Properties();

        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.ssl.trust", mailReqDto.getHost());
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.host", mailReqDto.getHost());
        props.put("mail.smtp.port", mailReqDto.getPort());
        props.put("mail.smtp.socketFactory.port", mailReqDto.getPort());
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

        Message msg = new MimeMessage(Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(mailReqDto.getId(), mailReqDto.getPassword());
            }
        }));

        msg.setFrom(new InternetAddress(mailReqDto.getFromAddress()));
        msg.setRecipient(Message.RecipientType.TO, new InternetAddress(mailReqDto.getToAddress()));
        msg.setSubject(MimeUtility.encodeText(mailReqDto.getTitle(), "UTF-8", "B"));
        msg.setContent(mailReqDto.getContent(), "text/html;charset=UTF-8");
        msg.setSentDate(new Date());

        Transport.send(msg);
    }

    /**
     * 임시 비밀번호 템플릿
     *
     * @param tempPassword
     * @return
     */
    public static String getTempPasswordHtmlCode (final String tempPassword){

        return
                "<html>"
                        +"<header>"
                        +"  <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\" integrity=\"sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk\" crossorigin=\"anonymous\">"
                        +"</header>"
                        +"<body>"
                        +"  <div class=\"container-fluid\">"
                        +"      <div style=\"font-size: 16px; border: 0; box-sizing: border-box; font-family: '맑은고딕','Malgun Gothic', 'dotum', sans-serif; letter-spacing: -1px; word-spacing: -2px; margin: 0 20px; padding: 25px 0 9px; border-bottom: 2px solid #666; color: #333; font-weight: bold;\" >"
                        +"          임시 비밀번호"
                        +"      </div>"
                        +"      <div style=\" margin: 0; border: 0; font-size: 14px; font-family: '맑은고딕','Malgun Gothic', 'dotum', sans-serif; font-weight: bold; padding: 0 20px;\" >"
                        +"          <p>임시 비밀번호가 발급되었습니다.</p>"
                        +"          <p>임시 비밀번호: <span style=\"background-color: black;\">"+tempPassword+"</span></p>"
                        +"          <p>로그인 후 비밀번호 변경이 가능합니다.</p>"
                        +"      </div>"
                        +"  </div>"
                        +"</body>"
                        +"</html>";
    }


    /**
     * 문의 메일 html 탬플릿
     *
     * @return
     */
    public static String getQnaHtmlCode(final String name, final String mobile, final String email, final String content){

        return
                "<html>"
                +"<header>"
                +"  <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\" integrity=\"sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk\" crossorigin=\"anonymous\">"
                +"</header>"
                +"<body>"
                +"  <div class=\"container-fluid\">"
                +"      <div style=\"font-size: 16px; border: 0; box-sizing: border-box; font-family: '맑은고딕','Malgun Gothic', 'dotum', sans-serif; letter-spacing: -1px; word-spacing: -2px; margin: 0 20px; padding: 25px 0 9px; border-bottom: 2px solid #666; color: #333; font-weight: bold;\" >"
                +"          문의내용"
                +"      </div>"
                +"      <div style=\" margin: 0; border: 0; box-sizing: border-box; font-size: 14px; line-height: 22px; font-family: '맑은고딕','Malgun Gothic', 'dotum', sans-serif; letter-spacing: -1px; padding: 0 20px;\" >"
                +"          <table style=\"margin: 0; padding: 0; border: 0; box-sizing: border-box; font-size: 0; line-height: 0; font-family: '맑은고딕','Malgun Gothic', 'dotum', sans-serif; letter-spacing: -1px; border-spacing: 0; border-collapse: collapse; table-layout: fixed; width: 100%;\" >"
                +"              <caption style=\"visibility:hidden; width: 0; height: 0; font-size: 0; line-height: 0;\" ></caption>"
                +"              <colgroup>"
                +"                  <col style=\"margin: 0; padding: 0; border: 0; box-sizing: border-box; width: 110px;\" >"
                +"                  <col style=\"margin: 0; padding: 0; border: 0; box-sizing: border-box;\" >"
                +"              </colgroup>"
                +"              <tbody style=\"margin: 0; padding: 0; border: 0;\" >"
                +"                  <tr>"
                +"                      <th style=\"margin: 0; padding: 0; border: 0; box-sizing: border-box; font-size: 14px; line-height: 22px; font-family: '맑은고딕','Malgun Gothic', 'dotum', sans-serif; letter-spacing: -1px; padding: 14px 0 16px 16px; line-height: 20px; text-align: left; font-weight: normal; vertical-align: top; background: #f6f6f6; border-bottom: 1px solid #e6e6e6;\" >"
                +"                          이름"
                +"                      </th>"
                +"                      <td style=\"margin: 0; padding: 0; border: 0; box-sizing: border-box; font-size: 14px; line-height: 22px; font-family: '맑은고딕','Malgun Gothic', 'dotum', sans-serif; letter-spacing: -1px; padding: 14px 0 16px 16px; line-height: 20px; color: #333; border-bottom: 1px solid #e6e6e6;\" >"
                +"                          "+name
                +"                      </td>"
                +"                  </tr>"
                +"                  <tr>"
                +"                      <th style=\"margin: 0; padding: 0; border: 0; box-sizing: border-box; font-size: 14px; line-height: 22px; font-family: '맑은고딕','Malgun Gothic', 'dotum', sans-serif; letter-spacing: -1px; padding: 14px 0 16px 16px; line-height: 20px; text-align: left; font-weight: normal; vertical-align: top; background: #f6f6f6; border-bottom: 1px solid #e6e6e6;\" >"
                +"                          연락처"
                +"                      </th>"
                +"                      <td style=\"margin: 0; padding: 0; border: 0; box-sizing: border-box; font-size: 14px; line-height: 22px; font-family: '맑은고딕','Malgun Gothic', 'dotum', sans-serif; letter-spacing: -1px; padding: 14px 0 16px 16px; line-height: 20px; color: #333; border-bottom: 1px solid #e6e6e6;\" >"
                +"                          "+mobile
                +"                      </td>"
                +"                  </tr>"
                +"                  <tr>"
                +"                      <th style=\"margin: 0; padding: 0; border: 0; box-sizing: border-box; font-size: 14px; line-height: 22px; font-family: '맑은고딕','Malgun Gothic', 'dotum', sans-serif; letter-spacing: -1px; padding: 14px 0 16px 16px; line-height: 20px; text-align: left; font-weight: normal; vertical-align: top; background: #f6f6f6; border-bottom: 1px solid #e6e6e6;\" >"
                +"                          이메일"
                +"                      </th>"
                +"                      <td style=\"margin: 0; padding: 0; border: 0; box-sizing: border-box; font-size: 14px; line-height: 22px; font-family: '맑은고딕','Malgun Gothic', 'dotum', sans-serif; letter-spacing: -1px; padding: 14px 0 16px 16px; line-height: 20px; color: #333; border-bottom: 1px solid #e6e6e6;\" >"
                +"                          "+email
                +"                      </td>"
                +"                  </tr>"
                +"                  <tr>"
                +"                      <th style=\"margin: 0; padding: 0; border: 0; box-sizing: border-box; font-size: 14px; line-height: 22px; font-family: '맑은고딕','Malgun Gothic', 'dotum', sans-serif; letter-spacing: -1px; padding: 14px 0 16px 16px; line-height: 20px; text-align: left; font-weight: normal; vertical-align: top; background: #f6f6f6; border-bottom: 1px solid #e6e6e6;\" >"
                +"                          상담내용"
                +"                      </th>"
                +"                      <td style=\"margin: 0; padding: 0; border: 0; box-sizing: border-box; font-size: 14px; line-height: 22px; font-family: '맑은고딕','Malgun Gothic', 'dotum', sans-serif; letter-spacing: -1px; padding: 14px 0 16px 16px; line-height: 20px; color: #333; border-bottom: 1px solid #e6e6e6;\" >"
                +"                          "+content
                +"                      </td>"
                +"                  </tr>"
                +"              </tbody>"
                +"          </table>"
                +"      </div>"
                +"  </div>"
                +"</body>"
                +"</html>";
    }

}
