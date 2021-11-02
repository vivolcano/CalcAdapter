import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IntsCalculatorTest {

    public static IntsCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new IntsCalculator();
    }

    @Test
    void sum() {

        // arrange
        final int a = 3;
        final int b = 3;
        final int expected = 6;

        // act
        final int actual = calculator.sum(a, b);

        // assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    void mult() {

        // arrange
        final int a = 3;
        final int b = 3;
        final int expected = 9;

        // act
        final int actual = calculator.mult(a, b);

        // assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    void pow() {

        // arrange
        final int a = 3;
        final int b = 3;
        final int expected = 27;

        // act
        final int actual = calculator.pow(a, b);

        // assert
        Assert.assertEquals(expected, actual);
    }
}