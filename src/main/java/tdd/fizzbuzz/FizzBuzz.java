package tdd.fizzbuzz;

public class FizzBuzz {
    private final String FIZZ="Fizz";
    private final String BUZZ="Buzz";
    private final String WHIZZ="Whizz";
    private final int FIZZ_NUMBER=3;
    private final int BUZZ_NUMBER=5;
    private final int WHIZZ_NUMBER=7;
    public String countOff(int order) {
        if ((order%FIZZ_NUMBER==0)&&(order%BUZZ_NUMBER==0)){
            return FIZZ+BUZZ;
        }
        else if ((order%FIZZ_NUMBER==0)&&(order%WHIZZ_NUMBER==0)){
            return FIZZ+WHIZZ;
        }
        else if (order%FIZZ_NUMBER==0){
            return FIZZ;
        }
        else if (order%BUZZ_NUMBER==0){
            return BUZZ;
        }
        else if (order%WHIZZ_NUMBER==0){
            return WHIZZ;
        }
        return String.valueOf(order);
    }
}
