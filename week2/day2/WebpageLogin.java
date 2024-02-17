package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebpageLogin {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("DemoSalesManager");
		
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if (title.contains("TestLeafAutomation")) {
			System.out.println("Login is Successfull");
			
		} else {
			System.out.println("Login is not Successfull");

		}
		//driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dilip");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");
		
		WebElement data = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select option= new Select(data);
		option.selectByVisibleText("Cold Call");
		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		String name = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		
		if (name.contains("Dilip")) {
				System.out.println("Lead is created");
		} else {
			System.out.println("Lead is not Created");

		}
	}

}
