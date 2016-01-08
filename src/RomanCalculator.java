/**
 * Created by anda on 11/23/2015.
 */
public class RomanCalculator {

    private static PostfixForm _postfixForm = new PostfixForm();
    private static String _result = "";
    private static String _expressionInPostfixForm = "";

    public static String calculate(String expression) throws Exception {

        _expressionInPostfixForm = _postfixForm.transformInPostfixForm(expression);
        _result = _postfixForm.evaluatePostfixForm(_expressionInPostfixForm);

        return  _result;
    }

}
