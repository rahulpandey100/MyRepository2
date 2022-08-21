package test;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.WebStory;
import utilities.BaseClass;

public class WebStoryTestClass {
	
	public WebStoryTestClass() {
		
		base = new BaseClass();
		ws = new WebStory();
	}
	
	BaseClass base;
	WebStory ws;
	
	@BeforeTest
	public void openBrowser() throws Exception {
		base.openUrl();
	}
	
	@Test(priority=1)
	public void verifyThatUserCanClickOnWebStoryLink() throws Exception {
		
		ws.clickOnWebStoryLink();
	}
	
	@Test(priority=2)
	public void verifyThatUserCanClickOnDisplayedWebStory() throws Exception {
		ws.clickOnDisplayedWebStory();
	}
	
	@Test(priority=3)
	public void getFirstPageOfStoryHeadingAndBody() throws Exception {
		
		ws.getFirstPageOfStoryHeadingAndBody();
	}
	
	@Test(priority=4)
	public void getSecondPageOfStoryHeadingAndBody() throws Exception {
		ws.getSecondPageOfStoryHeadingAndBody();
	}
	
	@Test(priority=5)
	public void getThirdPageOfStoryHeadingAndBody() throws Exception {
		ws.getThirdPageOfStoryHeadingAndBody();
	}
	
	@Test(priority=6)
	public void getFourthPageOfStoryHeadingAndBody() throws Exception {
		ws.getFourthPageOfStoryHeadingAndBody();
	}
	
	@Test(priority=7)
	public void getFifthPageOfStoryHeadingAndBody() throws Exception {
		ws.getFifthPageOfStoryHeadingAndBody();
	}
	
	@Test(priority=8)
	public void getSixthPageOfStoryHeadingAndBody() throws Exception {
		ws.getSixthPageOfStoryHeadingAndBody();
	}
	
	@Test(priority=9)
	public void getSeventhPageOfStoryHeadingAndBody() throws Exception {
		ws.getSeventhPageOfStoryHeadingAndBody();
	}
	
	@Test(priority=10)
	public void getEightPageOfStoryHeadingAndBody() throws Exception {
		ws.getEightPageOfStoryHeadingAndBody();
	}
	
	@Test(priority=11)
	public void getNinthPageOfStoryHeadingAndBody() throws Exception {
		ws.getNinthPageOfStoryHeadingAndBody();
	}
	
	@Test(priority=12)
	public void closeBrowserWindow() {
		ws.closeBrowserWindow();
	}
	
	@Test(priority=13)
	public void verifyThatUserCanClickOnNextWebStory() throws Exception {
		ws.clickOnNextWebStory();
	}
	
	@Test(priority=14)
	public void verifyThatUserCanReturnOnHomePage() throws Exception {
		ws.returnOnHomePage();
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
