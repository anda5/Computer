/**
 * Created by anda on 11/19/2015.
 */
public class Convert {

    private String romanNumber;


    public int getValueOfSimbol(char simbol) {
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

}