package com.hanwhaswcamp.associationmapping.section03.bidirection;

import jakarta.persistence.*;

@Entity(name = "section03Menu")
@Table(name = "tbl_menu")
public class Menu {

    @Id
    private int menuCode;
    private String menuName;
    private int menuPrice;
    @ManyToOne
    @JoinColumn(name = "categoryCode")
    private Category category;
    private String orderableStatus;

    public Menu() {

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

    public Category getCategory() {
        return category;
    }

    public String getOrderableStatus() {
        return orderableStatus;
    }
}
