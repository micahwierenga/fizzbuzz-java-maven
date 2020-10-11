package fizzbuzz;

public class FizzBuzz {
    private String seriesString = "";

    public String printSeries(int num) {
        String spacer = " ";
        for (int i=1; i<=num; i++) {
            seriesString += testDivisors(i);
            if(i!=num) seriesString += spacer;
        }
        System.out.println(seriesString);
        return seriesString;
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

