package runner;

import org.testng.annotations.BeforeTest;

import cucumber.api.CucumberOptions;
import mobileWrapper.AppSpecificMethods;



@CucumberOptions(features = "src/test/java",
                 glue = "pages")
public class TestRun extends AppSpecificMethods {
	
	


@BeforeTest
public void setData() {
	testCaseName = "TC001_Login";
	testDescription = "Login in LeafOrg app";
	testNodes = "TC001";
	authors = "Madhavan";
	category = "Smoke";
	
}

}

