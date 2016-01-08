/**
 * Created by anda on 11/23/2015.
 */
public abstract class Stack {

     public Node _node;

    abstract boolean isEmpty();
    abstract void push(Object object);
    abstract Object pop();
    abstract Object peek();

     public class Node {

          public Node next;
          public int  intValue;
          public char strValue;

          public Node(int valoareInt) {
               this.intValue = valoareInt;
          }
          public Node(char valueStr){
               this.strValue = valueStr;
          }
     }
}
