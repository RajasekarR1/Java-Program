package week3.day1;

public class RadioButton_Subclass_Assigment extends Button_SubClass_Assignment {
	public void selectRadioButton() {
		System.out.println("This method is used to select the radio button");

	}

	public static void main(String[] args) {
		RadioButton_Subclass_Assigment radio =new RadioButton_Subclass_Assigment();
		radio.selectRadioButton();
		radio.click();
		radio.setText();
		radio.submit();
	}
}
