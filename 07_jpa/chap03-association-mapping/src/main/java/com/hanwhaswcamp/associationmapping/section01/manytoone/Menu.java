package com.hanwhaswcamp.associationmapping.section01.manytoone;

import jakarta.persistence.*;

@Entity(name = "section01Menu")
@Table(name = "tbl_menu")
public class Menu {

    @Id
    private int menuCode;
    private String menuName;
    private int menuPrice;
    /* 영속성 전이 : 특정 엔티티를 영속화 할 때 연관 된 엔티티도 함께 영속화 한다는 의미이다. */
    /* FetchType.EAGER : 즉시 로딩, FetchType.LAZY : 지연 로딩 */
    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinColumn(name = "categoryCode")  // fk에 해당하는 값을 넣어줘야 함
    private Category category;
    private String orderableStatus;

    public Menu() {

    }

    public Menu(int menuCode, String menuName, int menuPrice, Category category, String orderableStatus) {
        this.menuCode = menuCode;
        this.menuName = menuName;
        this.menuPrice = menuPrice;
        this.category = category;
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

    public Category getCategory() {
        return category;
    }

    public String getOrderableStatus() {
        return orderableStatus;
    }
}
