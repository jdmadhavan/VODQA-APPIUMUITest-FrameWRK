package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import mobileWrapper.AppSpecificMethods;
import pages.LoginPage;

public class TC001_Login extends AppSpecificMethods{
	
	@BeforeTest
	public void setData() {
		testCaseName = "TC001_Login";
		testDescription = "Login in VODQA APP";
		testNodes = "TC001";
		authors = "Madhavan";
		category = "Smoke";
		dataSheetName = "TC001";
		
		
		
	}
	
	
	
	@Test(dataProvider = "fetchData")
	public void login(String uName, String pwd) {
		new LoginPage()
		 .enterUserName(uName)
		 .enterPassword(pwd)
		 .clickLogin()
		 .clickWheelPickerMenu();

}
}
