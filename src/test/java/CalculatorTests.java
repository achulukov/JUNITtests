import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTests {

    public static Calculator calc = Calculator.instance.get();

    @Test
    public void testPlus() {
        int a = 2, b = 2, expected = 4;

        int result = calc.plus.apply(a, b);

        assertThat(expected, equalTo(result));

    }

    @Test
    public  void testMinus() {
        int a = 5, b = 2;

        Integer expected = 3;

        Integer result = calc.minus.apply(a, b);

        assertThat(expected, equalTo(result));

    }

    @Test
    public  void testMultiply() {
        int a = 5, b = 2, expected = 10;

        int result = calc.multiply.apply(a, b);

        assertThat(expected, equalTo(result));

    }

    @Test
    public  void testDevide() {
        int a = 6, b = 2, expected = 3;

        int result = calc.devide.apply(a, b);

        assertThat(expected, equalTo(result));

    }



}
