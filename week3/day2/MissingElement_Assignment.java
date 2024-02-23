package week3.day2;

import java.util.Arrays;

public class MissingElement_Assignment {

	// Declare an array {1, 2, 3, 4, 10, 6, 8}.
	// Do a comparison check if there is a gap in the sequence of numbers.
	//Print the numbers that are missing.
	
	public static void main(String[] args) {
		int[] array= {1, 2, 3, 4, 10, 6, 8};
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
	 int n = array.length + 1;
	 int totalSum= n*(n+1)/2;
	 int arraySum=0;
	  for (int i : array) {
		arraySum += i;
	}
	  int missingNumber= totalSum - arraySum;
	  System.out.println("The Missing Number is :" + missingNumber);
}
}
