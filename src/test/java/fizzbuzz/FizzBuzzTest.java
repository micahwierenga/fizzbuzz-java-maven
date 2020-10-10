package fizzbuzz;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.Before;

import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FizzBuzzTest {
    private Integer num;
    private String expectedResult;
    private FizzBuzz fizzbuzz;

    @Before
    public void initialize() {
        fizzbuzz = new FizzBuzz();
    }

    public FizzBuzzTest(Integer num, String expectedResult) {
        this.num = num;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection nums() {
        return Arrays.asList(new Object[][] {
                {1, "1"},
                {2, "2"},
                {3, "fizz"},
                {4, "4"},
                {5, "buzz"},
                {6, "fizz"},
                {7, "7"},
                {8, "8"},
                {9, "fizz"},
                {10, "buzz"},
                {11, "11"},
                {12, "fizz"},
                {13, "13"},
                {14, "14"},
                {15, "fizzbuzz"},
                {16, "16"},
                {17, "17"},
                {18, "fizz"},
                {19, "19"},
                {20, "buzz"},
        });
    }

    @Test
    public void returnsNumberWhenDivisibleByThreeAndFive() {
        System.out.println(String.format("num: %d, expected: %s, actual: %s, expected equals actual: %b", num, expectedResult, fizzbuzz.testDivisors(num), expectedResult.equals(fizzbuzz.testDivisors(num))));
        System.out.println("---------------------");
        assertEquals(expectedResult, fizzbuzz.testDivisors(num));
    }
}