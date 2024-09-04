package com.hanwhaswcamp.section01.xmlconfig;

import java.util.List;

public class PrintResult {
    public void printMenuList(List<MenuDTO> menuList){
        System.out.println("==== 메뉴 목록 ====");
        for (MenuDTO menuDTO : menuList) {
            System.out.println(menuDTO);
        }
    }

    public void printMenu(MenuDTO menu) {
        System.out.println("==== 조회 된 메뉴 =====");
        System.out.println(menu);
    }

    public void printSuccessMessage(String successCode) {
        System.out.println("==== Successs ====");
        String successMessage = "";
        switch (successCode) {
            case "insert":
                successMessage = "신규 메뉴 등록이 완료 되었습니다.";  break;
            case "update":
                successMessage = "메뉴 업데이트 완료"; break;
            case "delete":
                successMessage = "메뉴 삭제 완료"; break;
        }

        System.out.println(successMessage);
    }

    public void printErrorMessage(String errorCode){
        System.out.println("==== Error ====");
        String errorMessage = "";
        switch (errorCode) {
            case "selectList":
                errorMessage ="메뉴 목록 조회에 실패"; break;
            case "selectOne":
                errorMessage = "메뉴 코드로 멘 조회에 실패"; break;
            case "insert":
                errorMessage = "신규 메뉴 등록에 실패"; break;
            case "update":
                errorMessage = "메뉴 업데이트 실패"; break;
            case "delete":
                errorMessage = "메뉴 삭제 실패"; break;
         }
        System.out.println(errorMessage);
    }

}
