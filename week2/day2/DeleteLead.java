package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement name = driver.findElement(By.id("username"));
		name.sendKeys("DemoSalesManager");
		
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("crmsfa");
		
		WebElement submit = driver.findElement(By.className("decorativeSubmit"));
		submit.click();
		
		WebElement link = driver.findElement(By.linkText("CRM/SFA"));
		link.click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
		WebElement phonenum = driver.findElement(By.xpath("//input[@name='phoneNumber']"));
		phonenum.sendKeys("99");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		driver.findElement(By.xpath("//a[text()='11441']")).click();
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		WebElement leadid = driver.findElement(By.xpath("//input[@name='id']"));
		leadid.sendKeys("11441");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		WebElement checklead = driver.findElement(By.xpath("//div[text()='No records to display']"));
		System.out.println(checklead.getText());

	}

}
