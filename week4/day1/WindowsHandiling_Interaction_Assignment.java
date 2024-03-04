package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandiling_Interaction_Assignment {

	public static void main(String[] args) {
		//Driver initialization and load the URL
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/login");
		//Enter Username and Password
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("DemoSalesManager");
		//Enter Password
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		//Click on Submit button
		WebElement submit = driver.findElement(By.className("decorativeSubmit"));
		submit.click();
		// Click on the CRM/SFA link.
		WebElement link = driver.findElement(By.linkText("CRM/SFA"));
		link.click();
		//Click on the Contacts button.
		WebElement contact = driver.findElement(By.xpath("//a[text()='Contacts']"));
		contact.click();
		// Click on Merge Contacts.
		WebElement merge = driver.findElement(By.xpath("//a[text()='Merge Contacts']"));
		merge.click();

		// Click on the widget of the "From Contact". 
		driver.findElement(By.xpath("//span[text()='From Contact']/following::a")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String>windowHandleslst= new ArrayList<String>(windowHandles);
		driver.switchTo().window(windowHandleslst.get(1));

		// Click on the 1st resulting contact
		driver.findElement(By.xpath("(//table)[4]/tbody/tr/td/div/a")).click();
		driver.switchTo().window(windowHandleslst.get(0));

		// Click on the widget of the "To Contact". 
		driver.findElement(By.xpath("//span[text()='To Contact']/following::a")).click();
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String>windowHandleslst1= new ArrayList<String>(windowHandles1);
		driver.switchTo().window(windowHandleslst1.get(1));

		// Click on the second resulting contact. 
		driver.findElement(By.xpath("(//table)[5]/tbody/tr[1]/td/div/a")).click();
		driver.switchTo().window(windowHandleslst1.get(0));

		// Click on the Merge button. 
		driver.findElement(By.xpath("//a[text()='Merge']")).click();

		// Accept the alert. 
		Alert alert = driver.switchTo().alert();
		alert.accept();

		// Verify the title of the page.
		String title = driver.getTitle();
		System.out.println(title);


	}

}
