package pl.martajastrzabek.eulersecond.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.List;

class EulerSecondServiceTest {

    private EulerSecondService underTest;

    @BeforeEach
    void setUp() {
        underTest = new EulerSecondService();
    }

    @Test
    void whenLimitIsEightyNine_listSizeShouldBeTen() {
        //given
        int limit = 89;
        int expectedResult = 10;

        //when
        List<Integer> list = underTest.createFibonacciNumbers(limit);
        int result = list.size();

        //then
        Assertions.assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void whenLimitIsEightyNine_sumShouldBeFortyFour() {
        //given
        int limit = 89;
        int expectedResult = 44;

        //when
        List<Integer> list = underTest.createFibonacciNumbers(limit);
        int result = underTest.countEvenSum(list);

        //then
        Assertions.assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void whenProvidedLimitIsNegative_ShouldThrowException() {
        //given
        int limit = -100;

        //when
        Executable methodCall = () -> underTest.createFibonacciNumbers(limit);

        //then
        org.junit.jupiter.api.Assertions.assertThrows(IllegalArgumentException.class, methodCall);
    }
}