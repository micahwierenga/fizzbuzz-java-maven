package fizzbuzz;

public class FizzBuzz {
    public void printSeries(int num) {
        for (int i=1; i<=num; i++) {
            System.out.println(testDivisors(i));
        }
    }

    public String testDivisors(int num) {
        if(num % 15 == 0) {
            return "fizzbuzz";
        } else if(num % 5 == 0) {
            return "buzz";
        } else if(num % 3 == 0) {
            return "fizz";
        } else {
            return Integer.toString(num);
        }
    }
}

