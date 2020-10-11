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
public class FizzBuzzNotDivisibleByThreeOrFive {
    private Integer num;
    private String expectedResult;
    private FizzBuzz fizzbuzz;

    @Before
    public void initialize() {
        fizzbuzz = new FizzBuzz();
    }

    public FizzBuzzNotDivisibleByThreeOrFive(Integer num, String expectedResult) {
        this.num = num;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection nums() {
        return Arrays.asList(new Object[][] {
                {1, "1"},
                {2, "2"},
                {4, "4"},
                {7, "7"},
                {8, "8"},
                {11, "11"},
                {13, "13"},
                {14, "14"},
                {16, "16"},
                {17, "17"},
                {19, "19"},
                {51, "51"},
                {734, "734"},
        });
    }

    @Test
    public void returnsFizzbuzzSeries() {
        assertEquals(expectedResult, fizzbuzz.testDivisors(num));
    }
}