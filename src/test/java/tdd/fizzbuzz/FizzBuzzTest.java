package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FizzBuzzTest {
    @Test
    void should_return_order_number_when_count_off_given_normal_case_order_number() {
        //given
        int orderNumber = 1;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.countOff(orderNumber);

        //then
        assertThat(result).isEqualTo("1");
    }

    @Test
    void should_return_fizz_when_count_off_given_multiple_of_three_order_number() {
        //given
        int orderNumber = 3;

        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.countOff(orderNumber);

        //then
        assertThat(result).isEqualTo("Fizz");
    }

    @Test
    void should_return_Buzz_when_count_off_given_multiple_of_five_order_number() {
        int orderNumber = 5;

        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.countOff(orderNumber);

        //then
        assertThat(result).isEqualTo("Buzz");

        //then
        assertThat(result).isEqualTo("Buzz");
    }
}
