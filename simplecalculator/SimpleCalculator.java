package project.simplecalculator;

/**
 * 
 * @author Raheesa
 * 
 * 
 * Class that implements the SimpleCalculatorOperations interface
 * It implements all the method declarations of the interface
 *
 */
public class SimpleCalculator implements SimpleCalculatorOperations{
	// define inputs as attributes
	/**
	 * First number
	 */
	public double num1;
	/**
	 * Second number
	 */
	public double num2;
	
	
	// define getters and setters
	/**
	 * 
	 * 
	 * sets the value of First number
	 */
	public void setNum1(double num1) {
		this.num1= num1;
	}
	
	/**
	 * gets the value of First number
	 * 
	 */
	public double getNum1() {
		return this.num1;
	}
	
	/**
	 * 
	 * sets the value of Second number
	 */
	public void setNum2(double num2) {
		this.num2= num2;
	}
	
	/**
	 * gets the value of Second number
	 * 
	 */
	public double getNum2() {
		return this.num2;
	}
	
	/**
	 * implementation of addition interface
	 */
	public double addition() {
		return  num1+num2;	
	}

	/**
	 * implementation of subtraction interface
	 */
	public double subtraction() {
		return num1-num2;
	}

	/**
	 * implementation of multiplication interface
	 */
	public double multiplication() {
		return num1*num2;
	}

	/**
	 * implementation of division interface
	 */
	public double division() {
		return num1/num2;
	}

}
