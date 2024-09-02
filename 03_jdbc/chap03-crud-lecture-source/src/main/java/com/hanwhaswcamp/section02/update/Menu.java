package com.hanwhaswcamp.section02.update;

public class Menu {
    // 순서대로 작성하기
    private String menuName;
    private int menuPrice;
    private int menuCode;

    public Menu(String menuName, int menuCode, int menuPrice) {
        this.menuName = menuName;
        this.menuCode = menuCode;
        this.menuPrice = menuPrice;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public int getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(int menuCode) {
        this.menuCode = menuCode;
    }

    public int getMenuPrice() {
        return menuPrice;
    }

    public void setMenuPrice(int menuPrice) {
        this.menuPrice = menuPrice;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuName='" + menuName + '\'' +
                ", menuPrice=" + menuPrice +
                ", menuCode=" + menuCode +
                '}';
    }
}
