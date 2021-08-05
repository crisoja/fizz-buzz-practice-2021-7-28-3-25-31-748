package tdd.fizzbuzz;

public class FizzBuzz {
        private static final String FIZZ = "Fizz";
        private static final String BUZZ = "Buzz";
        private static final String WHIZZ = "Whizz";
    public String countOff(int orderNumber) {

        if(orderNumber == 3){
            return FIZZ;
        }
        else if(orderNumber == 5){
            return BUZZ;
        }
        else if(orderNumber == 7){
            return WHIZZ;
        }
        else if(orderNumber == 15){
            return FIZZ + BUZZ;
        }
        return String.valueOf(orderNumber);
    }
}
