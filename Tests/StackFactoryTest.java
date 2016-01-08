import org.junit.Test;
import org.junit.validator.PublicClassValidator;

import static org.junit.Assert.*;

/**
 * Created by anda on 11/28/2015.
 */
public class StackFactoryTest {



    @Test
    public void testGetStack() throws Exception {

        StackFactory stackFactory = new StackFactory();
        boolean EXPECTED_CHAR = (stackFactory.getStack(StackFactory.TypeOfStack.CHAR)) instanceof StackChar;
        boolean EXPECTED_INT = (stackFactory.getStack(StackFactory.TypeOfStack.INT)) instanceof StackInteger;

        assertTrue(EXPECTED_CHAR);
        assertTrue(EXPECTED_INT);

    }
}