package com.hanwhaswcamp.section02.superkeyword;

import java.util.Date;

public class Product {
    private String code;
    private String name;
    private String brand;
    private int price;
    private Date manufacuringDate;

    public Product() {
        System.out.println("Product 클래스의 기본 생성자 호출");
    }

    public Product(String code,String brand,String name, int price,Date manufacuringDate) {
        this.code = code;
        this.manufacuringDate = manufacuringDate;
        this.price = price;
        this.brand = brand;
        this.name = name;
        System.out.println("product 클래스의 매새변수 생성자 호출");
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getManufacuringDate() {
        return manufacuringDate;
    }

    public void setManufacuringDate(Date manufacuringDate) {
        this.manufacuringDate = manufacuringDate;
    }

    public String getInformation() {
        return code + " " + name + " " + brand + " " + price + " " + manufacuringDate;
    }
}
