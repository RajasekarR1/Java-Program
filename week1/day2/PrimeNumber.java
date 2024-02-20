package week1.day2;

public class PrimeNumber {
	   //least prime number is 2,3
		//print prime number up to 30
	public static boolean isPrime(int num) {
		for (int i = 2; i<num; i++) {
			if (num % i==0) {
				return false;
			}
		}
		return true;
	}
	public static void getPrimeNumbers(int num){
		for (int i = 0; i <=num; i++) {
			if (isPrime(i)) {
				System.out.println("The Prime Number is:"+ i);
			}
				
			}
		}
	public static void main(String[] args) {
			getPrimeNumbers(30);
	}
			
		} 
					

