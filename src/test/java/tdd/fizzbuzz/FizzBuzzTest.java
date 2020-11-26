package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    public void should_return_string_order_number_when_count_off_given_normal_case(){
        //given
        int order=1;
        FizzBuzz fizzbuzz=new FizzBuzz();
        //when
        String actualOrder=fizzbuzz.countOff(order);
        //then
        assertEquals("1",actualOrder);
    }
    @Test
    public void should_return_Fizz_when_count_off_given_order_number_multiple_of_3(){
        //given
        int order=3;
        FizzBuzz fizzbuzz=new FizzBuzz();
        //when
        String actualOrder=fizzbuzz.countOff(order);
        //then
        assertEquals("Fizz",actualOrder);
    }
    @Test
    public void should_return_Buzz_when_count_off_given_order_number_multiple_of_5(){
        //given
        int order=5;
        FizzBuzz fizzbuzz=new FizzBuzz();
        //when
        String actualOrder=fizzbuzz.countOff(order);
        //then
        assertEquals("Buzz",actualOrder);
    }
    @Test
    public void should_return_Whizz_when_count_off_given_order_number_multiple_of_7(){
        //given
        int order=7;
        FizzBuzz fizzbuzz=new FizzBuzz();
        //when
        String actualOrder=fizzbuzz.countOff(order);
        //then
        assertEquals("Whizz",actualOrder);
    }
    @Test
    public void should_return_FizzBuzz_when_count_off_given_order_number_multiple_of_3_and_5(){
        //given
        int order=15;
        FizzBuzz fizzbuzz=new FizzBuzz();
        //when
        String actualOrder=fizzbuzz.countOff(order);
        //then
        assertEquals("FizzBuzz",actualOrder);
    }
    @Test
    public void should_return_FizzWhizz_when_count_off_given_order_number_multiple_of_3_and_7(){
        //given
        int order=21;
        FizzBuzz fizzbuzz=new FizzBuzz();
        //when
        String actualOrder=fizzbuzz.countOff(order);
        //then
        assertEquals("FizzWhizz",actualOrder);
    }
    @Test
    public void should_return_BuzzWhizz_when_count_off_given_order_number_multiple_of_5_and_7(){
        //given
        int order=35;
        FizzBuzz fizzbuzz=new FizzBuzz();
        //when
        String actualOrder=fizzbuzz.countOff(order);
        //then
        assertEquals("BuzzWhizz",actualOrder);
    }
    @Test
    public void should_return_FizzBuzzWhizz_when_count_off_given_order_number_multiple_of_3_and5_and_7(){
        //given
        int order=105;
        FizzBuzz fizzbuzz=new FizzBuzz();
        //when
        String actualOrder=fizzbuzz.countOff(order);
        //then
        assertEquals("FizzBuzzWhizz",actualOrder);
    }
    @Test
    public void should_return_FizzB_when_count_off_given_order_number_contains_3(){
        //given
        int order=130;
        FizzBuzz fizzbuzz=new FizzBuzz();
        //when
        String actualOrder=fizzbuzz.countOff(order);
        //then
        assertEquals("Fizz",actualOrder);
    }


}
