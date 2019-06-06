import calculator.Calculator;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

    //c

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        assertEquals(10, calculator.add(5, 5));
    }

    @Test
    public void testSub() {
        assertEquals(5, calculator.sub(10, 5));
    }

    @Test
    public void testMult() {
        assertEquals(10, calculator.mult(2, 5));
    }

    @Test
    public void testDiv() {
        assertEquals(5, calculator.div(10, 2));
    }

//    @Test
//    public void testDivZero() {
//        assertThrows()
//        assertEquals(5, calculator.add(10, 2));
//    }
}
