/**
 * Created by anda on 11/23/2015.
 */
public class PostfixForm {

    private StackFactory stackFactory;
    private int numberOfLeftBracket;
    private int numberOfRightBracket;
    private boolean strangeCharacter;

    public PostfixForm() {
        this.stackFactory = new StackFactory();
        this.numberOfLeftBracket = 0;
        this.numberOfRightBracket = 0;
        this.strangeCharacter = false;
    }

    public String transformInPostfixForm(String infixForm) throws Exception {

        String expression = " ";
        char[] arrayNumbers = infixForm.toCharArray();
        Stack stackChar = stackFactory.getStack(StackFactory.TypeOfStack.CHAR);

        expression = postFixAlgorithm(arrayNumbers,expression,stackChar);

        if(strangeCharacter == true){
                throw new Exception(Utils.STRANGE_CHARACTER);
        }
        else if(numberOfLeftBracket!=numberOfRightBracket){
            throw new Exception(Utils.BRACKETS_ERROR);
        }else{
            while (!stackChar.isEmpty()) {
                expression += " " + stackChar.pop();
            }
        }
        return expression;
    }

    public String evaluatePostfixForm(String expression) throws Exception {

        String elements[] = expression.split(" ");
        Stack stackInteger = stackFactory.getStack(StackFactory.TypeOfStack.INT);
        for (int i = 0; i < elements.length; i++) {
            if(elements[i].equals("*") || elements[i].equals("+") || elements[i].equals("/") || elements[i].equals("-")|| elements[i].equals("^")) {
                calculateResult(elements[i],stackInteger);
            }
            else if (!elements[i].isEmpty()) {
                stackInteger.push(Convert.toNumber(elements[i]));
            }
        }
    return Convert.toRoman((Integer)stackInteger.pop());
}


    private void calculateResult(String element, Stack stack) {

        int result = 0;
        int firstNumber = (int) stack.pop();
        int secondNumber = (int) stack.pop();

            if (element.equals("+")) {
                result = firstNumber + secondNumber;
            } else if (element.equals("/")) {
                result = secondNumber / firstNumber;
            } else if (element.equals("-")) {
                result = secondNumber - firstNumber;
            } else if (element.equals("*")) {
                result = firstNumber * secondNumber;
            }
            else if (element.equals("^")) {
                result = (int) Math.pow(secondNumber,firstNumber);
            }
            stack.push(result);
        }

    private String postFixAlgorithm(char arrayNumbers[], String expression, Stack stackChar){


        for (int i = 0; i < arrayNumbers.length; i++) {
            if (Character.isLetter(arrayNumbers[i])) {
                expression += arrayNumbers[i];
            }
            if (!Character.isLetter(arrayNumbers[i])) {
                expression += " ";
            }
            if(Character.isLetter(arrayNumbers[i])==false&&Operators.isOperator(arrayNumbers[i])==false&&Operators.isBracket(arrayNumbers[i])==false&&!Character.isWhitespace(arrayNumbers[i])){
                strangeCharacter = true;
            }
            if (arrayNumbers[i] == Operators.LEFT_BRACKET) {
                numberOfLeftBracket++;
                stackChar.push(arrayNumbers[i]);
            }
            if (arrayNumbers[i] == Operators.RIGHT_BRACKET) {
                numberOfRightBracket++;
                if(!stackChar.isEmpty()) {
                    while ((char) stackChar.peek() != Operators.LEFT_BRACKET) {
                        expression += stackChar.pop();
                        expression += " ";
                    }
                }
                stackChar.pop();
            }
            if (Operators.isOperator(arrayNumbers[i])) {
                while (arrayNumbers[i] == Operators.comparePriority(arrayNumbers[i], (char) stackChar.peek())) {
                    expression += stackChar.pop() + " ";
                }
                stackChar.push(arrayNumbers[i]);
            }
        }

       return expression;

    }

}







