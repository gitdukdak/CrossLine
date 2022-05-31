package com.green.team4.vo.sw;

import lombok.*;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class ReviewFilesMpVO {

    private int rno; // 리뷰번호
    private int rFNo; // 리뷰 파일 번호
    private String img_name; // 파일 이름
    private String path; // 파일 경로
    private String uuid; // 파일 uuid

    public String getImageURL() {
        try {
            return URLEncoder.encode(path + "/" + uuid+"_" + img_name, "UTF-8");

        } catch (UnsupportedEncodingException e){
            e.printStackTrace();
        }
        return "";
    }

    public String getThumbnailURL() {
        try {
            return URLEncoder.encode(path + "/" + "s_" + uuid+"_" + img_name, "UTF-8");

        } catch (UnsupportedEncodingException e){
            e.printStackTrace();
        }
        return "";
    }
}
