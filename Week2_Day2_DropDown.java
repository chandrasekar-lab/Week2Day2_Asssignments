package week2_day2_Assignment4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week2_Day2_DropDown {

	public static void main(String[] args) throws InterruptedException {
		

		//Launch Browser and Load URL


		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get( " http://www.leafground.com/pages/Dropdown.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();



		// select by index

		WebElement dropDown1 = driver.findElement(By.id("dropdown1")); 
		Select select1 = new Select(dropDown1);
		select1.selectByIndex(1);
		Thread.sleep(1000);     // for visibilty purpuse using Thread.sleep

		//select by text

		WebElement dropDown2 = driver.findElement(By.name("dropdown2")); 
		Select select2 = new Select(dropDown2);
		select2.selectByVisibleText("Selenium");
		Thread.sleep(1000);



		WebElement dropDown3 = driver.findElement(By.id("dropdown3")); 
		Select select3 = new Select(dropDown3);
		select3.selectByValue( "1");
		Thread.sleep(1000);

		//select all and count size

		WebElement dropDown = driver.findElement(By.className("dropdown"));
		Select select = new Select(dropDown);

		List<WebElement>  listofoptions = select.getOptions();
		int size = listofoptions.size();
		System.out.println("Number of Elements :" + size);

		// using send keys
		WebElement dropDown4 = driver.findElement(By.xpath
				( "//div[@id='contentblock']/section[1]/div[5]/select[1]")); 
		dropDown4.sendKeys( "Appium");
		Thread.sleep(1000);


		// multiple select

		WebElement multiSelect = driver.findElement
				(By.xpath( "//*[@id=\"contentblock\"]/section/div[6]/select"));

		Select multiSelectBox = new Select(multiSelect);

		multiSelectBox.selectByIndex(1);
		multiSelectBox.selectByIndex(2);
		multiSelectBox.selectByIndex(3); 
		multiSelectBox.selectByIndex(4);
		
		//get URL
		
		String title = driver.getTitle();
		System.out.println("The Title is : " + title);
		
	    // close the driver
		
		driver.close();


	}

}
