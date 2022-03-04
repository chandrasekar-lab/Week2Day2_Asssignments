package week2_day2_Assignment4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week2_Day2_EditHtml {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch Browser and Load URL

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get( "http://leafground.com/pages/Edit.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		//Enter your email address
		
		WebElement emailBox = driver.findElement( By.id("email"));
		emailBox.sendKeys("test@gmail.com");
		Thread.sleep(1000);

		//Append a text and press keyboard tab
		
		WebElement appendBox = driver.findElement(By.xpath( "//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
		appendBox.sendKeys("text");
		Thread.sleep(1000);
		
		//Get default text entered
		
		WebElement getTextBox = driver.findElement(By.name("username"));
		String value = getTextBox.getAttribute( "value");
		Thread.sleep(1000);
		System.out.println(value);
		Thread.sleep(1000);

		//Clear the text
		
		WebElement clearBox = driver.findElement( By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
		clearBox.clear();
		Thread.sleep(1000);
		
		//Confirm that edit field is disabled

		WebElement disabledox = driver.findElement( By.xpath( "//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
		boolean enabled = disabledox.isEnabled();
		System.out.println(enabled);


		//get URL

		String title = driver.getTitle();
		System.out.println("The Title is : " + title);

		// close the driver

		//driver.close();
	}

}
