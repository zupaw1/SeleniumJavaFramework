package uiTests;

import java.util.Arrays;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import testBase.TestBase;

public class ImageTest_HomePage extends TestBase {
	
	@Test
	public void CheckImageTest() throws Exception {
		WebElement logo = (WebElement) homepage.getLogo_img;
		 try {
	            boolean imagePresent = (Boolean) ((JavascriptExecutor) driver).executeScript("return (typeof arguments[0].naturalWidth !=\"undefined\" && arguments[0].naturalWidth > 0);", logo);

	            if (!imagePresent) {
	                System.out.println("Image is NOT Displayed");
	            }
	            else {
	                System.out.println("Image is Displayed");
	            }
	        }
	        catch (Exception ex) {
	            System.out.println("Unable to locate Element " + Arrays.toString(ex.getStackTrace()));
	        }
}
}
