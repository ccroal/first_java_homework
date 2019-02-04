import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void canAdd() {
        int result = calculator.add(4, 5);
        assertEquals(9, result);
    }

    @Test
    public void canSubtract() {
        int result = calculator.subtract(6, 2);
        assertEquals(4, result);
    }

    @Test
    public void canMultiply() {
        int result = calculator.multiply(2, 4);
        assertEquals(8, result);
    }

    @Test
    public void canDivide(){
        int result = calculator.divide(8, 4);
        assertEquals(2, result);
    }
}
