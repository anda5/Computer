/**
 * Created by anda on 11/23/2015.
 */
public class Symbols {


    private static final char SYMBOL_0 = ' ';
    private static final char SYMBOL_1 = 'I';
    private static final char SYMBOL_5 = 'V';
    private static final char SYMBOL_10 = 'X';
    private static final char SYMBOL_50 = 'L';
    private static final char SYMBOL_100 = 'C';
    private static final char SYMBOL_500 = 'D';
    private static final char SYMBOL_1000 = 'M';

    public static int getValueOfSymbol(char symbol) {

        int symbolValue = 0;
        switch (symbol) {
            case (SYMBOL_0):  symbolValue = 0;
                break;
            case (SYMBOL_1):  symbolValue = 1;
                break;
            case (SYMBOL_5):  symbolValue = 5;
                break;
            case (SYMBOL_10):  symbolValue = 10;
                break;
            case (SYMBOL_50):  symbolValue = 50;
                break;
            case (SYMBOL_100):  symbolValue = 100;
                break;
            case (SYMBOL_500):  symbolValue = 500;
                break;
            case (SYMBOL_1000):  symbolValue = 1000;
                break;
        }
        return symbolValue;

    }
    public static String getUnit(int number){

        String result="";
        switch (number){
            case 0:  result += RomanNumber.UNIT_ZERO.getValue(); break;
            case 1:  result += RomanNumber.UNIT_ONE.getValue(); break;
            case 2:  result += RomanNumber.UNIT_TWO.getValue(); break;
            case 3:  result += RomanNumber.UNIT_THREE.getValue(); break;
            case 4:  result += RomanNumber.UNIT_FOUR.getValue(); break;
            case 5:  result += RomanNumber.UNIT_FIVE.getValue(); break;
            case 6:  result += RomanNumber.UNIT_SIX.getValue(); break;
            case 7:  result += RomanNumber.UNIT_SEVEN.getValue(); break;
            case 8:  result += RomanNumber.UNIT_EIGHT.getValue(); break;
            case 9:  result += RomanNumber.UNIT_NINE.getValue(); break;
        }
        return result;

    }
    public static String getTens(int number){

        String result="";
        switch (number){
            case 0:  result += RomanNumber.TENS_ZERO.getValue(); break;
            case 1:  result += RomanNumber.TENS_ONE.getValue(); break;
            case 2:  result += RomanNumber.TENS_TWO.getValue(); break;
            case 3:  result += RomanNumber.TENS_THREE.getValue(); break;
            case 4:  result += RomanNumber.TENS_FOUR.getValue(); break;
            case 5:  result += RomanNumber.TENS_FIVE.getValue(); break;
            case 6:  result += RomanNumber.TENS_SIX.getValue(); break;
            case 7:  result += RomanNumber.TENS_SEVEN.getValue(); break;
            case 8:  result += RomanNumber.TENS_EIGHT.getValue(); break;
            case 9:  result += RomanNumber.TENS_NINE.getValue(); break;
        }
        return result;

    }
    public static String getHundred(int number){

        String result="";
        switch (number){
            case 0:  result += RomanNumber.HUNDRED_ZERO.getValue(); break;
            case 1:  result += RomanNumber.HUNDRED_ONE.getValue(); break;
            case 2:  result += RomanNumber.HUNDRED_TWO.getValue() ; break;
            case 3:  result += RomanNumber.HUNDRED_THREE.getValue(); break;
            case 4:  result += RomanNumber.HUNDRED_FOUR.getValue(); break;
            case 5:  result += RomanNumber.HUNDRED_FIVE.getValue(); break;
            case 6:  result += RomanNumber.HUNDRED_SIX.getValue(); break;
            case 7:  result += RomanNumber.HUNDRED_SEVEN.getValue(); break;
            case 8:  result += RomanNumber.HUNDRED_EIGHT.getValue(); break;
            case 9:  result += RomanNumber.HUNDRED_NINE.getValue(); break;
        }
        return result;

    }
    public static String getThousand(int number){

        String result="";
        switch (number){
            case 0:  result += RomanNumber.THOUSAND_ZERO.getValue(); break;
            case 1:  result += RomanNumber.THOUSAND_ONE.getValue(); break;
            case 2:  result += RomanNumber.THOUSAND_TWO.getValue(); break;
            case 3:  result += RomanNumber.THOUSAND_THREE.getValue(); break;
        }
        return result;
    }
}
