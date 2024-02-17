package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonHandiling {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("(//label[text()='Chrome'])[1]")).click();
		//selected radio button
		WebElement checked = driver.findElement(By.xpath("(//div[@class='ui-g-12 ui-md-4']/label)[1]"));
		checked.click();
		System.out.println(checked.isSelected());
		//boolean status = checked.isSelected();
		//System.out.println(status);
		
		//Identifying the default 
		boolean select = driver.findElement(By.xpath("(//label[text()='Safari'])[2]")).isDisplayed();
		System.out.println(select);
		
		WebElement agegroup = driver.findElement(By.xpath("//label[text()='21-40 Years']"));
		agegroup.click();
		boolean status = agegroup.isEnabled();
		System.out.println(status);
		agegroup.click();
		System.out.println(agegroup.getText());
		
	}

}
