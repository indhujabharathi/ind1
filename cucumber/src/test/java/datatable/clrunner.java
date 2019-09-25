package datatable;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin= {"html:src/test/java/datatable/output/cucumber-html-report",
				"json:src/test/java/datatable/output/cucumber.json",
				"junit:src/test/java/datatable/output/cucumber-results.xml"}
		)
public class clrunner {

}
