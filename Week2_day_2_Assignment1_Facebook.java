package week2_day2_assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*================================
//Step 1: Download and set the path 
//Step 2: Launch the chromebrowser
//Step 3: Load the URL https://en-gb.facebook.com/
//Step 4: Maximise the window
//Step 5: Add implicit wait
//Step 6: Click on Create New Account button
//Step 7: Enter the first name
//Step 8: Enter the last name
//Step 9: Enter the mobile number
//Step 10: Enterthe password
//Step 11: Handle all the three drop downs
//Step 12: Select the radio button "Female" 
         ( A normal click will do for this step)

 */


public class Week2_day_2_Assignment1_Facebook {

	public static void main(String[] args) {

		//Set Property of Browser
		System.setProperty("webdriver.chrome.driver", "E:/Drivers_Testing/chromedriver.exe");

		// Launch Chrome Browser
		ChromeDriver driver = new ChromeDriver();

		// Load the URL
		driver.get("https://en-gb.facebook.com/");

		// Wait 30 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Maximize the window
		driver.manage().window().maximize();

		//click on NewAccount Button

		WebElement ElementsignInButton=driver.findElement(By.linkText("Create New Account"));
		ElementsignInButton.click();

		//Enter the firstname
		
		WebElement ElementFirstName=driver.findElement(By.name("firstname"));
		ElementFirstName.sendKeys("firstname");
		
		//Enter lastname
		WebElement ElementLastName=driver.findElement(By.name("lastname"));
		ElementLastName.sendKeys("lastname");
		
		//Enter mobileno
		WebElement ElementMobileNo=driver.findElement(By.name("reg_email__"));
		ElementMobileNo.sendKeys("123456789");
		
	    //Enter Password
		WebElement ElementPassword=driver.findElement(By.name("reg_passwd__"));
		ElementPassword.sendKeys("samplepass");
		
		// select dropdown day,month,year
		WebElement  birthDayDropDown = driver.findElement(By.name("birthday_day")); 
		Select dsel =new Select(birthDayDropDown);
		dsel.selectByVisibleText("10");
		
		WebElement  birthMonthDropDown =driver.findElement(By.name("birthday_month")); 
		Select msel =new Select(birthMonthDropDown);
		msel.selectByValue( "4");

		WebElement  birthYearDropDown = driver.findElement(By.name("birthday_year")); 
		Select ysel =new Select(birthYearDropDown);
		ysel.selectByIndex(2); 
		
		WebElement femaleRadioButton=driver.findElement(By.xpath("//input[@name='sex']"));
		femaleRadioButton.click();
		
		
		//get title
		String title = driver.getTitle();
		System.out.println("The Title is : " + title);
		
		//close the driver
	 
		driver.close();
	}

}
