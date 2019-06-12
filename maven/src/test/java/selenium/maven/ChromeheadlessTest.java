package selenium.maven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;

public class ChromeheadlessTest {
	WebDriver driver;
  @Test
  public void f() {
	  
	  driver.get("https://www.google.com");
	  driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mindq systems");
	  String str= driver.getTitle();
	  System.out.println(str);
	  }
 
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
	  ChromeOptions options=new ChromeOptions();
	  options.addArguments("1300,800");
	  options.addArguments("headless");
	  driver=new ChromeDriver(options);
	   }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
