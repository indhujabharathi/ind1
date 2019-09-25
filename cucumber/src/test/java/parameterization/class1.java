package parameterization;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class class1 {
@Given("i am a {word} tester")
public void aa(String d){
	System.out.println("i am a "+d+" tester");
}
@When("i go to work")
public void bb(){
	System.out.println("i go to work");

	
}
@Then("i {word} it")
public void cc(String e){
	System.out.println("i" +e+ "it");

	
}
@And("my boss {word} me")
public void ff(String hh){
	System.out.println("my boss" +hh+  "me");
	System.out.println("****************************");

}
}
