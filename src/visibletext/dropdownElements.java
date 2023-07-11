package visibletext;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class dropdownElements {
	WebDriver driver;
	
	 @Test(enabled=false)
  public void visibletext() {
		 driver.get("https://demo.guru99.com/test/newtours/register.php");
		 driver.findElement(By.name("phone")).sendKeys("9182659536");
		 Select dropCountry = new Select(driver.findElement(By.name("country")));
		 dropCountry.selectByVisibleText("ANDORRA");
		 
  }
  
	 @Test
	  public void visibleindex() {
			 driver.get("https://demo.guru99.com/test/newtours/register.php");
			 driver.findElement(By.name("lastName")).sendKeys("Reddy");
			 Select dropdownCountry = new Select(driver.findElement(By.name("country")));
			 dropdownCountry.selectByIndex(12);
			 
	  }
  
  
  
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
