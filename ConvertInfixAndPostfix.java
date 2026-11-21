//-----------------------------------------------------------------------------
// Group Members: John Thompson and Leila Chahboune 
// Date: 11/18/2026
// Course: Data Structures and Algorithm Analysis (CSCI 3200)
// Project Description: 
//----------------------------------------------------------------------------
package CSCI3200;
import java.util.*;

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    //open scanner for choice input
    InfixAndPostfix converter = new InfixAndPostfix();

    String choice; //string > int, otherwise everything crashes when nextInt doesn't receive correct input

    do {
			System.out.println("//////////////////////////////////////");
			System.out.println("/ 0: Exit                            /");
			System.out.println("/ 1: Infix to Postfix                /");
			System.out.println("/ 2: Postfix to Infix                /");
			System.out.println("//////////////////////////////////////");
			System.out.print("Enter a choice: ");
      choice = scanner.nextLine().trim();
      //ensures that input is validate for switch statement

      	switch (choice) {
						case "1": //infix
					System.out.print("Enter an infix expression: ");
					String infix = scanner.nextLine();
					String postfix = converter.convertToPostfix(infix);
					System.out.println("The postfix expression of " + infix + " = " + postfix);
					break;
          	case "2": //postfix
					System.out.print("Enter a postfix expression: ");
					String postfixInput = scanner.nextLine();
          String infixResult = converter.convertToInfix(postfixInput);
          System.out.println("The infix expression of " + postfixInput + " = " + infixResult);
         	break;
            case "0": //exit
          System.out.println("Goodbye!");
          break;
            default: //catch
          System.out.println("Invalid choice. Please enter 0, 1, or 2.");
          break;
                }// end switch
            } while (!choice.equals("0"));
       scanner.close();
}
