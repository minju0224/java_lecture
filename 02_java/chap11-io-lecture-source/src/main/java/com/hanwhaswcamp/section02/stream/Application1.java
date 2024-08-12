package com.hanwhaswcamp.section02.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Application1 {
    public static void main(String[] args) {
        /* FileInputStream을 사용할 수 있다. */

        try {
            /* 읽어올 대상 파일이 존재하지 않는 경우에 대해서 FileNotFoundException 처리가 필요함 */
            FileInputStream fis = new FileInputStream("testInputStream.txt");

            /* read() : 파일에 기록 된 값을 순차적으로 읽어오고 더 이상 읽어올 데이터가 없으면 -1 반환 */
            int value;
            while ((value=fis.read())!= -1){
                System.out.print((char)value);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
