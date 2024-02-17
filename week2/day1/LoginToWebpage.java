package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginToWebpage {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leaftaps.com/opentaps/control/main");
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("DemoSalesManager");
		Thread.sleep(3000);
		
		user.clear();
		Thread.sleep(2000);
		
		user.sendKeys("DemoSalesManager");
		Thread.sleep(3000);
		
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("crmsfa");
		
		WebElement submit = driver.findElement(By.className("decorativeSubmit"));
		submit.click();
		//********************* Get Page Title  ctrl +2 --> "L" key
		String title = driver.getTitle();
		System.out.println(title);
		//******************** Contains partial match
		if (title.contains("TestLeaf Automation")) {
			System.out.println("Webpage loggged in Succesfully");
			
		} else {
			System.out.println("Webpage login failed");

		}
		//Link text
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Partial link text
		driver.findElement(By.partialLinkText("CRM")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Return type for find element is WebElement
		WebElement data = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		
		// Select Class  step 1
		Select opt = new Select(data);
		
		//Step 2
		//opt.selectByIndex(1);
		opt.selectByVisibleText("Existing Customer");
		
		// Java wait
		 	Thread.sleep(5000);
		 	driver.close();
	}

}
