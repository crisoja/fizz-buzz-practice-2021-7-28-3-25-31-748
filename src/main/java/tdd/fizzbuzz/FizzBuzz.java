package tdd.fizzbuzz;

public class FizzBuzz {
        private static final String FIZZ = "Fizz";
    public String countOff(int orderNumber) {

        if(orderNumber == 3){
            return FIZZ;
        }
        else if(orderNumber == 5){
            return "Buzz";
        }

        return String.valueOf(orderNumber);
    }
}
