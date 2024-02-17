package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignup_Assignment {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		// Implicit wait added
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement signup= driver.findElement(By.xpath("//a[text()='Create new account']"));
		signup.click();
		
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.sendKeys("Hanyaa");
		
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		lastname.sendKeys("Rajasekar");
		
		WebElement mobilenum = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		mobilenum.sendKeys("9597531234");
		
		WebElement dob = driver.findElement(By.id("day"));
		
		Select dateofbirth= new Select(dob);
		dateofbirth.selectByIndex(15);
		
		WebElement dob1 = driver.findElement(By.id("month"));
		
		Select month=new Select(dob1);
		month.selectByValue("8");
		
		WebElement dob2 = driver.findElement(By.id("year"));
		Select year =new Select(dob2);
		year.selectByVisibleText("2020");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		WebElement create = driver.findElement(By.xpath("//button[text()='Sign Up']"));
		create.click();
		
		
		
		
				
		
		
		
		
		
		
		
		
		
		

	}

}
