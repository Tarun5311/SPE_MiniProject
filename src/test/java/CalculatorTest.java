import org.junit.Test;
import static org.junit.Assert.*;


public class CalculatorTest {

    private static final double DELTA = 1e-15;
    Calculator calc = new Calculator();
    @Test
    public void sqrootTruePositive()
    {
        assertEquals(2, calc.sqroot(4), DELTA);
        assertEquals(12, calc.sqroot(144), DELTA);
        assertEquals(7, calc.sqroot(49), DELTA);

    }

    @Test
    public void sqrootFalsePositive()
    {
        assertNotEquals(13, calc.sqroot(121), DELTA);
        assertNotEquals(24, calc.sqroot(81), DELTA);
        assertNotEquals(12, calc.sqroot(100), DELTA);

    }

    @Test
    public void factorialTruePositive()
    {
        assertEquals(24, calc.factorial(4), DELTA);
        assertEquals(1, calc.factorial(0), DELTA);
        assertEquals(5040, calc.factorial(7), DELTA);
    }

    @Test
    public void factorialFalsePositive()
    {
        assertNotEquals(24, calc.factorial(2), DELTA);
        assertNotEquals(0, calc.factorial(0), DELTA);
        assertNotEquals(583620, calc.factorial(10), DELTA);
    }

    @Test
    public void lnxTruePositive()
    {
        assertEquals(0, calc.lnx(1), DELTA);
    }

    @Test
    public void lnxFalsePositive()
    {
        assertNotEquals(2.652, calc.lnx(2), DELTA);

    }

    @Test
    public void powerTruePositive()
    {
        assertEquals(64, calc.power(4, 3), DELTA);
        assertEquals(625, calc.power(5, 4), DELTA);
        assertEquals(49, calc.power(7, 2), DELTA);
    }

    @Test
    public void powerFalsePositive()
    {
        assertNotEquals(16, calc.power(2, 5), DELTA);
        assertNotEquals(64, calc.power(8, 4), DELTA);
        assertNotEquals(10000, calc.power(10, 7), DELTA);
    }



}
