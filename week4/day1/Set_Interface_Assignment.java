package week4.day1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Set_Interface_Assignment {
	
	public static void main(String[] args) {
		//Declare a variable to store a string
		String companyName="Google";
		
		char[] charArray = companyName.toCharArray();
		
		// Create a Set to store Unique Character
		Set<Character> unique= new LinkedHashSet<Character>();
		
		String output=" ";
		// iterate through each character in the String companyName
		
		for (int i = 0; i<=charArray.length-1; i++) {
			if(!unique.contains(charArray[i]));
			unique.add(charArray[i]);
		}
	
			// Converting to list to remove the ,
			List<Character> charList=new ArrayList<Character>(unique);
			for (int i = 0; i <charList.size()-1; i++) {
				output  += Character.toString(charList.get(i));
				
			}
			System.out.println("After removing Duplicates :" + output);
			}

	}


