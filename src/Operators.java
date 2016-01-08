import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by anda on 11/20/2015.
 */
public class Operators {

    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';
    public static final char POWER = '^';
    public static final char RIGHT_BRACKET = ')';
    public static final char LEFT_BRACKET = '(';


     private static int getPriority(char operator) {

        int priority = 0;

        switch (operator) {
            case ADDITION:         priority = 1;
                                   break;
            case SUBTRACTION:      priority = 1;
                                   break;
            case MULTIPLICATION:   priority = 2;
                                   break;
            case DIVISION:         priority = 2;
                                   break;
            case POWER:            priority = 2;
                                   break;
        }
        return priority;
    }

    public static char comparePriority(char firstOperator, char secondOperator){
      //get the lowest operator priority
        if(getPriority(firstOperator)<=getPriority(secondOperator)){
            return firstOperator;
        }else {
            return secondOperator;
        }
    }

    public static boolean isOperator(char character){

        List<Character> operatorsNames = Arrays.asList(Operators.ADDITION,Operators.DIVISION,Operators.MULTIPLICATION,Operators.SUBTRACTION,Operators.POWER);
        if(operatorsNames.contains(character))
            return true;
        else {
            return false;
        }
    }
    public static boolean isBracket(char character){
        List<Character> operatorsNames = Arrays.asList(Operators.LEFT_BRACKET,Operators.RIGHT_BRACKET);
        if(operatorsNames.contains(character))
            return true;
        else {
            return false;
        }
    }


}
