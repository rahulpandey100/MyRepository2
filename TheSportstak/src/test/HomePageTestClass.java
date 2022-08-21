package test;

import java.io.IOException;
import java.net.MalformedURLException;


import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import utilities.BaseClass;

public class HomePageTestClass {
	
	public HomePageTestClass() {
		
		base = new BaseClass();
		homePage = new HomePage();
	}
	BaseClass base;
	HomePage homePage;
	
	
	
	@BeforeTest
	public void openBrowser() throws Exception {
		base.openUrl();
	}
	
	
	
	@Test(priority=1)
	public void verifyLanguageCanBeSelected() throws Exception {
		
		homePage.selectLanguage();
		
	}
	
	@Test(priority=2)
	public void checkForBrokenUrl() throws MalformedURLException, IOException {
		
		homePage.listOfLinks();
	}
	
	@AfterMethod
	public void takeScreenshotOnFailure(ITestResult result) throws Exception {
		base.captureScreenshot(result);
	}
	
	@AfterTest
	public void closeBrowser() {
		base.closeBrowser();
	}
	
	
}
