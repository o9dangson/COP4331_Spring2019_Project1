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
	public int [] uniqueArray;
	public int [] uniqueCntArray;
	public int numOfUnique;
	public int rCount;
	public int cCount;
	public int defaultV;
	
	public TwoDArray(int rows, int cols, int defaultVal){
		/*TODO - Create a 2D integer array consisting of 
		 * the number of rows and columns given. Initialize 
		 * the array by setting each int to be the defaulVal. 
		 * */
		myArray = new int [rows][cols];
		int maxNum = rows*cols;
		uniqueArray = new int [maxNum];
		uniqueCntArray = new int [maxNum];
		numOfUnique = 0;
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
		else if(myArray[row][col] != defaultV) {
			message = "Failure: " + row + ", " + col + " is not empty.";
		}
		else if(myArray[row][col] == defaultV) {
			myArray[row][col] = val;
			message = "Success! " + val + " was inserted.";
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
		String display = "\n";
		for(int i=0;i<rCount;i++) {
			for(int j=0;j<cCount;j++) {
				display+="\t";
				display+=myArray[i][j];
				if(j==cCount -1)
					display+="\n";
			}
		}
		return display;
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
		//Reset and recalculate arrayDetails
		String message = "";
		numOfUnique = 0;
		for(int i=0;i<uniqueArray.length;i++) {
			uniqueArray[i] = 0; uniqueCntArray[i] = 0;
		}
		//Calculate
		for(int i=0;i<rCount;i++) {
			for(int j=0;j<cCount;j++) {
				checkUniqueNumber(myArray[i][j]);
			}
		}
		//Format message
		for(int i=0;i<numOfUnique;i++) {
			message+="\n\tvalue:" + uniqueArray[i] + " count:" + uniqueCntArray[i];
		}
		return message;
	}		
	
	public void checkUniqueNumber(int n) {
		boolean found = false;
		int i=0;
		//Search through list of unique numbers
		while(i<numOfUnique && !found) {
			if(uniqueArray[i] == n) {
				//Set to true if found
				found = true;
				//Increment if found
				uniqueCntArray[i]++;
			}
			//Counter
			i++;
		}
		//Create new entry if not found
		if(!found) {
			uniqueArray[numOfUnique] = n;
			uniqueCntArray[numOfUnique] = 1;
			numOfUnique++;
		}
	}

}
