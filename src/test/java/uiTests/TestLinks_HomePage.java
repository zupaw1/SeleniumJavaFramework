package uiTests;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import testBase.TestBase;

public class TestLinks_HomePage extends TestBase {

	@Test
	public void CheckLinksTest() {
		homepage.findLinkandText();
		int suma = homepage.LinksNumber();
		test.log(Status.INFO, "Number of links is "+suma);
		Assert.assertEquals(suma, 32, "Number of links is not correct");

	}

	@Test
	public void ValidateBrokenLinks() {

		String homePage = "http://sampleapp.tricentis.com/101/index.php";
		String url = "";
		HttpURLConnection huc = null;
		int respCode = 200;

		driver.get(homePage);

		List<WebElement> links = driver.findElements(By.tagName("a"));

		Iterator<WebElement> it = links.iterator();

		while (it.hasNext()) {

			url = it.next().getAttribute("href");

			System.out.println(url);

			if (url == null || url.isEmpty()) {
				System.out.println("URL is either not configured for anchor tag or it is empty");
				continue;
			}

			if (!url.startsWith(homePage)) {
				System.out.println("URL belongs to another domain, skipping it.");
				continue;
			}

			try {
				huc = (HttpURLConnection) (new URL(url).openConnection());

				huc.setRequestMethod("HEAD");

				huc.connect();

				respCode = huc.getResponseCode();

				if (respCode >= 400) {
					System.out.println(url + " is a broken link");
				} else {
					System.out.println(url + " is a valid link");
				}

			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		driver.quit();

	}

}