import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anda on 11/27/2015.
 */
public class OperatorsTest {

    @Test
    public void testComparePriority()  {

        char result = Operators.comparePriority(Operators.ADDITION, Operators.SUBTRACTION);
        char result1 = Operators.comparePriority(Operators.SUBTRACTION, Operators.MULTIPLICATION);
        char result2 = Operators.comparePriority(Operators.MULTIPLICATION, Operators.ADDITION);

        assertEquals(Operators.ADDITION, result);
        assertEquals(Operators.SUBTRACTION, result1);
        assertEquals(Operators.ADDITION, result2);

    }

    @Test
    public void testIsOperator(){

        assertTrue(Operators.isOperator(Operators.ADDITION));
        assertTrue(Operators.isOperator(Operators.SUBTRACTION));
        assertTrue(Operators.isOperator(Operators.DIVISION));
        assertTrue(Operators.isOperator(Operators.MULTIPLICATION));
        assertTrue(Operators.isOperator(Operators.POWER));

    }
}