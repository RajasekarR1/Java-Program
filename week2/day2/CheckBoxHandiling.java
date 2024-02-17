package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxHandiling {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Basic CheckBox
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		//Notification CheckBox
		WebElement ajax = driver.findElement(By.xpath("//span[text()='Ajax']"));
		ajax.click();
		System.out.println(ajax.getText());
		boolean isAjaxoptionchecked = driver.findElement(By.xpath("//span[text()='Ajax']")).isDisplayed();
		if (isAjaxoptionchecked) {
			System.out.println("Ajax option is checked");
		}
		WebElement notification = driver.findElement(By.xpath("//span[text()='Checked']"));
		if (notification.getText()=="Checked") {
			System.out.println("Ajax option is checked");
		}
		System.out.println(notification.getText());

		//	setTimeout(function(){debugger;},5000) To freeze the DOM
		Thread.sleep(5000);
		//Language Checkbox
		WebElement ischecked = driver.findElement(By.xpath("//span[@class='ui-growl-title']"));
		System.out.println(ischecked.getText());

		WebElement language = driver.findElement(By.xpath("//label[text()='Java']"));
		language.click();
		System.out.println("Preferred Language :" +language.getText());

		WebElement lang2 = driver.findElement(By.xpath("//label[text()='Python']"));
		lang2.click();
		System.out.println("Preferred Language :" + lang2.getText());

		WebElement lang3 = driver.findElement(By.xpath("//label[text()='Javascript']"));
		lang3.click();
		System.out.println("Preffered Language :" + lang3. getText());
		// Tri state Check box
		// First click
		driver.findElement(By.xpath("//h5[text()='Tri State Checkbox']/parent::div//div[contains(@class,'ui-chkbox-box ui')]")).click();
		WebElement tristate1 = driver.findElement(By.xpath("//div[@class='ui-growl-message']/p"));
		if (tristate1.getText().equals("State==1")) {
			System.out.println("Tristate value is 1");

		}
		Thread.sleep(5000);
		//Second click
		driver.findElement(By.xpath("//h5[text()='Tri State Checkbox']/parent::div//div[contains(@class,'ui-chkbox-box ui')]")).click();
		WebElement tristate2 = driver.findElement(By.xpath("//div[@class='ui-growl-message']/p"));
		if (tristate2.getText().equals("State==2")) {
			System.out.println("Tristate value is 2");
		}
		Thread.sleep(5000);
		//Third click
		driver.findElement(By.xpath("//h5[text()='Tri State Checkbox']/parent::div//div[contains(@class,'ui-chkbox-box ui')]")).click();
		WebElement tristate0= driver.findElement(By.xpath("//div[@class='ui-growl-message']/p"));
		if (tristate0.getText().equals("State==0")){
			System.out.println("Tristate value is 0");
		}
		Thread.sleep(5000);
		//Toggle button
		WebElement togglebtn = driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']"));
		togglebtn.click();
		if(driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText().equals("Checked"));
		System.out.println("Toggle Button is ON");

		//boolean isdisabled = driver.findElement(By.xpath("//span[@text='Disabled']/preceding-sibling::div[contains(@class,'ui-state-diasbled')]")).isDisplayed();
		//if (isdisabled) {
		//System.out.println("Checkbox in Disabled state");
		//}
		//Select Multiple checkbox and check whether its displayed or not

		WebElement selectmutliple = driver.findElement(By.xpath("//h5[text()='Select Multiple']/following::div[1]"));
		selectmutliple.click();
		WebElement option1 = driver.findElement(By.xpath("//label[text()='Miami']/preceding-sibling::div[1]"));
		option1.click();
		WebElement option2=driver.findElement(By.xpath("//label[text()='London']/preceding-sibling::div"));
		option2.click();
		WebElement option3 = driver.findElement(By.xpath("//label[text()='Paris']/preceding-sibling::div"));
		option3.click();
		WebElement option4 = driver.findElement(By.xpath("//label[text()='Amsterdam']/preceding-sibling::div"));
		option4.click();
		if (option1.isDisplayed()) {
			System.out.println("Miami is checked");
		}
		if (option2.isDisplayed()) {
			System.out.println("London is Checked");
		}
		if (option3.isDisplayed()) {
			System.out.println("Paris is Checked");
		}
		if(option4.isDisplayed()) {
			System.out.println("Amsterdam is Checked");
		}
		driver.close();

		/*Select option=new Select(selectmutliple);
			option.selectByIndex(1);
			option.selectByIndex(5);
			option.selectByValue("Istanbul");
			option.selectByValue("Paris");
			option.selectByVisibleText("London");
			option.selectByVisibleText("Amsterdam");*/
	}

}

