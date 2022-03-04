package week2_day2_Assignment4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week2_Day2_CheckBox {

	public static void main(String[] args) {
		

		//Launch Browser and Load URL


		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get( "http://www.leafground.com/pages/checkbox.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		//Select the languages that you know?

		WebElement java=driver.findElement(By.xpath( "//*[@id='contentblock']/section/div[1]/div[1]/input"));
		java.click();

		//Confirm Selenium is checked

		WebElement selenium=driver.findElement( By.xpath( "//*[@id='contentblock']/section/div[2]/div/input"));

		Boolean seleniumSelected=  selenium.isSelected();
		System.out.println(seleniumSelected);

		//DeSelect only checked
		WebElement deSelect =driver.findElement(By.xpath("(//label[text()='DeSelect only checked']/following::input)[2]"));
		deSelect.click();


		//Select all below checkboxes
		WebElement selectAll1=driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following::input"));
		selectAll1.click();
		WebElement selectAll2=driver.findElement(By.xpath("(//label[text()='Select all below checkboxes ']/following::input)[2]"));
		selectAll2.click();
		WebElement selectAll3=driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following::input[3]"));
		selectAll3.click();
		WebElement selectAll4=driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following::input[4]"));
		selectAll4.click();
		WebElement selectAll5=driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following::input[5]"));
		selectAll5.click();

		//get URL

		String title = driver.getTitle();
		System.out.println("The Title is : " + title);

		// close the driver

		driver.close();


	}

}
