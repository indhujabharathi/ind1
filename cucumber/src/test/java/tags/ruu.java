package tags;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(//tags= {"@smoke"}
		//tags= {"@smoke or @sanity"}
		tags= {"@smoke and @sanity"})

public class ruu {

}
