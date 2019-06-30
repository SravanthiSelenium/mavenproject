package Datadriven;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class Dataprovider {
	WebDriver driver;
  @Test(dataProvider = "authenticATION")
  public void f(String n, String s) {
	  driver.findElement(By.name("email")).sendKeys(n);
	  driver.findElement(By.name("pass")).sendKeys(s);
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  
  }


  @DataProvider(name = "authenticATION")
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "sravanthi123@gmail.com", "sravanthi51" },
      
    };
  }
}
