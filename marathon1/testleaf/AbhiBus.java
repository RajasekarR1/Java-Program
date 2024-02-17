package org.marathon1.testleaf;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbhiBus {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(3000);
		WebElement from = driver.findElement(By.xpath("//input[@placeholder='From Station']"));
		from.sendKeys("Chennai");
		driver.findElement(By.xpath("//div[text()='Chennai']")).click();
		WebElement to = driver.findElement(By.xpath("//input[@placeholder='To Station']"));
		to.sendKeys("Bangalore");
		driver.findElement(By.xpath("//div[text()='Bangalore']")).click();
		driver.findElement(By.xpath("//button[text()='Tomorrow']")).click();

		WebElement buslisted = driver.findElement(By.xpath("(//h5[@class='title'])[1]"));
		System.out.println("BusName:"  +buslisted.getText());

		driver.findElement(By.xpath("//span[text()='Sleeper']")).click();

		//WebElement seat = driver.findElement(By.xpath("//div[@id='service-operator-select-seat-1879950486']//small[1]"));
		//seat.getText();
		Thread.sleep(3000);
		WebElement seat = driver.findElement(By.xpath("(//div[@class='text-grey'])[1]"));
		seat.click();
		System.out.println("Available Seat:"  +seat.getText());

		WebElement book = driver.findElement(By.xpath("(//button[@class='btn bus-info-btn filled primary sm inactive button'])[1]"));
		book.click();

		driver.findElement(By.xpath("(//button[@class='seat sleeper'])[1]")).click();

		Thread.sleep(3000);
		WebElement boardingpoint = driver.findElement(By.xpath("(//div[@class='label'])[1]"));
		System.out.println("Boarding point:" +boardingpoint.getText());
		boardingpoint.click();

		WebElement droppoint = driver.findElement(By.xpath("(//div[@class='label'])[1]"));
		System.out.println("Drop Point :" +droppoint.getText());
		droppoint.click();

		WebElement Seatselected = driver.findElement(By.xpath("(//span[@class='text-primary'])[1]"));
		System.out.println("Seat Number:" + Seatselected.getText());

		WebElement fare = driver.findElement(By.xpath("(//span[@class='text-primary'])[2]"));
		System.out.println("Ticket fare:" + fare.getText());

	}

}
