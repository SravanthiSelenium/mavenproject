package selenium.maven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class ComposeMailTest {
	WebDriver driver;
  @Test
  public void f() {
  }
  @BeforeClass
  public void beforeClass() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://accounts.google.com/");
	  driver.findElement(By.name("identifier")).sendKeys("sravanthi.t123@gmail.com");
	  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/content/span")).click();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Too many failed attempts'])[1]/following::input[3]")).sendKeys("sravanthi1251");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/content/span")).click();
	  driver.findElement(By.xpath("//*[@id='passwordNext']/content/span")).click();
		Thread.sleep(30000);
		driver.findElement(By.xpath("//*[@id='gb']/div[2]/div[3]/div/div/div/a/span")).click();
		Thread.sleep(30000);
		driver.findElement(By.id("gb_71")).click();
		
	  
	  
  }

  @AfterClass
  public void afterClass() {
  }

}
