package Expressions;
import io.cucumber.java.en.And;
	import io.cucumber.java.en.Given;
	
	public class exp1 {
		@Given("I enter {int} in calculator")
		public void Given(int num){
			System.out.println("I enter"+num+ "in calculator");
		}
		@And("I press {word}")
		public void press(String a)
		{
			System.out.println("I press "+a);

		}
		@And("I enter {int} in the calculator")
		public void enter(int num1)
		{
			System.out.println("I enter"+num1+" in the calculator");

		}
		
		

	}


