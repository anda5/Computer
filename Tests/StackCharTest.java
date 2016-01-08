import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anda on 11/27/2015.
 */
public class StackCharTest {


    @Test
    public void testIsEmpty() {

        StackChar stackChar = new StackChar();

        assertTrue(stackChar.isEmpty());
    }

    @Test
    public void testPush() {

        StackChar stackChar = new StackChar();
        stackChar.push('a');
        stackChar.push('b');

        assertTrue(!stackChar.isEmpty());
    }

    @Test
    public void testPop(){

        StackChar stackChar = new StackChar();
        stackChar.push('v');
        stackChar.push('x');

        assertEquals('x',stackChar.pop());
        assertEquals('v',stackChar.pop());
    }

    @Test
    public void testPeek() throws Exception {

        StackChar stackChar = new StackChar();
        stackChar.push('n');
        stackChar.push('a');
        stackChar.push('p');
        stackChar.push('a');

        assertEquals('a',stackChar.peek());
    }
}