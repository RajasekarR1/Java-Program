package week1.day2;

public class CheckPalindrome {
	    public static void main(String[] args) {
	        int rem=0;
	        int sum = 0; 
	        int temp;
	        int num =112211 ; // Change this number to check for palindrome
	        temp = num;
	        while (num > 0) {
	            rem = num % 10; // Get the remainder
	            sum = (sum * 10) + rem;
	            num = num / 10;
	        }
	        if (temp == sum)
	            System.out.println("Palindrome number");
	        else
	            System.out.println("Not a palindrome");
	    }
	}


		
		
