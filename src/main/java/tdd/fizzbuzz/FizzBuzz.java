package tdd.fizzbuzz;

public class FizzBuzz {
    private final String FIZZ="Fizz";
    private final String BUZZ="Buzz";
    private final int FIZZ_NUMBER=3;
    private final int BUZZ_NUMBER=5;
    public String countOff(int order) {
        if (order%FIZZ_NUMBER==0){
            return FIZZ;
        }
        else if (order%BUZZ_NUMBER==0){
            return BUZZ;
        }
        else if (order%7==0){
            return "Whizz";
        }
        return String.valueOf(order);
    }
}
