package com.hanwhaswcamp.section02.update;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        /* view이자 controller의 역학*/
        Scanner sc = new Scanner(System.in);
        System.out.println("수정하고 싶은 메뉴의 이름을 입력 : ");
        String menuName = sc.nextLine();
        System.out.println("수정하고 싶은 메뉴의 가격 입력 : ");
        int menuPrice = sc.nextInt();
        System.out.println("수정하고 싶은 메뉴 코드 입력 : ");
        int menuCode = sc.nextInt();


        Menu menu = new Menu(menuName, menuCode, menuPrice);
        MenuService menuService = new MenuService();
        menuService.modifyMenu(menu);
    }
}
