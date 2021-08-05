package tdd.fizzbuzz;

public class FizzBuzz {
        private static final String FIZZ = "Fizz";
        private static final String BUZZ = "Buzz";
    public String countOff(int orderNumber) {

        if(orderNumber == 3){
            return FIZZ;
        }
        else if(orderNumber == 5){
            return BUZZ;
        }
        else if(orderNumber == 15){
            return "FizzBuzz";
        }
        return String.valueOf(orderNumber);
    }
}
