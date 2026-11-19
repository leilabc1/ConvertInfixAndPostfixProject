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

// ------------Order of the rest of the code---------------

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
    

// precedence 

// convertToPostfix 


// convertToInfix




}


