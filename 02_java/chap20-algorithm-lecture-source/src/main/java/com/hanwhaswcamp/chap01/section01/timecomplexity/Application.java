package com.hanwhaswcamp.chap01.section01.timecomplexity;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        int[] arr = {3,1,2,15,4,9,10,7};
        System.out.println(getFirst(arr));

        System.out.println(binarySearch(arr, 15));

        System.out.println(Arrays.toString(reverse(arr)));

        System.out.println(fibonacci(10));
    }

    /* 상수 시간  O(1) */
    private static int getFirst(int[] arr){return arr[0];}   // 인덱스로 한번에 접근함 -> 연산 한번

    /* 로그 시간 O(log n)*/
    private static int binarySearch(int[] arr, int target){
        /* 초기 세팅(배열을 오름차순으로 내부정렬하고 시작한다)*/
        Arrays.sort(arr); //내부적으로 nlogn만큼의 시간이 걸리지만 지금은 고려 X

        /* 배열의 처음과 끝을 지정하는ㄴ 위치(인덱스)를 담은 변수 (포인터) */
        int left = 0, right = arr.length - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(target == arr[mid]){
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return -1;
    }

    /* 선형 시간 O(n)*/
    private static int[] reverse(int[] arr){
        int[] reversed = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            reversed[i] = arr[arr.length-1-i];     // input이 생길 때 마다 연산
        }
        return reversed;
    }

    /* 지수 시간 O(2^n) */
    private static int fibonacci(int n){
        if(n <= 1) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
