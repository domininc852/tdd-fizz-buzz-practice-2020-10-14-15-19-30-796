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
        if (order% MODULO_3 ==0){
            countOff+=FIZZ;
        }
        if (order% MODULO_5 ==0){
            countOff+=BUZZ;
        }
        if (order% MODULO_7 ==0){
            countOff+= WHIZZ;
        }
        return countOff.equals("")?String.valueOf(order):countOff;
    }
}
