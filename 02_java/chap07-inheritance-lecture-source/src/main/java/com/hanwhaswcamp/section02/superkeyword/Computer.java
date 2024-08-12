package com.hanwhaswcamp.section02.superkeyword;

import java.util.Date;

public class Computer extends Product{
    private String cpu;
    private int hdd;
    private int ram;
    private String operatingSystem;

    public Computer() {
        System.out.println("computer 클래스의 기본 생성자 호출");
    }

    public Computer(String cpu, int hdd, int ram, String operatingSystem) {
        super();
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operatingSystem = operatingSystem;
        System.out.println("computer 클래스의 모든 필드 초기화하는 생성자 호출");
    }

    public Computer(String code, Date manufacuringDate, int price, String brand, String name, String cpu, int hdd, int ram, String operatingSystem) {
        super(code, brand, name, price, manufacuringDate);
        /* 위에 작성 된 생성자들 this()로 호출한다는것은 super()를 두 번 호출하는 것과 같기 때문에 허용 되지 않는다*/
//        this(cpu, hdd,ram,  operatingSystem);
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operatingSystem = operatingSystem;
        System.out.println("computer 클래스와 product 클래스의 모든 필드 초기화하는 생성자 호출");
    }
    /* 부모 필드에 직접 접근은 불가능 하지만 getter, setter 메서드는 자신의 것처럼 사용 가능하므로
    * 자식클래스에서 추가 된 필드에 대해서만 getter, setter를 작성한다. */

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
    @Override
    public String getInformation() {
        /* 부모 크래스의 private 멤버에는 직접 접근 불가하므로 getter 메소드로 접근한다.
        * super. this. 모두 사용 가능하며 생략하면 this.의 의미이다
        * 다만 코드의 의미를 명확히 하기 위해 super.을 명시하였다. */
//        return super.getCode() + " " + super.getBrand() + " " + super.getName() + " "
//                + super.getPrice() + " " + super.getManufacuringDate() + " " + this.cpu + " "
//                + this.hdd + " " + this.ram + " " + this.operatingSystem;
//
        /* Prodcut 클래스의 getInformation 메소드에서 이미 작성해둔 내용이 있으므로 해당 메소드를 활용해 본다.*/
        /* super.getInformation() : 정상적으로 부모의 메소드 호출
        * this.getInformation() or getInformation() : 재귀 호출이 일어나서 StackOoverFlowError 발생*/
        return super.getInformation() +" " + this.cpu + " " + this.hdd + " " + this.ram + " " + this.operatingSystem;
    }


}
