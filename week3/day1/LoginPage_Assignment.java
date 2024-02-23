package week3.day1;

public class LoginPage_Assignment extends BasePage_Assignment {

	@Override
	public void performCommonTasks() {
		
		super.performCommonTasks();
	}
	
		public static void main(String[] args) {
			LoginPage_Assignment lp=new LoginPage_Assignment();
			lp.findElement();
			lp.clickElement();
			lp.sendkeys();
			//Over ridden method
			lp.performCommonTasks();
		}
}
