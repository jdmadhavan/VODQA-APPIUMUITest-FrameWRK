package pages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import mobileWrapper.AppSpecificMethods;

public class LoginPage extends AppSpecificMethods{
	
	public LoginPage enterUserName(String uName) {
		if(enterValue(uName, "accessibilityId", "username"))
			reportStep("UserName Value "+uName+ "entered successfully", "PASS");
		else
			reportStep("UserName couldn't enter", "FAIL");
		return this;
	}
	
	public LoginPage enterPassword(String pwd) {
		if(enterValue(pwd, "accessibilityId", "password"))
			reportStep("Password "+pwd+ "entered successfully", "PASS");
		else
			reportStep("Password couldn't enter", "FAIL");
		return this;
	}
	
	@When("the user clicked the login button")
	public HomePage clickLogin() {
		if(click("xpath", "//android.widget.TextView[@text='LOG IN']")) {
			try {
				Thread.sleep(15000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			reportStep("The Login Button clicked successfully", "PASS");
		} else {
			reportStep("the login button not click", "Fail");
		}
		return new HomePage();
	}
	
	
	
	

}
