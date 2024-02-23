package week3.day1;

public class ReverseOddWords_Assignment{
	public static void main(String[] args) {
		String text= "I am a Software Tester";
		//Expected output= "“I ma a erawtfos tester”
		
		//1.length of the each words
		int length = text.length();
		System.out.println("String Lenth:"+ length);
		//2.split each word using split method
		String[] split = text.split(" ");
		
		//reverse the word with odd length in the given string 
		for (int i =split.length-2; i>=0; i--) {
			// Check if the length of the word is odd
			if (split.length%2 !=0) {
				// reverse the word using string builder and update the array element
				StringBuilder reverse = new StringBuilder(split[i]);
				split[i]=reverse.reverse().toString();
			}
			
		}
			// join the modified words
		  String join = String.join(" ", split);
		  System.out.println("Expected output:" + join);
	
	}
		
}


