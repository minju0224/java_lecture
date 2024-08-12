package com.hanwhaswcamp.section01.array;

import java.util.Random;

public class Application5 {
    public static void main(String[] args) {
        /* 램덤한 카드 한 장 뽑아서 출력 */
        String[] shpaes = {"SPACE","HEART","DIAMOND","CLOVER"};
        String[] cardNumber = {"2","3","4","5","6","7","8","9","JACK","QUEEN","KING","ACE"};

        int randomShpaesIndex = new Random().nextInt(shpaes.length);
        int randomCardNumberIndex = new Random().nextInt(cardNumber.length);

        System.out.println(shpaes[randomShpaesIndex]+" "+cardNumber[randomCardNumberIndex]);
    }
}
