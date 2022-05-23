package com.green.team4.vo.sb;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ProductVO {

    private int pno;
    private int pcno;
    private String pName;
    private String pMainCategory;
    private String pSubCategory;
    private double pRating;
    private int pReviewCnt;
    private int pPrice;
    private int pAmount;
    private Date pRegdate;
    private String pInformation;
    private String pDelivery;
    private String pImage;
    private String pCode;
    private String pSize;
    private String pOption;
    private String pOption2;
    private String pOptionName;
    private String pOptionName2;
    private int pOptionPrice;
    private String pColor;

}
