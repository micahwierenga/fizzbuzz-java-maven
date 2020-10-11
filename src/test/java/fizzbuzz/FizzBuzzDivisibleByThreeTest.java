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
public class FizzBuzzDivisibleByThreeTest {
    private Integer num;
    private String expectedResult;
    private FizzBuzz fizzbuzz;

    @Before
    public void initialize() {
        fizzbuzz = new FizzBuzz();
    }

    public FizzBuzzDivisibleByThreeTest(Integer num, String expectedResult) {
        this.num = num;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection nums() {
        return Arrays.asList(new Object[][] {
                {3, "fizz"},
                {9, "fizz"},
                {18, "fizz"},
                {63, "fizz"},
                {597, "fizz"},
                {999, "fizz"},
        });
    }

    @Test
    public void returnsFizzWhenDivisibleByThree() {
        assertEquals(expectedResult, fizzbuzz.testDivisors(num));
    }
}