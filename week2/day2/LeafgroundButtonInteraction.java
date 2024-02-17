
package week2.day2;

import java.awt.Dimension; 
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundButtonInteraction {

	public static void main(String[] args) throws InterruptedException {
					// Initialization Steps
					ChromeDriver driver = new ChromeDriver();
					driver.get("https://leafground.com/button.xhtml");
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
					
				//WebElement title = driver.findElement(By.xpath("//span[text()='Click']"));
				//title.click();
					
				//Dash board Navigation
				driver.findElement(By.xpath("//h5[text()='Click and Confirm title.']/following-sibling::button")).click();
				if (driver.getTitle().equals("Dashboard")) {
					System.out.println(" Title of the Page is Dashboard");
				}
				driver.navigate().back();
				//Disabled button
				WebElement btn = driver.findElement(By.xpath("//h5[text()='Confirm if the button is disabled.']/following-sibling::button"));
				System.out.println(" is the Button Enabled :"+ btn.isEnabled());
				
				driver.navigate().back();
				
				// Find the position of the submit button
				WebElement position = driver.findElement(By.xpath("//h5[contains(text(),'Find the position of the Submit button')]/following-sibling::button"));
				position.getLocation();
				//save button color
				String savebutton = driver.findElement(By.xpath("//h5[text()='Find the Save button color']/following-sibling::button")).getCssValue("background-color");
				System.out.println("Save Button Color:"+savebutton);		

				// height and width of the button
				WebElement size = driver.findElement(By.xpath("//h5[contains(text(),'Find the height and width of this button')]/following-sibling::button"));
				size.getSize();
				System.out.println("Height of button: "+((Dimension) size).getHeight());
				System.out.println("Width of button: "+((Dimension) size).getWidth());
				driver.close();
			}

	}

