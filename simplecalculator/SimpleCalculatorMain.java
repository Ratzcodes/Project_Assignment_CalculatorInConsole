package project.simplecalculator;

import java.util.Scanner;

/**
 * 
 * @author Raheesa
 * 
 * Main class to run the calculator program
 * 
 */
public class SimpleCalculatorMain{

	/**
	 * 
	 *
	 * Main method or driver method
	 * The driver class of the simple calculator in console
	 * It takes the user inputs and the operation to be performed on those inputs.
	 * The result is displayed for the chosen operation and asked for the users continuity.
	 */
	public static void main(String[] args) {
		boolean stop = false;    
		do {
		Scanner in = new Scanner(System.in);
		
		SimpleCalculator sc = new SimpleCalculator();
		
		System.out.println("Enter the first number. ");
		sc.setNum1(in.nextDouble());
		
		System.out.println("Enter the second number. ");
		sc.setNum2(in.nextDouble());
		
		System.out.println("Select a number to perform operation \n 1: Addition \n 2: Subtraction \n 3: Multiplication \n 4: Division");
		
		int operator = in.nextInt();
		
		switch(operator) {
		case 1:
			System.out.println("Addition of these two numbers is: "+ sc.addition());
			break;
			
		case 2:
			System.out.println("Diffrence of these two numbers is: "+ sc.subtraction());
			break;
			
		case 3:
			System.out.println("Product of these two numbers is: "+ sc.multiplication());
			break;
			
		case 4:
			System.out.println("Quotient of these two numbers is: "+ sc.division());
			break;
			
		default:
			System.out.println("Operation not defined! Please choose the right number.");
			break;
		}
		
		 System.out.println("Would you like to continue? (yes or no)");
		 Scanner in1 = new Scanner(System.in);
		    String s = in1.nextLine();
		    if(s.equals("no")) {
		        stop = true;
		        System.out.println("Thank you!");
		    }else {
		    	continue;
		    }

		    in1.close();
		    in.close();
		}while(!stop);
		    
		    
	}

}
