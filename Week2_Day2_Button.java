package week2_day2_Assignment4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week2_Day2_Button {

	public static void main(String[] args) throws InterruptedException {
		

		//Launch Browser and Load URL

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get( "http://leafground.com/pages/Button.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();



		//  Get the xy position  

		WebElement getPositionButton = driver.findElement( By.id("position"));
		Point xypoint = (Point) getPositionButton.getLocation();
		int xValue = (int) ((org.openqa.selenium.Point) xypoint).getX();
		int yValue = (int) ((org.openqa.selenium.Point) xypoint).getY();
		System.out.println("X value is :" +xValue +" Y value is:"+ yValue);
		Thread.sleep(2000);



		// Find the color
		WebElement colorButton = driver.findElement(By.id("color"));
		String color= colorButton.getCssValue( "background-color");
		System.out.println("Button color is : "+color );
		Thread.sleep(2000);

		// Size of button

		WebElement sizeButton = driver.findElement( By.id("size"));
		int height =  sizeButton.getSize().getHeight();
		int width = sizeButton.getSize().getWidth();
		System.out.println("Height is : " +height + "Width is : "+ width);
		Thread.sleep(1000);

		//get URL

		String title = driver.getTitle();
		System.out.println("The Title is : " + title);


		// go to home

		WebElement homeButton = driver.findElement(By.id("home")); 
		homeButton.click();

		//get title

		String title1 = driver.getTitle();
		System.out.println("The Title1 is : " + title1);

		// close the driver

		driver.close();



	}

}
