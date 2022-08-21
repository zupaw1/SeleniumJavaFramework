package uiTests;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;

import testBase.TestBase;

public class ErrorTests_motorcycle extends TestBase {

	@Test (enabled = true)
	public void errorMessage_PayLoadField() {
		homepage.clickOnMotorCycleLink();
		vehData.enterCylinderCapacity("33333");
		test.log(Status.PASS, "Cylinder capacity is filled with data: 33333");
		String actualErrorMessage= vehData.getErrorMessageOnCylinderCapacity();
		String expectederrorMessage = "Must be a number between 1 and 2000";
		Assert.assertEquals(actualErrorMessage, expectederrorMessage, "Error message is not as expected on cylinder capacity field.");
		
	}
	
	@Test (enabled = true)
	public void errorMessage_EnginePerformance() {
		homepage.clickOnMotorCycleLink();
		vehData.enterEnginePerformance("0");
		test.log(Status.PASS, "Engine performance is filled with data: 0");
		String actualErrorMessage= vehData.getErrorMessageOnEngineperformance();
		String expectederrorMessage = "Must be a number between 1 and 2000";
		Assert.assertEquals(actualErrorMessage, expectederrorMessage, "Error message is not as expected on engine performance field.");
		
	}
	
	
	@Test (enabled = true)
	public void verifyModelDropdownOptions() {
		homepage.clickOnMotorCycleLink();
		List<String> actualValues = vehData.getDropdownOption_model();
		test.log(Status.INFO, "Actual dd contents for model dd is: " +actualValues);
		List<String> expectedValues = Arrays.asList("– please select –", "Scooter", "Three-Wheeler", "Moped", "Motorcycle","Cross","Chopper","Enduro");
		test.log(Status.INFO, "Expected dd contents for model dd is: " +expectedValues);
		Assert.assertEquals(actualValues, expectedValues, "Error in Dropdown options compare at Model Dropdown");
	}
	
}