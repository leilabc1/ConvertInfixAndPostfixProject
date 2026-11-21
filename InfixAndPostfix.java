/* needs the following methods: 
pushToStack
popToStack
isEmptyStack
convertToInFix
convertToPostFix
*/

/* John is doing token helpers- isInteger, isOperator, isOpenParentheses, isClosedParentheses, and convertToInFix along with 
any other helper methods that are needed for the project. */

// Leila is doing pushToStack, popToStack, isEmptyStack, convertToPostFix, and peek (helper method)

public class InfixandPostfix {

    // data field that points to top of stack, null if stack is empty
    private Node<String> head; 

    // default constructor 
    public InfixAndPostfix() {

        head = null; 

    }

    // stack method- puts new item on top of stack 
    public void pushToStack(String value) {

        head = new Node<String>(value, head);

    }

    // turns int into text 
    public void pushToStack(int value) {

        pushToStack(String.valueOf(value));

    }

    // removes top item and hands it back to the caller 
    public Node<String> popToStack() { 

        if (head == null) {
            return null; 
        }

// stashes memory of top item, then moves head down to next item. cut's removed item's link, then gives removed item back 
    Node<String> temp = head; 
        head = head.getLink(); 
        temp.setLink(null); 

        return temp; 

        }

// true if there are no items in the stack 
public boolean isEmptyStack() {

    return head == null; 

    }


private String peek() {

    if (head == null) {
        return null; 
    }

    return head.getJob();

}

    //returns boolean based on whether the string is an integer or not
    public boolean isInteger(String token) {
        if (token == null || token.isEmpty()) {
            return false;
        }//end if
        try {
            Integer.parseInt(token);
            return true;
        }//end try
        catch (NumberFormatException e) {
            return false;
        }//end catch
    }// end isInteger

    //returns boolean based on where the string is an operator (+-*%/) or not
    public boolean isOperator(String operator) {
        return "+".equals(operator) || "-".equals(operator) || "*".equals(operator)
                || "%".equals(operator) || "/".equals(operator);
    }//end isOperator

    //returns a boolean based on whether the string is an open parentheses ('(')or not
    public boolean isOpenParentheses(String token) {
        return "(".equals(token);
    }//end isOpenParentheses

    //returns a boolean based on whether the string is a closed parentheses
    public boolean isClosedParentheses(String token) {
        return ")".equals(token);
    }//end isClosedParentheses

    // returns complete infix expression 
    public String convertToInfix(String exp) {
    //separates parts of the expression into tokens
    String[] tokens = exp.trim().split("\\s+");

    //for each token in tokens, push token to stack if it is an integer
    for (String token : tokens) {
        if (isInteger(token)) {
            pushToStack(token);
        }//end if
        else if (isOperator(token)) { //pulls the left and right operand to add to final expression
            Node<String> rightNode = popToStack();
            String operand2 = rightNode.getJob();
            rightNode = null;

            Node<String> leftNode = popToStack();
            String operand1 = leftNode.getJob();
            leftNode = null;
            //builds final expression
            String newExpr = "(" + operand1 + " " + token + " " + operand2 + ")";
            pushToStack(newExpr);
        }//end else if
    }//end for

    Node<String> resultNode = popToStack();
    String infix = resultNode.getJob();
    resultNode = null;

    return infix; //returns final expression
}//end convertToInfix

//takes a operand, returns a numerical priority value
public int precedence(String operator) {
    // multiplication, division, mod return a 2
    if ("*".equals(operator) || "/".equals(operator) || "%".equals(operator)) {
        return 2;
    //addition, subtraction return 1
    } else if ("+".equals(operator) || "-".equals(operator)) {
        return 1;
    }//end else if
    //otherwise, return 0
    return 0;
}//end precedence
 // ------------Order of the rest of the code---------------

// convertToPostfix 

}


