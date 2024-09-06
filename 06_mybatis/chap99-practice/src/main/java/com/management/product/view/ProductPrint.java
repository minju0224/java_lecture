package com.management.product.view;

import com.common.SearchCondition;
import com.management.product.model.dto.ProductDTO;

import java.util.List;

public class ProductPrint {

    // * 모든 출력은 System.out.println()을 통해 콘솔에 출력하는 것을 의미합니다.
    // 주석을 지우고 다음 네 가지 메소드를 작성하세요.

    public void printAllProductList(List<ProductDTO> allProductList) {

        // 1. 전체 조회한 목록 출력하는 메소드
        //    (조건) List<ProductDTO>로 받아온 데이터 목록을 전체 출력하세요.
        System.out.println("==== 전체 목록 =====");
        for (ProductDTO productDTO : allProductList) {
            System.out.println(productDTO);
        }

    }

    public void printProductList(List<ProductDTO> productList, SearchCondition searchCondition) {

        // 2. 조건에 따라 조회한 목록을 출력하는 메소드
        //    (조건 1) SearchCondition 객체로 검색 조건이 무엇인지 출력하세요.
        //    (조건 2) List<ProductDTO>로 받아온 데이터 목록을 전체 출력하세요.
        System.out.println("==== 특정 상품 조회 ====");
        for (ProductDTO productDTO : productList) {
            System.out.println(productDTO);
        }

    }

    public void printSuccessMessage(String successCode) {

        System.out.println("성공!");
    }

    public void printErrorMessage(String errorCode) {

        // 4. 에러메시지를 출력하는 메소드
        //    (조건) 에러코드를 전달받아 에러를 알리는 메시지를 출력하세요.
        String errormessage = "";
        switch (errorCode) {
            case "selectAllProductList":
                errormessage = "전체 내역을 조회 하는데 실패!";
                break;
            case "selectProductByCondition":
                errormessage = "조건 검색 조회 실패";
                break;
        }
        System.out.println(errormessage);
    }

}
