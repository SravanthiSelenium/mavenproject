package Popuphandling;

import java.util.Iterator;
import java.util.Set;

import org.apache.poi.poifs.property.Parent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class NaukriPopupTest {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver;
		 System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
			driver=new ChromeDriver();		
		
        //Launching the site.				
            driver.get("https://www.naukri.com");			
        driver.manage().window().maximize();	
        System.out.println(driver.getTitle());
          
        String MainWindow=driver.getWindowHandle();		
        System.out.println("main window id is:"+MainWindow);
		
        // To handle all new opened window.				
           Set<String> allwindows=driver.getWindowHandles();		
           int count=allwindows.size();
           System.out.println("all window id's are"+allwindows);
           System.out.println("total windows is"+count);
           
      /*  Iterator<String> i1=allwindows.iterator();		
       
          while(i1.hasNext())			
        {		
            String ChildWindow=i1.next();		
            		
            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
            {    		
                    // Switching to Child window
            	
                    driver.switchTo().window(ChildWindow);	   
                   Assert.assertEquals("Amazon",driver.getTitle());
                      driver.findElement(By.xpath("html/body/a/img")).click();	
                    //driver.navigate().to("https://company.naukri.com/popups/amazon/852019/index.html");
                      
                  Thread.sleep(2000);                       
                      // driver.findElement(By.name("btnLogin")).click();		
            	
                                
			// Closing the Child Window.
                        driver.close();//to close pop up window.		
            }		
        }		*/
           
           for(String child:allwindows) {
        	 if(!MainWindow.equalsIgnoreCase(child)) 
        	 	{
        		 driver.switchTo().window(child);
        		 Thread.sleep(2000);
        		 driver.close();
        	 	}
        	 }
        // Switching to Parent window i.e Main Window.
            driver.switchTo().window(MainWindow);	
            System.out.println("main window title is:"+driver.getTitle());
    }
        
        

}
