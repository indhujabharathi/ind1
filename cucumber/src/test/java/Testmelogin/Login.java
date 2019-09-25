package Testmelogin;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Testmelogin.pages.pagerepository;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	WebDriver driver;
	@Before
	public void a()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_c2a.04.30\\Desktop\\Drivers\\ChromeDriver.exe");
		driver = new ChromeDriver();
System.out.println("before Scenario");
PageFactory.initElements(driver, pagerepository.class);
	}
	@After
	public void b()
	{
		System.out.println("After Scenario");
		driver.close();
	}
@Given("Enter the url {string}")
public void c(String string) {
driver.get(string);
}
@When("user enter {string} as username")
public void d(String string) {
	pagerepository.username.sendKeys(string);

}
@When("user enter {string} as password")
public void e(String string) {
	pagerepository.pwd.sendKeys(string);

}
@Then("user Logins to Testmeapp")
public void f() {
	driver.findElement(By.linkText("Login")).click();
	WebElement Cancel=driver.findElement(By.linkText("Cancel"));
	Assert.assertTrue(Cancel.isDisplayed());
}
}
