package week3.day1;

public class Reverse_OddWords_Assignment {
	public static void main(String[] args) {
		String text= "I am a Software Tester";
		//Expected output= "“I ma a erawtfos tester”

		//1.split each word using split method
		String[] words = text.split(" ");

		//reverse the word with odd length in the given string 
		for (int i =0; i <words.length; i++) {
			if (i%2 !=0) {
				words[i]=reverse(words[i]);	
			}
		}
		String reversedText= String.join(" ", words);
		System.out.println(reversedText);

	}

	public static String reverse(String str) {
		String reversed= "";
		for (int i =str.length()-1; i>=0; i--) {
			reversed += str.charAt(i);
		}
		return reversed;
	}

}

