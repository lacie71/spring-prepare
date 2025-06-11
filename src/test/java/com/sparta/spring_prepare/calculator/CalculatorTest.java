package com.sparta.spring_prepare.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    @Test
    @DisplayName("더하기 테스트")
    void test1() {
        Calculator calculator = new Calculator();
        Double result = calculator.operate(8, "+", 2);
        System.out.println("result = " + result);

        // (사용자가 예상하는 테스트 코드의 예상 결과, 수행 결과)
        // 단위 테스트에서 각각의 return 대로 테스트 하는 것을 엣지 별로 테스트를 한다고 말함
        // 모든 return 결과를 전부 체크하는 것이 올바른 테스트 방법
        Assertions.assertEquals(10, result);
    }

    @Test
    @DisplayName("나누기 테스트")
    void test2() {
        Calculator calculator = new Calculator();
        Double result = calculator.operate(8, "/", 2);
        System.out.println("result = " + result);

        Assertions.assertEquals(4, result);
    }
}