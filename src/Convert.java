import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.StringTokenizer;

/**
 * Created by anda on 11/19/2015.
 */
public class Convert {


    public static int getNumber(String romanNumber){
        char[] arrayNumbers;
        int sum;

        if (isValid(romanNumber)) {
            arrayNumbers = romanNumber.toCharArray();
            if(arrayNumbers.length%2!=0){
                romanNumber.toString().concat("");
            }

          sum = calculateSum(arrayNumbers);

        }
        else {
           System.out.println("This is not a valid roman number");
            sum =0;
        }
        return  sum;

    }


     private static int getValueOfSimbol(char simbol) {
        int integerValue = 0;
        switch (simbol) {
            case ('I'):
                integerValue = 1;
                break;
            case ('V'):
                integerValue = 5;
                break;
            case ('X'):
                integerValue = 10;
                break;
            case ('L'):
                integerValue = 50;
                break;
            case ('C'):
                integerValue = 100;
                break;
            case ('D'):
                integerValue = 500;
                break;
            case ('M'):
                integerValue = 1000;
                break;
        }
      return integerValue;

    }

    private static boolean isValid(String romanNumber) {

        if (romanNumber.matches("^(M{0,3})(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$"))
        { return true;
        }else {
            return false;
        }
    }

    private static int calculateSum(char[] array){
        int sum = 0;
        for(int i=0;i<array.length;i+=2){

            int first =   getValueOfSimbol(array[i]);
            int second =  getValueOfSimbol(array[i+1]);
            if(first>=second){
                sum += first+second;
            }else if(first<second){
                sum += second-first;
            }

        }
        return sum;
    }

}
