package demo2.hac2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pro1.BrowserClass;
public class pro1 {
	WebDriver driver;
  @Test(priority=2)
  public void OpenChrome() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_c2a.04.30\\Desktop\\Drivers\\ChromeDriver.exe");
	  driver=new ChromeDriver();
	  
	  
  }
  @Test(priority=1)
  public void OpenIE() {
	  System.setProperty("webdriver.ie.driver","C:\\Users\\Training_c2a.04.30\\Desktop\\Drivers\\IEDriverServer.exe");
	  driver=new InternetExplorerDriver();
	  driver.get("http://www.google.com");
	  
  }
  @AfterMethod
   public void afterMethod()
	  {
		  driver.close();
	  }
  }

