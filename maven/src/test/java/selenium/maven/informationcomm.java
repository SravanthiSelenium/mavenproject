package selenium.maven;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class informationcomm {
	
	WebDriver driver;
	//Actions a=new Actions(driver);
	//@Ignore
	
	@Test(enabled=true,priority=0,description="1stfirstmethod",dependsOnMethods="PIM_addemployee" )
	  public void admin()
	 {  
	        Actions a=new Actions(driver);
		 a.moveToElement(driver.findElement(By.linkText("Admin"))).build().perform();
		  a.moveToElement(driver.findElement(By.linkText("User Management"))).build().perform();
		 driver.findElement(By.linkText("Users")).click();
		  
	  }
  @Test(enabled=true,priority=1,description="2ndmethod")
  public void PIM_addemployee() throws InterruptedException {
		// driver.findElement(By.linkText("PIM")).click();
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.linkText("PIM"))).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.name("firstName")).sendKeys("rahuls");
		driver.findElement(By.id("lastName")).sendKeys("g");
		//driver.findElement(By.name("photofile")).sendKeys("C:\\Users\\sudheer\\Desktop\\testdeliverables.jpeg");
		driver.findElement(By.id("btnSave")).click();
		//a.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		Thread.sleep(2000);
		//a.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
	}
  
  @BeforeTest
  public void browser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		driver=new ChromeDriver(); // to initialize the chrome browser
		driver.get("https://opensource-demo.orangehrmlive.com");
	//	driver.get("https://opensource-demo.orangehrmlive.com/index.php/leave/assignLeave");
		driver.manage().window().maximize();
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.className("button")).click();
		Thread.sleep(3000);
		}

  @AfterTest
  public void logout() throws InterruptedException {
	   Thread.sleep(3000);
	  driver.findElement(By.linkText("Welcome Admin")).click();
	  Thread.sleep(3000);
	  
	  
	  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/ul/li[2]/a")).click(); 
	  driver.quit();
  }

}
