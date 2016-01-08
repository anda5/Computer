import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

/**
 * Created by anda on 11/27/2015.
 */
public class PostfixFormTest {



    private final String EXPRESSION = "V+X+II-I";
    private final String EXPRESSION1 = "X*II/II+II-I";
    private final String EXPRESSION2 = "(MX+I-(VI+X/II)+V))";
    private final String EXPRESSION3 = "(MCCLV-CC+XXX/II&&)";
    private final String POSTFIX_FORM_EXPRESSION = " V X + II + I -";
    private final String POSTFIX_FORM_EXPRESSION1 = " X II * II / II + I -";
    private final String POSTFIX_FORM_EXPRESSION2 = "";
    private final String POSTFIX_FORM_EXPRESSION3 = "";
    private final String RESULT_POSTFIX = "XVI";
    private final String RESULT_POSTFIX1 = "XI";
    private final String RESULT_POSTFIX2 = "";
    private final String RESULT_POSTFIX3 = "";

    @Test
    public void testExpectedException() {
        try {
            PostfixForm postfixForm = new PostfixForm();
            String result2 = postfixForm.transformInPostfixForm(EXPRESSION2);
            fail("Should have thrown an Exception because number of brackets is not correct!");
        } catch (Exception e) {
            assertTrue(e.getMessage().equals(Utils.BRACKETS_ERROR));
        }
    }

    @Test
    public void testExpectedException3() {
        try {
            PostfixForm postfixForm = new PostfixForm();
            String result3 = postfixForm.transformInPostfixForm(EXPRESSION3);
            fail("Should have thrown an Exception because the expression contains strange characters!");
        } catch (Exception e) {
            assertTrue(e.getMessage().equals(Utils.STRANGE_CHARACTER));
        }
    }




    @Test
    public void testTransformInPostfixForm() throws Exception {

        PostfixForm postfixForm = new PostfixForm();
        String result = postfixForm.transformInPostfixForm(EXPRESSION);
        String result1 = postfixForm.transformInPostfixForm(EXPRESSION1);


        assertEquals(POSTFIX_FORM_EXPRESSION, result);
        assertEquals(POSTFIX_FORM_EXPRESSION1, result1);



    }

    @Test
    public void testEvaluatePostfixForm(){

        PostfixForm postfixForm = new PostfixForm();
        try {
            String result = postfixForm.evaluatePostfixForm(POSTFIX_FORM_EXPRESSION);
            String result1 = postfixForm.evaluatePostfixForm(POSTFIX_FORM_EXPRESSION1);
            String result2 = postfixForm.evaluatePostfixForm(POSTFIX_FORM_EXPRESSION2);
            String result3 = postfixForm.evaluatePostfixForm(POSTFIX_FORM_EXPRESSION3);


            assertEquals(RESULT_POSTFIX,result);
            assertEquals(RESULT_POSTFIX1,result1);
            assertEquals(RESULT_POSTFIX2,result2);
            assertEquals(RESULT_POSTFIX3,result3);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}