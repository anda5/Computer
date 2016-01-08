
/**
 * Created by anda on 11/19/2015.
 */
public class Convert {


    public static String toRoman(int number) {

        String negativeResult="-";//for negative numbers
        if(number<0){
            number = (-1)*number;
            return negativeResult+getRomanNumber(number);
        }else {
            return getRomanNumber(number);
        }
    }

    public static int toNumber(String romanNumber) throws Exception {

        int number = 0;
        char[] _arrayNumbers;
        if(isValid(romanNumber)) {
            _arrayNumbers = romanNumber.toCharArray();
            if(_arrayNumbers.length%2!=0){
                number = calculateSum((romanNumber+" ").toCharArray());
            }else {
                number = calculateSum(_arrayNumbers);
            }
        }
        else{
                throw new Exception(Utils.INVALID_NUMBER);
        }
        return  number;

    }

    private static boolean isValid(String romanNumber) {

        if(romanNumber==" ") {
            return true;
        }
        return  (romanNumber.matches(Utils.VALIDATION_REGEX))?true:false;
    }

    private static int calculateSum(char[] array){ //get two symbols and compare them
        int result = 0;
        for(int i=0;i<array.length;i+=2){

            int firstSymbol = Symbols.getValueOfSymbol(array[i]);
            int secondSymbol = Symbols.getValueOfSymbol(array[i+1]);

            if(firstSymbol>=secondSymbol){
                result += firstSymbol+secondSymbol;
            }else if(firstSymbol<secondSymbol){
                result += secondSymbol-firstSymbol;
            }
        }
        return result;
    }

    private static String getRomanNumber(int number){

      int  _units = number%10;
      int  _tens = number/10%10;
      int  _hundred = number/100%10;
      int  _thousand = number/1000%10;

        return   (Symbols.getThousand(_thousand) + Symbols.getHundred(_hundred) + Symbols.getTens(_tens) + Symbols.getUnit(_units)).replaceAll("\\s","");

    }

}


