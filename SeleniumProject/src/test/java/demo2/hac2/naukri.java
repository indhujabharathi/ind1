package demo2.hac2;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class naukri {
	WebDriver driver;
	
  @Test
  public void Test() {
	  driver=BrowserClass.openBrowser("chrome");
  	  driver.get("https://naukri.com");
  	//  driver.manage().window().maximize();
  	/*  driver.findElement(By.name("email-id")).sendKeys("david@rediffmail.com");
driver.findElement(By.id("emailsubmit")).click();
WebDriverWait wait= new WebDriverWait(driver,20);
wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("userpass"))));
driver.findElement(By.id("userpass")).sendKeys("123");*/
  	Set<String>  win=driver.getWindowHandles();
  	System.out.println(win.size());
	 Iterator<String> it=win.iterator();
     String main=it.next();
     String first=it.next();
     String second=it.next();
     String third=it.next();
     System.out.println(main);
     System.out.println(first);
     System.out.println(second);
     System.out.println(third);
     driver.switchTo().window("main");
     driver.close();
     driver.switchTo().window("first");
     driver.close();
     driver.switchTo().window("second");
     driver.close();
     driver.switchTo().window("third");
     
     driver.close();
      
  }
  @AfterTest
  public void AfterTest()
  {
	  driver.switchTo().defaultContent();
	  driver.close();
	     driver.quit();


  }
}
