package week3.day1;

public class ChangeOddIndexToUpperCase_Assignment {

	public static void main(String[] args) {
		String test ="changeme";
		//sting to char array
		char[] chars = test.toCharArray();
		//Iterate
		for (int i = 0; i < chars.length; i++) {
			if (i%2 ==1) {
				chars[i]= Character.toUpperCase(chars[i]);
			}
			System.out.print(chars[i]);

		}
		
}
}
