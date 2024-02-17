package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateFacebook {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		// Implicit wait added
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("testleaf.2023@gmail.com");
		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys("Tuna@321");
		WebElement login = driver.findElement(By.xpath("//button[text()='Log in']"));
		login.click();
		
		driver.findElement(By.xpath("//a[text()='Find your account and log in.']")).click();
	
		
		
		
		
		
		
	}

}
