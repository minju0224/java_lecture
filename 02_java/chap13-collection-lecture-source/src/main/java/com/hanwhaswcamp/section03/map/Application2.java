package com.hanwhaswcamp.section03.map;

import java.io.*;
import java.util.Properties;

public class Application2 {
    public static void main(String[] args) {
        /* Properites에 대해 이해하고 사용할 수 있다. */

        /* 설정 파일의 값을 읽어서 어플리케이션에 적용할 때 사용 */
        Properties prop = new Properties();
        /* DB 설정 정보를 Properties 객체에 저장한다 */
        prop.setProperty("driver", "org.mariadb.jdbc.Driver");
        prop.setProperty("url", "jdbc:mariadb://localhost:3306/test");
        prop.setProperty("user", "root");
        prop.setProperty("password", "root");

        System.out.println(prop);

        try {
            prop.store(new FileOutputStream("driver.properties"), "My Properties File");
            prop.store(new FileWriter("driver.txt"), "My Properties File");
            prop.storeToXML(new FileOutputStream("driver.xml"), "My Properties File");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //파일의 내용을 Properties 객체에 읽어온다.
        Properties prop2 = new Properties();

        try {
//            prop2.load(new FileInputStream("driver.properties"));
            prop2.load(new FileReader("driver.txt"));
//            prop2.loadFromXML(new FileInputStream("driver.xml"));


            System.out.println(prop2.getProperty("driver"));
            System.out.println(prop2.getProperty("url"));
            System.out.println(prop2.getProperty("user"));
            System.out.println(prop2.getProperty("password"));

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
