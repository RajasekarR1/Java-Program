package week3.day1;

public class RemoveDuplicateWords_Assignment {

	public static void main(String[] args) {
		
		String text = "We learn Java basics as part of Java sessions in java week1";
		
		//Expected output = We learn Java basics as part of sessions in week1

		int length = text.length();
		System.out.println("Length of the String:"+ length);
		
		String textlower = text.toLowerCase();
		
		// Split the text in to array of words
		String[] allWords = textlower.split(" ");
		
		for (int i = 0; i <allWords.length; i++) {
			
				for (int j =i+1; j <allWords.length; j++) {
					
					if (allWords[i].equals(allWords[j])) {
									
						//assign split[j]="" to avoid visited record
						
						allWords[j]="";
					}
				}
			}
		// result without duplicate word
		String result="";
		for (String word : allWords) {
			if(!word.equals("remove")) {
				result += word + " ";
		}
		}
		//Display the string after removing the duplicates
		System.out.println("After removing the duplicates words :" + result);
	}
}