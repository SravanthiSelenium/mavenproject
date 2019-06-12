package selenium.maven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class AjaxTest {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  System.out.println("enter into google chrome");
	  driver.findElement(By.name("q")).sendKeys("google");
	  Thread.sleep(3000);
	  String src=driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div")).getText();
	  //Thread.sleep(3000);
	  System.out.println(src);
	  String s[]=src.split("\n"); // variable length array, so that array memory allocated based on input
	  System.out.println(s.length); // to find the array length
	  for (int i = 0; i < s.length; i++) 
	  {
	  	if(s[i].equalsIgnoreCase("google translate"))
	  	{
	  	System.out.println(s[i]);
	  	driver.findElement(By.name("q")).clear();
	  	 driver.findElement(By.name("q")).sendKeys(s[i]);
	  		
	  	}
	  }
	  
	  
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.google.com/");
	   }

  @AfterClass
  public void afterClass() {
  }

}
