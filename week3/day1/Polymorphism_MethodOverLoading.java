package week3.day1;

public class Polymorphism_MethodOverLoading {
	//Pass a string msg and String status aruguments
		public void reportStep(String message , String status) {
			System.out.println("First Message is:"+ message+'\n'+ "Status is:"+status);
		}
	//pass a String msg , boolean parameter & string status
		public void reportStep(String message ,boolean snap ,String status) {
System.out.println("Second Message is:"+ message +'\n'+"boolean snap is:"+snap+'\n'+"String Status is:"+ status);

		}
		public static void main(String[] args) {
			Polymorphism_MethodOverLoading pml= new Polymorphism_MethodOverLoading();
			pml.reportStep("Welcome to oops concept" , "passed");
			pml.reportStep("Welcome to Polymorphism concept",true, "passed");
		}
	
	
	
	
}
