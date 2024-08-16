package com.hanwhaswcamp.section01.jupiter;

import com.hanwahaswcamp.section01.jupiter.Calculator;
import com.hanwahaswcamp.section01.jupiter.NumberValidation;
import com.hanwahaswcamp.section01.jupiter.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/* JUNIT에서 제공하는 Assertions에 있는 메소드에 대해 이해하고 활용할 수 있다. */
class JupiterAssertioinsTest {

    /* 1. assertEquals : 예상 값과 실제 값의 일치 여부를 동일성으로 판단 */
    @Test
    void testAssert() {
        /* given */
        int firstNumber = 10;
        int secondNumber = 20;
        int expectedResult = 30;

        /* when */
        Calculator calculator = new Calculator();
        int result = calculator.plus(firstNumber, secondNumber);

        /* then */
//        Assertions.assertEquals(expectedResult, result);
//        Assertions.assertEquals(firstNumber, result,1); // 오차범위
        Assertions.assertNotEquals(firstNumber, result);

    }

    /* 2. assertNull */
    @Test
    @DisplayName("null인지 테스트")
    void testAssertNull() {
//        String str = null;
//        Assertions.assertNull(str);

        String str = "hello world";
        Assertions.assertNull(str);
    }

    /* 3. assertAll */
    @Test
    @DisplayName("동시에 여러가지 값에 대한 검증을 수행하는 테스트")
    void testAssertAll() {
        String fristName = "길동";
        String lastName = "홍";

        Person person = new Person(fristName, lastName);

        Assertions.assertAll(
                "그룹화 된 테스트의 이름(테스트 실패시 보여지는 부분)",
                () -> Assertions.assertEquals(fristName,person.getFistName(), () -> "firstName이 잘못 됨"),
                () -> Assertions.assertEquals(lastName,person.getLastName(), () -> "lastName이 잘못 됨")
        );
    }

    /* 4. assertThrows/assertInstanceOf */
    @Test
    @DisplayName("void 메소드의 경우 exception이 발생하는지 테스트")
    void testAssertThrows() {
        int firstNumber = 10;
        int secondNumber = 0;

        NumberValidation validator = new NumberValidation();
        Exception exception = Assertions.assertThrows(
                IllegalAccessException.class,
                () -> validator.checkDividableNumber(firstNumber,secondNumber)
        );

        Assertions.assertAll(
                () -> Assertions.assertInstanceOf(IllegalAccessException.class, exception, () -> "예외 타입 불일치"),
                () -> Assertions.assertEquals("0으로 나눌 수 없음",exception.getMessage(),() -> "예외 메시지 불일치")
        );
    }
}
