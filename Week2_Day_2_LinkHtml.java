package week2_day2_Assignment4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week2_Day_2_LinkHtml {

	public static void main(String[] args) {


		//Launch Browser and Load URL

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get( "http://leafground.com/pages/Link.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		//driver.findElement(By.linkText( "Go to Home Page")).click();  // LinkText

		driver.findElement(By.partialLinkText( " Home Page")).click(); // PartialLinktext

		driver.navigate().back();

		//Find where am supposed to go without clicking me?

		String gotoHomewitoutclickimMe = driver.findElement(By.xpath("(//a[@href='../home.html'])[2]")).getAttribute( "href");
		driver.navigate().to(gotoHomewitoutclickimMe);

		String title= driver.getTitle();
		System.out.println("Title is" +title);

		driver.navigate().back();

		//Verify am I broken?

		String amIBroken = driver.findElement(By.xpath("//a[@href='error.html']")).getAttribute( "href");
		driver.navigate().to(amIBroken);
		String title1= driver.getTitle();
		System.out.println("Title is" +title1);

		if(title1.equals("HTTP Status 404 – Not Found"))
		{
			System.out.println("Yes you are Broken");
		}
		else 
		{
			System.out.println("No you are  Not Broken");

		}

		driver.navigate().back();

		//Go to Home Page (Interact with same link name)

		WebElement goToHome_SameLink=driver.findElement(By.xpath("(//a[@href='../home.html'])[2]"));
		goToHome_SameLink.click();

		//get title

		String title2 = driver.getTitle();
		System.out.println("The Title1 is : " + title2);

		// close the driver

		//driver.close();


	}

}
