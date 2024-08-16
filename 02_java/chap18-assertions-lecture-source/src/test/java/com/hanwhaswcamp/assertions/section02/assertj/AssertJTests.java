package com.hanwhaswcamp.section02.assertj;

import com.hanwahaswcamp.section02.assertj.Member;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.Month;

public class AssertJTests {
    /* 1. 문자열 테스트  */
    @Test
    @DisplayName("문자열 테스트 하기")
    void testStringValidation() {

        /*given*/
        String excepted = "hellp world";

        /*when*/
        String actual = new String(excepted);

        /*then*/
        Assertions.assertThat(actual)
                .isNotEmpty()
                .isNotBlank()
                .contains("hello")
                .doesNotContain("world")
                .startsWith("h")
                .endsWith("l")
                .isEqualTo(excepted);
    }

    /* 2. 숫자 테스트 */
    @Test
    @DisplayName("숫자 테스트 하기")
    void testIntegerValidation() {
        double pi = Math.PI;

        Double actual = Double.valueOf(pi);

        Assertions.assertThat(actual)
                .isPositive()
                .isGreaterThan(3)
                .isLessThan(4)
                .isEqualTo(Math.PI);
    }

    /* 3. 날짜 테스트 하기 */
    @Test
    @DisplayName("날짜 테스트 하기")
    void testLocalDateValidation() {
        String brithday = "2014-09-18T16:42:00.000";

        LocalDateTime theDay = LocalDateTime.parse(brithday);

        Assertions.assertThat(theDay)
                .hasYear(2014)
                .hasMonthValue(9)
                .hasMonth(Month.SEPTEMBER)
                .hasDayOfMonth(18)
                .isBetween("2014-01-01T00:00:00.000","2014-12-31T00:00:00.000")
                .isBefore(LocalDateTime.now());
    }

    /* 4. 예외 테스트 하기 */
    @Test
    @DisplayName("예외 테스트 하기")
    void testExceptionValidation() {
        Throwable thrown = AssertionsForClassTypes.catchThrowable(() -> {
            throw new IllegalAccessException("잘못 된 파라미터를 입력하셨습니다.");
        });
        Assertions.assertThat(thrown)
                .isInstanceOf(IllegalAccessException.class)
                .hasMessageContaining("파라미터");
    }

    /* 5. filter를 이용한 당정문 테스트 하기 */
    @Test
    @DisplayName("filtering assertions 테스트 하기")
    void testFilteringAssertions() {
        Member member1 = new Member(1,"user01","유관순",16);
        
    }
}
