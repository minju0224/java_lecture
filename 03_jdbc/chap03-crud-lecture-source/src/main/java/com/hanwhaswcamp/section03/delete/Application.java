package com.hanwhaswcamp.section03.delete;

import com.hanwhaswcamp.section03.delete.Menu;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        /* view이자 controller의 역학*/
        Scanner sc = new Scanner(System.in);
        System.out.println("수정하고 싶은 메뉴 코드 입력 : ");
        int menuCode = sc.nextInt();
        sc.nextLine();

        Menu menu = new Menu(menuCode);
        MenuService menuService = new MenuService();
        menuService.registMenu(menu);
    }
}
