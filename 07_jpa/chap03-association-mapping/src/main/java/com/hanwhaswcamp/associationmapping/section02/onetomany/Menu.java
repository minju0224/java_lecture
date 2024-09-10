package com.hanwhaswcamp.associationmapping.section02.onetomany;

import com.hanwhaswcamp.associationmapping.section01.manytoone.Category;
import jakarta.persistence.*;

@Entity(name = "section02Menu")
@Table(name = "tbl_menu")
public class Menu {

    @Id
    private int menuCode;
    private String menuName;
    private int menuPrice;
    private int categoryCode;
    private String orderableStatus;

    public Menu() {

    }

    public Menu(int menuCode, String menuName, int menuPrice,  String orderableStatus) {
        this.menuCode = menuCode;
        this.menuName = menuName;
        this.menuPrice = menuPrice;
        this.orderableStatus = orderableStatus;
    }

    public int getMenuCode() {
        return menuCode;
    }

    public String getMenuName() {
        return menuName;
    }

    public int getMenuPrice() {
        return menuPrice;
    }

    public String getOrderableStatus() {
        return orderableStatus;
    }
}
