package listenerclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;

public class Testcase {
	public WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	  driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	  driver.findElement(By.name("Submit")).click();
	  
  }
  @BeforeTest
  public void beforeTest() {
	 
  }

  @AfterTest
  public void afterTest() {
  }

}
