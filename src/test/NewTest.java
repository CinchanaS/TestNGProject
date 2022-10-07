package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class NewTest {
	public static WebDriver driver;
  @Test
  public void f() {
	  driver.findElement(By.id("username")).sendKeys("cinchanas");
	  driver.findElement(By.id("password")).sendKeys("adactin");
	  driver.findElement(By.id("login")).click();
	  String actualTitle=driver.getTitle();
	  Assert.assertEquals("Adactin.com - Search Hotel",actualTitle );
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Selenium_Extracted_Files\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.navigate().to("https://adactinhotelapp.com");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
