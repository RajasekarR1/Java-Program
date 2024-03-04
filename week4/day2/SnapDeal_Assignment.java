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
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal_Assignment {

	public static void main(String[] args) throws InterruptedException, IOException {
		//Launch SnapDeal web page
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--start-maximized");
		
		//chrome option headless mode can be added options.addArguments("--headless");

		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.snapdeal.com");

		// 1.Locate Mens Fashion
		Actions act = new Actions(driver);
		WebElement mensFashion = driver.findElement(By.xpath("(//div[text()='Top Categories']/following::li)[1]"));
		act.moveToElement(mensFashion).perform();

		// 2. Go to Sports Shoe
		driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]")).click();

		// 3. count the no.of sport shoes

		String totalShoes = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
		System.out.println("Total number of Sports Shoes :" + totalShoes);
		// 4. Click on Training shoes
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		Thread.sleep(3000);

		// 5.sort price by low to high 
		driver.findElement(By.xpath("//span[text()='Sort by:']/following-sibling::div")).click();
		driver.findElement(By.xpath("//li[@data-sorttype='plth']")).click();
		Thread.sleep(3000);
		
		// 6 Check if the displayed items are sorted correctly. 
		List<WebElement> findElements = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
		List<Integer> intlist = new ArrayList<Integer>();
		System.out.println("parseInt is \n");
		for (int i = 0; i < findElements.size(); i++) {
			String text = findElements.get(i).getText();
			String replaceAll = text.replaceAll("[^0-9]", "");
			int parseInt = Integer.parseInt(replaceAll);
			System.out.println(" "+parseInt+",");
			intlist.add(parseInt);			
		}
		System.out.println("intlist is : "+intlist);
			for (int i = 0; i < intlist.size(); i++) {
				if(i==intlist.size()-1) {
					break;
				}
				else if(intlist.get(i+1)<intlist.get(i)) {
					System.out.println("The items @ index " + i + ","+ (i+1) + " are not is not sorted correctly");
				}
				
				// 7. Select any price range ex:(500-700). 
				
				WebElement fromVal = driver.findElement(By.xpath("//div[@class='price-input']//input[@name='fromVal']"));
				fromVal.clear();
				fromVal.sendKeys("550",Keys.ENTER);
				Thread.sleep(2000);
				WebElement toVal = driver.findElement(By.xpath("//div[@class='price-input']//input[@name='toVal']"));
				toVal.clear();
				toVal.sendKeys("700",Keys.ENTER);
				Thread.sleep(5000);

				//8. Filter by any color.
				
				WebElement colorCheckbox = driver.findElement(By.xpath("//label[@for='Color_s-White%20%26%20Blue']"));
				//span[@class='filter-color-tile White&Blue ']"));
				//a[@class='filter-name' and text()=' White & Blue']"));
				Thread.sleep(5000);
				colorCheckbox.click();
				Thread.sleep(10000);

				//9. Verify all the applied filters.
				WebElement fromLatest = driver.findElement(By.xpath("//span[@class='from-price-text']"));
				if(fromLatest.getText().isEmpty()) {
					System.out.println("From Value is not entered");
				}
				else {
					System.out.println("From value is entered as "+ fromLatest.getText());
				}
				WebElement toLatest = driver.findElement(By.xpath("//span[@class='to-price-text']"));
				if(toLatest.getText().isEmpty()) {
					System.out.println("To Value is not entered");
				}
				else {
					System.out.println("To value is entered as "+ toLatest.getText());
				}
				Thread.sleep(7000);
				WebElement checkB = driver.findElement(By.xpath("//label[@for='Color_s-White%20%26%20Blue']/a"));
				if(checkB.isSelected()) {
					System.out.println("The color is selected and the selected color is "+ checkB.getText());
				}
				
				//10. Mouse hover on the first resulting "Training Shoes".
				WebElement firstProduct = driver.findElement(By.xpath("(//p[@class='product-title'])[1]"));
				firstProduct.click();
				
				//11. Click the "Quick View" button. 
				Set<String> windowHandles = driver.getWindowHandles();
				List<String>windowHandleslst = new ArrayList<String>(windowHandles);
				driver.switchTo().window(windowHandleslst.get(1));
				
				//12. Print the cost and the discount percentage. 
				String cost = driver.findElement(By.xpath("//span[@class='pdp-final-price']/span")).getText();
				System.out.println("The cost is Rs."+ cost);
				String discountPercent = driver.findElement(By.xpath("//span[@class='pdpDiscount ']/span")).getText();
				System.out.println("The discount percent is: "+ discountPercent );
				
				//13. Take a snapshot of the shoes. 
				File src = driver.getScreenshotAs(OutputType.FILE);
				File dst = new File("snapss1.jpg");
				FileUtils.copyFile(src, dst);
				
				//14. Close the current window
				driver.close();
			}

	}

}
