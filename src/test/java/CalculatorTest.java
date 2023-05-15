import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void hasAddFunction(){
        assertEquals(5, calculator.addTotal(2, 3));
    }

    @Test
    public void hasSubtractFunction(){
        assertEquals(3, calculator.subtractTotal(5, 2));
    }

    @Test
    public void hasMultiplyFunction(){
        assertEquals(6, calculator.multiplyTotal(3, 2));
    }

    @Test
    public void hasDivideFunction(){
        assertEquals(3.5, calculator.divideTotal(7, 2), 0.0);
    }


}


