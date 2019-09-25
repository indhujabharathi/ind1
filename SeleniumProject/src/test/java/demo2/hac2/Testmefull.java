package demo2.hac2;
import org.testng.annotations.*;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import demo2.hac2.BrowserClass;

public class Testmefull {
  
	  	 WebDriver driver;
	  	 WebDriverWait wait;
	  	 Actions act;
	    @BeforeTest
	    public void BeforeTest() {
	  	  driver=BrowserClass.openBrowser("chrome");
	  	  driver.get("http://10.232.237.143:443/TestMeApp/RegisterUser.htm");
	  	 // List<WebElement> ab=driver.findElements(By.tagName("a"));
	  	 // System.out.println(ab.size());
	  	 // for(int i=0;i<ab.size();i++)
	  	  //{
	  		//  System.out.println(ab.get(i).getText());
	  	//  }
	    }
	  @Test(enabled=false)
	    public void CHECKBOXSEARCH()
	    {
	    	
	      driver.findElement(By.name("userName")).sendKeys("lalitha");
	  	  driver.findElement(By.xpath("//input[@name='password'and @type='password']")).sendKeys("password123");
	  	  driver.findElement(By.name("Login")).click();
	  	  driver.findElement(By.xpath("//input[@id='myInput'and @type='text']")).sendKeys("Headphones");
	  	  driver.findElement(By.xpath("//input[@name='val'and @value='FIND DETAILS']")).click();
	  	  }
	  	  @Test
	  	  public void Elements()
	  	  {
	  		 driver.findElement(By.id("userName")).sendKeys("indhuj");
			  driver.findElement(By.id("firstName")).sendKeys("indhuja");
			  driver.findElement(By.id("lastName")).sendKeys("bharathi");
			  driver.findElement(By.id("password")).sendKeys("Indhuja12");
			  driver.findElement(By.id("pass_confirmation")).sendKeys("Indhuja12");
			  driver.findElement(By.xpath("//input[@id='gender' and@value='Female']")).click();
			  driver.findElement(By.id("emailAddress")).sendKeys("indhu123@gmail.com");
			  driver.findElement(By.id("mobileNumber")).sendKeys("9159876448");
			  driver.findElement(By.id("dob")).sendKeys("28/12/1997");
			  driver.findElement(By.id("address")).sendKeys("pudumadurai");
			  driver.findElement(By.id("answer")).sendKeys("pudrmadurai");
			  driver.findElement(By.name("Submit")).click();
			  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			  
	  		  driver.findElement(By.name("userName")).sendKeys("indhu");
		  	  driver.findElement(By.xpath("//input[@name='password'and @type='password']")).sendKeys("Indhuja12");
		  	  driver.findElement(By.name("Login")).click();
		  	  
             act=new Actions(driver);
	  	     act.moveToElement(driver.findElement(By.linkText("All Categories"))).build().perform();
	  	     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  	     act.moveToElement(driver.findElement(By.linkText("Electronics"))).click().build().perform();
	  	     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  	     act.moveToElement(driver.findElement(By.linkText("Head Phone"))).click().build().perform();
	  	     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  	     
	  	     act.doubleClick(driver.findElement(By.linkText("Add to cart"))).click().build().perform();
	  	     driver.findElement(By.partialLinkText("Cart")).click();
	  	     driver.findElement(By.partialLinkText("Checkout")).click();
	  	   	 driver.findElement(By.xpath("//input[@type='submit' and @value='Proceed to Pay']")).click();
	  	     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  	     
	  	     
	  	    driver.findElement(By.xpath("//label[contains(text(),'Andhra Bank')]")).click();
	  	 	driver.findElement(By.id("btn")).click();
	  	    
	  	 	driver.findElement(By.name("username")).sendKeys("123456");
	  	 	driver.findElement(By.xpath("//input[@name='password'and @type='password']")).sendKeys("Pass@456");
	  	    driver.findElement(By.xpath("//input[@type='submit' and @value='LOGIN']")).click();
	  	    
	  	 	driver.findElement(By.xpath("//input[@name='transpwd'and @value='PASSWORD']")).sendKeys("Trans@456");
	  	 	driver.findElement(By.xpath("//input[@type='submit' and @value='PayNow']")).click();
            driver.findElement(By.linkText("SignOut")).click();
 }
	
}

  

