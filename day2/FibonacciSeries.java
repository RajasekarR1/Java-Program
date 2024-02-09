package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int range=8;
		System.out.println(a +"" + b + "");
		for (int i =2; i <range; i++) {
			int c= a+b;
			System.out.println(c+"");
			a=b;
			b=c;
			
		}

	}

}
