package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio_List_Assignment {

	public static void main(String[] args) throws InterruptedException {
		// initiate webdriver
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//In the search box, type as "bags" and press enter
		WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search AJIO']"));
		search.sendKeys("bags",Keys.ENTER);
		//To the left of the screen under "Gender" click on "Men"
		WebElement mensOption = driver.findElement(By.xpath("(//span[text()='gender']/following::label)[2]"));
		mensOption.click();
		//Under "Category" click "Fashion Bags"
		Thread.sleep(5000);
		WebElement category = driver.findElement(By.xpath("(//span[text()='category']/following::label)[2]"));
		category.click();
		
		//Print the items found
		Thread.sleep(5000);
		String itemsFound = driver.findElement(By.className("filter")).findElement(By.className("length")).getText();
		System.out.println(" Total Items found :"  + itemsFound);
		
		

		//Get list of brand names and print it
		List<WebElement> listofBrands = driver.findElements(By.xpath("//div[@class='brand']/strong"));
		List<String> brandNames= new ArrayList<String>();
		for (WebElement brand : listofBrands) {
			brandNames.add(brand.getText());
		}
		System.out.println("List of Brands : " + brandNames);
		System.out.println(" Number of Brands:" + brandNames.size());
		
		//Get list of Bag Names and print it
		
		List<WebElement> listofBags = driver.findElements(By.className("nameCls"));
		List<String> bagNames= new ArrayList<String>();
		for (WebElement bagName : listofBags) {
			bagNames.add(bagName.getText());
		}
		System.out.println("List of Bag Names :" + bagNames);
		System.out.println("Count of Bag Names:" + bagNames.size());
	}

}
