package week3.day2;

public class ConcereteClass_Assigment implements DatabaseConnection_Assignment {

	public void connect() {
		System.out.println("Connect Method :" + " ConcereteClass");
		
	}

	public void disconnect() {
		System.out.println("Disconnect Method :" + "Concerete Class");
		
	}

	public void executeUpdate() {
		System.out.println("Execute Method :" + " Concerete Class ");
		
	}
	 
	public static void main(String[] args) {
		
		ConcereteClass_Assigment cc = new ConcereteClass_Assigment();
		cc.connect();
		cc.disconnect();
		cc.executeUpdate();
	}

}
