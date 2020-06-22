package mobileWrapper;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import utils.DataInputProvider;

public class AppSpecificMethods extends MobileWrapper{
	
	public String dataSheetName;

	@BeforeSuite
	public void bs() {
		startResult();
	}

	@BeforeClass
	public void bc() {
		startTestModule(testCaseName, testDescription);
	}


	@BeforeMethod
	public void bm() {
		startTestCase(testNodes);
		launchApp("com.vodqareactnative", "com.vodqareactnative.MainActivity", "Redmi8Dual", "43d888db0906");
		switchWebview();
	}

	@AfterMethod
	public void am() {
		closeApp();
	}

	@AfterSuite
	public void as() {
		endResult();
	}

	@DataProvider(name = "fetchData")
	public Object[][] getData() {
		return DataInputProvider.getSheet(dataSheetName);
	}

}
