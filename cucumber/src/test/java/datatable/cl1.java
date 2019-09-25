package datatable;

import java.util.List;
import java.util.Map;



import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cl1 {
	@Given("There are {word} fruits")
	public void aa(String n,DataTable d) {
		List<Map<String, String>> data=d.asMaps(String.class,String.class);
				{
			System.out.println("There are"+n+"fruits" +data.get(0).get("type"));
			System.out.println("There are"+n+"fruits" +data.get(1).get("type"));
				}
	}
@When("i eat {word} fruits")	
public void bb(String wd)
{
	System.out.println(" i eat"+wd+" fruits");
}
@Then("i have {word} fruits")
public void c(String nn) {
	System.out.println("i have"+nn+ " fruits");
	System.out.println("******************");

}

}
