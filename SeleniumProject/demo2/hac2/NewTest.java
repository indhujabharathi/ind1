package demo2.hac2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
  @Test
  public void BeforeTest() {
  	  driver=BrowserClass.openBrowser("chrome");
  	  driver.get("https://portfolio.rediff.com/portfolio_login/");
  	  driver.findElement(By.name("email-id")).sendKeys("david@rediffmail.com");
driver.findElement(By.id("emailsubmit")).click();
driver.findElement(By.name("passwd")).sendKeys("123");
	  
  }
}
