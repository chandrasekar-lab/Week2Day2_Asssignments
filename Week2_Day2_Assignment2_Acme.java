package week2_day2_assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

/*1. Load url "https://acme-test.uipath.com/login"
2. Enter email as "kumar.testleaf@gmail.com"
3. Enter Password as "leaf@12"
4. Click login button
5. Get the title of the page and print
6. Click on Log Out
7. Close the browser (use -driver.close())
 */

public class Week2_Day2_Assignment2_Acme {

	public static void main(String[] args) {

		//Set Property of Browser
		System.setProperty("webdriver.chrome.driver", "E:/Drivers_Testing/chromedriver.exe");

		// Launch Chrome Browser
		ChromeDriver driver = new ChromeDriver();

		// Load the URL
		driver.get("https://acme-test.uipath.com/login");

		// Wait 30 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Maximize the window
		driver.manage().window().maximize();

		// Enter email as "kumar.testleaf@gmail.com"

		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");

		//Enter Password as "leaf@12"
		driver.findElement(By.id("password")).sendKeys("leaf@12");

		// Click login button

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		//Get the title of the page and print

		String title = driver.getTitle();
		System.out.println("The Title is : " + title);

		//Click on Log Out

		driver.findElement(By.linkText("Log Out")).click();

		//close the driver

		driver.close();




	}

}
