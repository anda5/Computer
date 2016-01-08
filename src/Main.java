import java.util.Arrays;
import java.util.List;

/**
 * Created by anda on 11/19/2015.
 */
public class Main {

    public static void main(String args[]) throws Exception {

        String expression = "((I+II*III-IV)*V)";
        String result = RomanCalculator.calculate(expression);

        System.out.print(result);

    }
}

























