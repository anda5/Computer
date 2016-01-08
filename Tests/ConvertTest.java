import org.junit.Test;

import javax.xml.soap.SAAJResult;

import static org.junit.Assert.*;


/**
 * Created by anda on 11/23/2015.
 */
public class ConvertTest {

    private final int  NUMBER = 125;
    private final int  NUMBER1 = 1;
    private final int  NUMBER2 = 15;
    private final int  NUMBER3 = 3000;
    private final int NEGATIVE_NUMBER = -10;
    private final String ROMAN_NUMBER = "CXXV";
    private final String ROMAN_NUMBER1 = "I";
    private final String ROMAN_NUMBER2 = "XV";
    private final String ROMAN_NUMBER3 =  "MMM";
    private final String ROMAN_NUMBER_NEGATIVE = "-X";
    public final String INVALID_ROMAN_NUMBER = "MCMC";
    public final String INVALID_ROMAN_NUMBER1 = "ccccF";


    @org.junit.Test
    public void testToRomanConvert(){

         String resultPositiveNumber = Convert.toRoman(NUMBER);
         String resultNumber1 = Convert.toRoman(NUMBER1);
         String resultNumber2 = Convert.toRoman(NUMBER2);
         String resultNumber3 = Convert.toRoman(NUMBER3);
         String resultNegativeNumber = Convert.toRoman(NEGATIVE_NUMBER);
         String resultZeroNumber = Convert.toRoman(0);

         assertEquals(ROMAN_NUMBER, resultPositiveNumber);
         assertEquals(ROMAN_NUMBER1, resultNumber1);
         assertEquals(ROMAN_NUMBER2, resultNumber2);
         assertEquals(ROMAN_NUMBER3, resultNumber3);
         assertEquals(ROMAN_NUMBER_NEGATIVE, resultNegativeNumber);
         assertEquals("", resultZeroNumber);
    }

    @org.junit.Test
    public void testToNumberConvert() throws Exception {

        int resultPositive = Convert.toNumber(ROMAN_NUMBER);
        assertEquals(NUMBER, resultPositive);

    }
    @Test
    public void testExpectedExceptionInvalid() {
        try {
            int resultInvalid = Convert.toNumber(INVALID_ROMAN_NUMBER);
            fail("Should have thrown an Exception because roman number is not valid!");
        } catch (Exception e) {
            assertTrue(e.getMessage().equals(Utils.INVALID_NUMBER));
        }
    }
    @Test
    public void testExpectedExceptionInvalid1() {
        try {
            int resultInvalid1 = Convert.toNumber(INVALID_ROMAN_NUMBER1);
            fail("Should have thrown an Exception because roman number is not valid(containing 4 cccc)!");
        } catch (Exception e) {
            assertTrue(e.getMessage().equals(Utils.INVALID_NUMBER));
        }
    }

}