package pages;

import cucumber.api.java.en.Then;
import mobileWrapper.AppSpecificMethods;

public class HomePage extends AppSpecificMethods{
	
	
	public DropDownPage clickWheelPickerMenu() {
		
		System.out.println("insode");
		
		scrollFromDownToUpinAppUsingPointerInputUntilElementIsVisible("xpath", "//android.widget.TextView[@text='Wheel Picker']");
		System.out.println("out");
		click("xpath", "//android.widget.TextView[@text='Wheel Picker']");
		return new DropDownPage();
	}

}
