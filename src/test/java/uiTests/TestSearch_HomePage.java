package uiTests;

import testBase.TestBase;

import java.util.Iterator;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;


public class TestSearch_HomePage extends TestBase {
	
	@Test
	public void SearchFieldTest()
	{
		homepage.clickOnSearchField();
		homepage.enterSearchData("motor");
		
	    
	    String MainWindow = driver.getWindowHandle();
	    System.out.println("Main window handle is " + MainWindow);

	    // To handle all new opened window
	    Set<String> s1 = driver.getWindowHandles();
	    System.out.println("Child window handle is" + s1);
	    Iterator<String> i1 = s1.iterator();

	    // Here we will check if child window has other child windows and when child window
	    //is the main window it will come out of loop.
	      while (i1.hasNext()) {
	          String ChildWindow = i1.next();
	          if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
	              driver.switchTo().window(ChildWindow);
	              System.out.println(driver.getTitle());
	              test.log(Status.INFO, "Title of the page is"+driver.getTitle());
	              System.out.println(driver.getCurrentUrl());
	              Assert.assertEquals(driver.getTitle(), "Tricentis Support Hub - Home - Tricentis Support", "Page title is not as expected");
	              Assert.assertEquals(driver.getCurrentUrl(), "https://support-hub.tricentis.com/open", "Url is not as expected");
	              driver.close();
	              System.out.println("Child window closed");
	           }
	}

}
}
