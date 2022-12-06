package project.simplecalculator;

/**
 * 
 * @author Raheesa
 * 
 *
 * Interface for simple mathematical operations for calculator
 * This interface declares addition, subtraction, multiplication and division
 *
 */
public interface SimpleCalculatorOperations {
	/**
	 * @return double
	 * interface declaration for addition
	 */
	 double addition();  //by default public
	 /**
		 * @return double
		 * interface declaration for subtraction
		 */
	 double subtraction();
	 /**
		 * @return double
		 * interface declaration for multiplication
		 */
	 double multiplication();
	 /**
		 * @return double
		 * interface declaration for division
		 */
	 double division();

}
