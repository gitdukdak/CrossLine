package com.green.team4.mapper.JH;

import com.green.team4.vo.JH.ItemPageCriteria;

import com.green.team4.vo.JH.Product_optVO;
import com.green.team4.vo.JH.ReviewVO;
import com.green.team4.vo.sb.ProductVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface ShopMapper {
    public List<ProductVO> getListAll();
    public List<ProductVO> getListWithCategory(String p_category);
    public int insert(ProductVO pvo);
    public int update(ProductVO pvo);
    public int delete(int pno);
    public ProductVO getOne(int pno);

    //페이징 처리

   public List<ProductVO> getListByCategoryAndPage(Map<String,Object> map);


   // public int getTotalProductCount();


    public int getTotalProductCountbyCategory(String p_category);

    //하위 카테고리

    public List<ProductVO> getCategory(String p_category);


    // 검색

    public List<ProductVO> getListByFind(ItemPageCriteria cri);

    public List<ProductVO> getListBySearch(String keyword);
    public int getTotaldatabyFind(ItemPageCriteria cri);


    //옵션처리


    public List<Product_optVO> getColors(String pCode);
    public List<Product_optVO> getSizes(String pCode);
    public List<Product_optVO> getOptList(String pCode);



}
