package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// Step 1 Webdriver instantion
		
		ChromeDriver driver= new ChromeDriver();
		
		 // step 2 Load URL
		driver.get("https://google.com/");
		
		//Max browser
		driver.manage().window().maximize();
	
		//close the browser
		driver.close();
		

	}

}
