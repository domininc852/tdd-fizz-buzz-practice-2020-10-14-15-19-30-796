package tdd.fizzbuzz;

public class FizzBuzz {
    private final String FIZZ="Fizz";
    private final int FIZZ_NUMBER=3;
    public String countOff(int order) {
        if (order%FIZZ_NUMBER==0){
            return FIZZ;
        }
        else if (order%5==0){
            return "Buzz";
        }
        return String.valueOf(order);
    }
}
