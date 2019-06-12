package selenium.maven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Iframe {
	WebDriver driver;
	public void iframe()
	{
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/sravanthi.talachutla/Desktop/iframe.html");
		}
	public void recrutors()
	{
		List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
		  System.out.println("The total number of iframes are " + iframeElements.size());
		  driver.switchTo().frame("second");
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[2]/a"))).build().perform();
		driver.findElement(By.linkText("Browse All Recruiters")).click();
		driver.switchTo().defaultContent();
		driver.quit();
	}

	public static void main(String[] args) {
		Iframe obj=new Iframe();
		obj.iframe();
		obj.recrutors();
		
	}

}
