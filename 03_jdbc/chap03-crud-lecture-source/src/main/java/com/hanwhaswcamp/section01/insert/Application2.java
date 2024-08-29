package com.hanwhaswcamp.section01.insert;

import java.util.Scanner;

/*Service 계층과 Repository 계층을 구분하고 XML 파일로부터 쿼리를 불러와서 insert 해보기 */
public class Application2 {
    public static void main(String[] args) {
        /* view이자 controller의 역학*/
        Scanner sc = new Scanner(System.in);
        System.out.println("메뉴의 이름을 입력 : ");
        String menuName = sc.nextLine();
        System.out.println("메뉴의 가격 입력 : ");
        int menuPrice = sc.nextInt();
        System.out.println("카테고리 코드 입력 : ");
        int categoryCode = sc.nextInt();
        sc.nextLine();
        System.out.println("판매 상태 입력 : ");
        String orderableStatus = sc.nextLine();

        Menu menu = new Menu(menuName, menuPrice, categoryCode, orderableStatus);
        MenuService menuService = new MenuService();
        menuService.registMenu(menu);
    }
}
