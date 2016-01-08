/**
 * Created by anda on 11/23/2015.
 */
public class StackChar extends Stack {



    @Override
    public boolean isEmpty() {

        if(_node == null)
            return true;
        else
            return false;
    }

    @Override
    public void push(Object object) {

        char  objectStr = (char)object;
        Node pushNode = new Node(objectStr);
        pushNode.next = _node;
        _node = pushNode;

    }

    @Override
    public Object pop() {

        char object=' ';

        if(!isEmpty()) {
            object = _node.strValue;
            _node = _node.next;
        }


        return object;
    }

    @Override
    public Object peek() {

        char object=' ';

        if(!isEmpty()) {
            object = _node.strValue;
        }
        return object;

    }
}
