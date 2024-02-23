package week3.day1;

public class TextField_Assigment extends WebElement_BaseClass {
	
		public void getText() {
			System.out.println("This method used the get the Text in the TextField");

		}
		public static void main(String[] args) {
			TextField_Assigment text = new TextField_Assigment();
			text.click();
			text.getText();
			text.setText();
		}
		
}
