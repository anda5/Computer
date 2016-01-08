import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anda on 11/27/2015.
 */
public class SymbolsTest {

    private static final char SYMBOL_0 = ' ';
    private static final char SYMBOL_1 = 'I';
    private static final char SYMBOL_5 = 'V';
    private static final char SYMBOL_10 = 'X';
    private static final char SYMBOL_50 = 'L';
    private static final char SYMBOL_100 = 'C';
    private static final char SYMBOL_500 = 'D';
    private static final char SYMBOL_1000 = 'M';
    private static final int NUMBER = 2569;

    @Test
    public void testGetValueOfSymbol() {

        assertEquals(Symbols.getValueOfSymbol(SYMBOL_0),0);
        assertEquals(Symbols.getValueOfSymbol(SYMBOL_1),1);
        assertEquals(Symbols.getValueOfSymbol(SYMBOL_5),5);
        assertEquals(Symbols.getValueOfSymbol(SYMBOL_10),10);
        assertEquals(Symbols.getValueOfSymbol(SYMBOL_50),50);
        assertEquals(Symbols.getValueOfSymbol(SYMBOL_100),100);
        assertEquals(Symbols.getValueOfSymbol(SYMBOL_500),500);
        assertEquals(Symbols.getValueOfSymbol(SYMBOL_1000),1000);

    }

    @Test
    public void testGetUnitTensHundredThousand() {

        int units= NUMBER%10;
        int tens = NUMBER/10%10;
        int hundred = NUMBER/100%10;
        int thousand = NUMBER/1000%10;


         assertEquals(Symbols.getUnit(units),RomanNumber.UNIT_NINE.getValue());
         assertEquals(Symbols.getTens(tens),RomanNumber.TENS_SIX.getValue());
         assertEquals(Symbols.getHundred(hundred),RomanNumber.HUNDRED_FIVE.getValue());
         assertEquals(Symbols.getThousand(thousand),RomanNumber.THOUSAND_TWO.getValue());

    }


}