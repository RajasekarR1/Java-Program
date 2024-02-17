package org.marathon1.testleaf;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Search for bags
		WebElement searchbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchbox.sendKeys("Bags for b");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='s-suggestion s-suggestion-ellipsis-direction'])[1]")).click();
		
		// Result of the bags
		WebElement result= driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
		System.out.println("Total Bags Showing:" + result.getText());
		
		driver.findElement(By.xpath("(//span[text()='Skybags'])[1]")).click();
		driver.findElement(By.xpath("(//span[text()='Gear'])[1]")).click();
		
		//Sort using select class
		Thread.sleep(3000);
		WebElement sort = driver.findElement(By.id("s-result-sort-select"));
		Select S=new Select(sort);
		S.selectByVisibleText("Newest Arrivals");
		
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//span[text()='Sort by:']/parent::span")).click();
		//driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		
		WebElement Bag = driver.findElement(By.xpath("//img[@class='s-image']"));
		Bag.click();
		WebElement Price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[4]"));
		System.out.println("Price of the bag:" + Price.getText());
		
		WebElement BagName = driver.findElement(By.xpath("//span[text()='Skybags']"));
		System.out.println(BagName.getText());
		
		System.out.println("Title of the Page :" + driver.getTitle());

	}

}
