package MultipleFeature;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class class2 {
	@Given("I enter 80 in calculator")
	public void Given1(){
		System.out.println("I enter 80 in calculator");
	}
	@And("I press sub")
	public void press1()
	{
		System.out.println("I press sub");
		System.out.println("***********************");

	}
}
