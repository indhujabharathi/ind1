package MultipleFeature;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class class1 {
	@Given("I enter 50 in calculator")
	public void Given(){
		System.out.println("I enter 50 in calculator");
	}
	@And("I press Add")
	public void press()
	{
		System.out.println("I press Add");
		
		System.out.println("************************");

	}
}
