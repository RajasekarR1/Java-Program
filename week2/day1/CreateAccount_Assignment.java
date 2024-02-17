package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount_Assignment {

	public static void main(String[] args) throws InterruptedException {
		// Initialization Steps
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/");
			driver.manage().window().maximize();
			
			WebElement name = driver.findElement(By.id("username"));
			name.sendKeys("DemoSalesManager");
			
			WebElement pass = driver.findElement(By.id("password"));
			pass.sendKeys("crmsfa");
			
			WebElement submit = driver.findElement(By.className("decorativeSubmit"));
			submit.click();
			
			WebElement link = driver.findElement(By.linkText("CRM/SFA"));
			link.click();
			
			// Click on the accounts tab
			WebElement accountstab = driver.findElement(By.linkText("Accounts"));
			accountstab.click();
			
			WebElement create = driver.findElement(By.linkText("Create Account"));
			create.click();
			
			WebElement accname = driver.findElement(By.id("accountName"));
			accname.sendKeys("Rajasekar R");
			
			WebElement describe = driver.findElement(By.name("description"));
			describe.sendKeys("Selenium Automation Tester");
			
			//Select using Industry
			WebElement industry = driver.findElement(By.name("industryEnumId"));
			
			Select option =new Select(industry);
			option.selectByVisibleText("Computer Software");
			
			//Select using Ownership
			WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
			Select option1= new Select(ownership);
			option1.selectByVisibleText("S-Corporation");
			
			//Select using source
			WebElement source = driver.findElement(By.id("dataSourceId"));
			Select option2=new Select(source);
			option2.selectByValue("LEAD_EMPLOYEE");
			
			//Select using Marketing Campaign
			WebElement marketing = driver.findElement(By.id("marketingCampaignId"));
			Select option3 =new Select(marketing);
			option3.selectByIndex(6);
			
			//Select using state or province
			WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
			Select option4 = new Select(state);
			option4.selectByValue("TX");
			
			//create account by .click
			WebElement create_account = driver.findElement(By.className("smallSubmit"));
			create_account.click();
			
			//Verify the account name is correct   Xpath syntax => //tagname[@attributename='attributevalue']
			
			String getText = driver.findElement(By.xpath("(//span[@class='tabletext'][3])")).getText();
			System.out.println(getText);
			
			if (getText.contains("Rajasekar R")) {
				System.out.println("The Account is created Succesfully");
			} else {
				System.out.println("The Account is not created");

			}
	
			
	}

}

