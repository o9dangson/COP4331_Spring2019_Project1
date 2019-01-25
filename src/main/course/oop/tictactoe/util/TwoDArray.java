package main.course.oop.tictactoe.util;

/**
 * You must implement the following methods to accept the expected 
 * parameters and return accurate results.
 * You are allowed and expected to add any class attributes and methods 
 * needed to complete this assignment. 
 * 
 *
 */
public class TwoDArray {
	public int [][] myArray;
	public int rCount;
	public int cCount;
	public int defaultV;
	
	public TwoDArray(int rows, int cols, int defaultVal){
		/*TODO - Create a 2D integer array consisting of 
		 * the number of rows and columns given. Initialize 
		 * the array by setting each int to be the defaulVal. 
		 * */
		myArray = new int [rows][cols];
		rCount = rows;
		cCount = cols;
		defaultV = defaultVal;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				myArray[i][j] = defaultVal;
			}
		}
	}
	
	public void initArray(int defaultVal) {
		/*TODO - (Re)Initialize the array by 
		 * setting each int to be the defaulVal 
		 */
		for(int i=0;i<rCount;i++) {
			for(int j=0;j<cCount;j++) {
				myArray[i][j] = defaultVal;
			}
		}
	}
	
	public String insertInt(int row, int col, int val) {
		/*TODO - "Insert" based on the following conditions:
		 * 1. The location [row][col] is still set to the default value
		 * 		-return "Success! (val) was inserted.
		 * 
		 * 2. The location [row][col] is no longer the default value
		 * 		-return "Failure: (row), (col) is not empty.
		 * 
		 * 3. val is the default value; 
		 * 		-return "Failure: (val) is not allowed."
		 * 
		 * Note: Print the int value in place of (). 
		 * e.g., replace (val) with val.
		 */
		String message = "";
		if(val == defaultV) {
			message = "Failure: " + val + " is not allowed.";
		}
		else if(myArray[row][col] == defaultV) {
			myArray[row][col] = val;
			message = "Success! " + val + " was inserted.";
		}
		else if(myArray[row][col] != defaultV) {
			message = "Failure: " + row + ", " + col + " is not empty.";
		}
		return message;
	}
	
	public int getInt(int row, int col) {
		/*TODO - Return the value at the specified row, col
		 * 
		 */
		
		return myArray[row][col];
	}
	
	public String getArrayDisplay() {
		/*TODO - Create a 2D display of the Array
		 * e.g. 
		 * 	1	0	1
		 *  0	1	0
		 *  0	1	1
		 * 
		 */
		
		return "Not implemented";
	}
	
	public String getArrayDetails() {
		/*TODO - List the following:
		 * # rows
		 * # columns
		 * How many unique values (in the above example, this would be 2
		 * Value and count of each (e.g. 
		 * 			value:1 count:5
		 * 			value:0 count:4
		 * 
		 * 			)
		 * 
		 */
		
		return "Not implemented";
	}		

}
