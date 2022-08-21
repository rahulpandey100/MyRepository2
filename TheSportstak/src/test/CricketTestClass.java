package test;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Cricket;
import utilities.BaseClass;

public class CricketTestClass {
	
	public CricketTestClass() {
		
		base = new BaseClass();
		cric = new Cricket();
	}
	
	BaseClass base;
	Cricket cric;
	
	@BeforeTest
	public void openBrowser() throws Exception {
		base.openUrl();
	}
	
	@Test(priority=1)
	public void verifyThatTheUserCanClickOnCricketTab() throws Exception {
		cric.clickOnCricketTab();
	}
	
	@Test(priority=2)
	public void verifyThatUserCanScrollToThirdPage() throws Exception {
		cric.scrollToThirdPage();
	}
	
	@Test(priority=3)
	public void verifyUserCanChangeTheTheme() throws Exception {
		cric.changeTheTheme();
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
