package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchFaceBook{

	public static void main(String[] args) throws InterruptedException {
		
		
	
		// Right click on webpage inspect element , Ctrl +Shift + i , Fun key + F12 & Click on developer tool
	
		EdgeDriver driver= new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("email")).sendKeys("r.rajasekars@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("rockerraja");
		
		driver.findElement(By.name("login")).click();
		
		String title = driver.getTitle();
		
		System.out.println(title);
		if ((title.contains("Facebook"))) {
			System.out.println("Logged in sucessfully");
		} else {
			System.out.println("Not logged in");
		}
		Thread.sleep(2000);
		driver.close();
	}
}

