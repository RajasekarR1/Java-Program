package week3.day2;

import java.util.Arrays;

public class SecondLargest_Assignment {
	
	//Declare an array {3, 2, 11, 4, 6, 7}.
	//Pick the 2nd element from the last and print it.
	
	public static void main(String[] args) {
			//Given array
		int[] array= {3,2,11,4,6,7};
			//Sort the array
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
			//The second largest number is the 2nd last element in the sorted array
		int secondLargest = array[array.length-2];
		System.out.println("The Second largest number in the array :" + secondLargest);
	
	}

}
