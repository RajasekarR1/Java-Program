package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingCollection_Assigment {
	//Reverse the given collection of String elements
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare a String and add the values
		String[] companies= {"HCL,Wipro,AspireSystems,CTS"};
		
		// Add the collection to a List
		List<String> companyList = new ArrayList<String>
				(Arrays.asList(companies));
		
		// Reverse the list
		Collections.reverse(companyList);

		//iterate
		for (int i=companies.length-1; i<0 ; i--) {
			System.out.println(companies[i]);
		}
		
	}
}
