package week3.day1;

public class API_Client_Assignment {
		 //Create a Java class named APIClient and create two methods with the same name passing different input arguments
		
	public void sendRequest(String endPoint) {
		System.out.println("Send Request Method with single argument");
	}
	
	public void  sendRequest(String endPoint, boolean requestStatus, String requestBody) {
		System.out.println("Same request method with three different input arguments");
	}
	public static void main(String[] args) {
		API_Client_Assignment api= new API_Client_Assignment();
		api.sendRequest("https://www.maps.google.com/user1");
		api.sendRequest("https://www.maps.google.com/user1", true, "Checking Direction");

	}

}
