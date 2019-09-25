package pac2;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class sce1 {
	
		@Given("I enter 50 in calculator")
		public void Given(){
			System.out.println("I enter 50 in calculator");
		}
		@And("I press Add")
		public void press()
		{
			System.out.println("I press Add");

		}
		@And("I enter 40 in calculator")
		public void enter()
		{
			System.out.println("I enter 40 in calculator");

		}
		@When("I press Equal symbol")
		public void equal() {
			System.out.println("I press Equal symbol");

		}
		@Then("Result 100 is Displayed")
		public void result()
		{
			System.out.println("Result 90 is Displayed");

		}
		

	}


