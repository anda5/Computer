import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anda on 11/27/2015.
 */
public class RomanCalculatorTest {

    private String EXPRESSION = "(X+II)/VI+I-I+MM+C+(MMM/M)";
    private String EXPECTED_RESULT = "MMCV";

    @Test
    public void testCalculate() throws Exception {

        String actual_result = RomanCalculator.calculate(EXPRESSION);
        assertEquals(actual_result,EXPECTED_RESULT);

    }
}