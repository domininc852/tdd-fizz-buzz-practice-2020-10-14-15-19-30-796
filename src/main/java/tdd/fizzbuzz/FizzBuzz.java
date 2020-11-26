package tdd.fizzbuzz;

public class FizzBuzz {
    private final String FIZZ="Fizz";
    private final String BUZZ="Buzz";
    private final String WHIZZ="Whizz";
    private final int MODULO_3 =3;
    private final int MODULO_5 =5;
    private final int MODULO_7 =7;
    public String countOff(int order) {
        String countOff="";
        boolean isMultipleOfThree=order% MODULO_3 ==0;
        boolean isMultipleOfFive=order% MODULO_5 ==0;
        boolean isMultipleOfSeven=order% MODULO_7 ==0;
        if (String.valueOf(order).contains("3")){
            return FIZZ;
        }
        if (isMultipleOfThree){
            countOff+=FIZZ;
        }
        if (isMultipleOfFive){
            countOff+=BUZZ;
        }
        if (isMultipleOfSeven){
            countOff+= WHIZZ;
        }
        return countOff.equals("")?String.valueOf(order):countOff;
    }
}
