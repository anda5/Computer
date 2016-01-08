/**
 * Created by anda on 11/28/2015.
 */
public class StackFactory {

    public enum TypeOfStack{
        CHAR, INT
    };

    public Stack getStack(TypeOfStack type){
        if(type == null) {
            return null;
        }
        else if(type.equals(TypeOfStack.INT)){
            return new StackInteger();
            }
        else if(type.equals(TypeOfStack.CHAR)){
            return new StackChar();
            }
        return null;
    }


}
