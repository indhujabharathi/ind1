package Testmelogin.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class pagerepository {
	@FindBy(how=How.ID,using="userName")
	static public WebElement username;
	@FindBy(how=How.ID,using="password")
	static public WebElement pwd;

}
