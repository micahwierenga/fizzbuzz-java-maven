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
public class FizzBuzzDivisibleByThreeAndFiveTest {
    private Integer num;
    private String expectedResult;
    private FizzBuzz fizzbuzz;

    @Before
    public void initialize() {
        fizzbuzz = new FizzBuzz();
    }

    public FizzBuzzDivisibleByThreeAndFiveTest(Integer num, String expectedResult) {
        this.num = num;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection nums() {
        return Arrays.asList(new Object[][] {
                {15, "fizzbuzz"},
                {30, "fizzbuzz"},
                {150, "fizzbuzz"},
                {600, "fizzbuzz"},
                {915, "fizzbuzz"},
        });
    }

    @Test
    public void returnsFizzbuzzWhenDivisibleByThreeAndFive() {
        assertEquals(expectedResult, fizzbuzz.testDivisors(num));
    }
}