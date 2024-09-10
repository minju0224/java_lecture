package com.hanwhaswcamp.associationmapping.section03.bidirection;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "section03Category")
@Table(name = "tbl_category")
public class Category {

    @Id
    private int categoryCode;
    private String categoryName;
    private Integer refCategoryCode;
    /* 양방향 연관 관계를 맺을 경우 fk를 가진 엔티티를 진짜,
     * fk를 가지지 않은 엔티티를 가짜 연관 관계라고 본다.
     * 진짜 연관 관계는 똑같이 처리하지만 가짜 연관관계는
     * mappedby 속성에 진짜 연관관계 필드명을 넣어서 설정한다. */
    @OneToMany(mappedBy = "category")
    private List<Menu> menuList;

    public Category() {
    }

    public int getCategoryCode() {
        return categoryCode;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public Integer getRefCategoryCode() {
        return refCategoryCode;
    }

    public List<Menu> getMenuList() {
        return menuList;
    }

}
