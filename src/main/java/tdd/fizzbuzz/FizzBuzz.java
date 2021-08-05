package tdd.fizzbuzz;

public class FizzBuzz {
    public String countOff(int orderNumber) {

        if(orderNumber == 3){
            return "Fizz";
        }
        return String.valueOf(orderNumber);
    }
}
