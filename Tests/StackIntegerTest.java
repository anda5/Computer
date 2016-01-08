import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anda on 11/27/2015.
 */
public class StackIntegerTest {


    @Test
    public void testIsEmpty() {

        StackInteger stackInteger = new StackInteger();

        assertTrue(stackInteger.isEmpty());
    }

    @Test
    public void testPush() {

        StackInteger stackInteger = new StackInteger();
        stackInteger.push(1);
        stackInteger.push(2);

        assertTrue(!stackInteger.isEmpty());
    }

    @Test
    public void testPop(){

        StackInteger stackInteger = new StackInteger();
        stackInteger.push(2);
        stackInteger.push(5);

        assertEquals(5,stackInteger.pop());
        assertEquals(2,stackInteger.pop());
    }

    @Test
    public void testPeek() throws Exception {

        StackInteger stackInteger = new StackInteger();
        stackInteger.push(2);
        stackInteger.push(5);
        stackInteger.push(9);
        stackInteger.push(10);

        assertEquals(10,stackInteger.peek());
    }
}