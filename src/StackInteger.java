/**
 * Created by anda on 11/21/2015.
 */
public class StackInteger extends Stack{



    @Override
    public boolean isEmpty() {

        if(_node == null)
            return true;
        else
            return false;
    }

    @Override
    public void push(Object object) {

        int number = (int)object;
        Node pushNode = new Node(number);
        pushNode.next = _node;
        _node = pushNode;

    }

    @Override
    public Object pop() {

        int number;

        if(!isEmpty()) {
            number = _node.intValue;
            _node = _node.next;
        }
        else{
            number = 0;
            }

        return number;
    }

    @Override
    public Object peek() {

        int number;

        if(!isEmpty()) {
            number = _node.intValue;
        }
        else {
            number=0;
        }

        return number;

    }
}
