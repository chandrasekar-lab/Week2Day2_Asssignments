package week2_day2_Assignment4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week2_Day2_Interact_Images {

	public static void main(String[] args) throws InterruptedException {

		//Launch Browser and Load URL

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html" );
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		//Click on this image to go home page

		WebElement image1=driver.findElement(By.xpath("//img[@src='../images/home.png']"));
		image1.click();

		//get URL

		String url = driver.getCurrentUrl();
		System.out.println("The Title is : " + url);

		driver.navigate().back();
		//get URL

		String url1 = driver.getCurrentUrl();
		System.out.println("The Title is : " + url1);


		//Am I Broken Image?

		WebElement brokenImage=driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']"));
		brokenImage.click();

		//natrualWidth =0

		if(brokenImage.getAttribute("naturalWidth").equals("0"))
		{
			System.out.println("The Image is Broken");
		}
		else 
		{
			System.out.println("This Image in Not Broken");

		}


		//Click me using Keyboard or Mouse

		WebElement mouseClikImage=driver.findElement(By.xpath("//img[@src='../images/keyboard.png']"));
		mouseClikImage.click();


		//get URL

		String url2 = driver.getCurrentUrl();
		System.out.println("The Title is : " + url2);

		//get Title

		String title = driver.getTitle();
		System.out.println("The Title is : " + title);

		// close the driver

		// driver.close();







	}

}
