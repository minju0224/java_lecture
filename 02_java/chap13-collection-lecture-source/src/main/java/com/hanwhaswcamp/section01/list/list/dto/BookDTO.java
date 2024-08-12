package com.hanwhaswcamp.section01.list.list.dto;

public class BookDTO implements Comparable<BookDTO>{
    private int number;
    private String title;
    private String author;
    private int price;

    public BookDTO(int number, String title, String author, int price) {
        this.number = number;
        this.author = author;
        this.title = title;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    /* 제목 내림차순 정렬 기준을 내부 기준으로 설정 */
    @Override
    public int compareTo(BookDTO o) {
        return o.getTitle().compareTo(getTitle());
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
