package week4.day2;

import java.io.File; 
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Assignment {

		public static void main(String[] args) throws InterruptedException, IOException {
			//Driver initialization
			ChromeDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.amazon.in");
			//Search for One plus9 pro mobile
			WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
			search.sendKeys("OnePlus 9 Pro",Keys.ENTER);
			
			Thread.sleep(3000);
			//Printing the price of 1st product
			WebElement element = driver.findElement(By.xpath("(//span[@class='a-price-whole']/preceding::span[@class='a-price'])[1]"));
			String price = element.getText();
			System.out.println("Price of the mobile is :" + price);
			//Printing the customer rating
			WebElement element1 = driver.findElement(By.xpath("//span[@class='a-size-base s-underline-text']"));
			String rating = element1.getText();
			System.out.println("Rating for the 1stmobile is:" + rating);
			
			//Click the 1st Text link of the first image
			driver.findElement(By.xpath("(//span[text()='Results']/following::span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();

			//6. Take a screenshot of the product displayed. 
			Set<String> windowHandles = driver.getWindowHandles();
			List<String>windowHandleslst = new ArrayList<String>(windowHandles);
			driver.switchTo().window(windowHandleslst.get(1));
			File src = driver.getScreenshotAs(OutputType.FILE);
			File dst = new File("mobile.jpg");
			FileUtils.copyFile(src, dst);
			
			Thread.sleep(10000);
			
			//7. Click the 'Add to Cart' button. 
			//driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();
			driver.findElement(By.id("add-to-cart-button")).click();
			
			//8. Get the cart sub total
			Thread.sleep(10000);
			String subtotal = driver.findElement(By.xpath("//span[@class='a-price sw-subtotal-amount']//span[@class='a-price-whole']")).getText();
			System.out.println("SubTotal is: "+subtotal);
			
			
			
		}
}
			