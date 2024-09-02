package com.hanwhaswcamp.ssection03.references;

import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Application1 {
    public static void main(String[] args) {
        /* 메소드 참조에 대해 이해하고 사용할 수 있다 */
        BiFunction<String, String, Boolean> biFunction;
        String str1 = "METHOO";
        String str2 = "METHO";

        /* 람다식 사용 */
        biFunction = (x,y) -> x.equals(y);
        boolean result = biFunction.apply(str1, str2);
        System.out.println(result);

        /* 메소드 참조 형태로 변경 */
        biFunction = String::equals;
        result = biFunction.apply(str1, str2);
        System.out.println(result);

        Predicate<String> isEqualToSample;
        String sample = "Hello World";

        /* 람다식 사용 */
        isEqualToSample = x -> x.equals(sample);
        result= isEqualToSample.test("hihi");
        System.out.println(result);

        /* 메소드 사용 */
        isEqualToSample = sample::equals;
        result = isEqualToSample.test("hihi");
        System.out.println(result);
    }
}
