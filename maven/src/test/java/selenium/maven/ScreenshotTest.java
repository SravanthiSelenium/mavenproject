package selenium.maven;

import java.awt.Dimension;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ScreenshotTest {
	
WebDriver driver;
	
	
/* screenshot logic declaring globally to access anywhere in the test methods*/
	

	// public void takescreenshot(String str2) throws IOException {
public void takescreenshot() throws IOException {

		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	//FileUtils.copyFile(f, new File("D:\\seleniumworkspace\\Screenshots\\"+str2+".jpg"));
		FileUtils.copyFile(f, new File("D:\\seleniumworkspace\\Screenshots\\"+System.currentTimeMillis()+".jpg"));
	
/*	Robot robo = new Robot();
	
	Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
			
	BufferedImage img = robo.createScreenCapture(new Rectangle(screensize));
	
	ImageIO.write(img, "png", new File("D:\\Workspace_April2019\\Java4\\screenshots\\sample_"+System.currentTimeMillis()+".png")); */
	
	
	
	
	

	}
	
 

 @Test(priority=0)
  public void browser() throws IOException {
	

System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
	
ChromeOptions options=new ChromeOptions(); // chromeoptions class initialization
	
options.addArguments("1300,800"); // specifiying browser window size, i.e height and width
	
options.addArguments("headless"); // specifying mode of execution with headless
   
driver=new ChromeDriver(options); // chromedriver initialization by passing options parameter.
		
driver.get("https://www.google.com");
		
driver.manage().window().maximize();
		 
driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mindq systems");
		
  String str= driver.getTitle();
		 
 System.out.println(str); 
		  
		
String str1=driver.getCurrentUrl();
		
System.out.println(str1);

		
takescreenshot(); // calling takescreenshot method in @test method
		
		
		
  }
  }
