package pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import utilities.BaseClass;

public class WebStory extends BaseClass {

	By webStoryLink = By.xpath("//a[text()='Web Story']");
	By selectWebStory1 = By.xpath("//body/div[@id='__next']/div[@class='root']/main/div[@class='content']/div[@class='webstory-component-container']/div[@class='newsVideo-section']/div[@class='webstories-container']/div[@class='webstories-cards']/a[6]/section[1]/div[1]/div[1]");
	By textHeading1 = By.xpath("//h1[@class='ibzct pa ibzct-a']");
	By textBody1 = By.xpath("//p[@class='amlqi pa amlqi-a']");
	By textHeading2 = By.xpath("//h1[@class='pgump pa pgump-a']");
	By textBody2 = By.xpath("//p[@class='bjuqf pa bjuqf-a']");
	By textHeading3 = By.xpath("//h1[@class='iizwq pa iizwq-a']");
	By textBody3 = By.xpath("//p[@class='xqxzt pa xqxzt-a']");
	By textHeading4 = By.xpath("//h1[@class='eeuns pa eeuns-a']");
	By textBody4 = By.xpath("//p[@class='bszbl pa bszbl-a']");
	By textHeading5 = By.xpath("//h1[@class='cxazl pa cxazl-a']");
	By textBody5 = By.xpath("//p[@class='srqgf pa srqgf-a']");
	By textHeading6 = By.xpath("//h1[@class='krgcx pa krgcx-a']");
	By textBody6 = By.xpath("//p[@class='bqlkx pa bqlkx-a']");
	By textHeading7 = By.xpath("//h1[@class='juejo pa juejo-a']");
	By textBody7 = By.xpath("//p[@class='jtacq pa jtacq-a']");
	By textHeading8 = By.xpath("//h1[@class='kdwpj pa kdwpj-a']");
	By textBody8 = By.xpath("//p[@class='etbns pa etbns-a']");
	By textHeading9 = By.xpath("//h1[@class='njgxa pa njgxa-a']");
	By textBody9 = By.xpath("//p[@class='tbwmf pa tbwmf-a']");
	By forwardArrow = By
			.xpath("//div[@class='i-amphtml-story-button-container i-amphtml-story-fwd-next next-container']");
	
	By selectWebStory2 = By.xpath("(//div[@class='card__face card__face--front'])[2]");
	By homePageLink = By.xpath("//a[text()='Home']");
	By homePageTab = By.xpath("//span[text()='Home']");

	public WebStory() {

	}

	public void clickOnWebStoryLink() throws Exception {

		clickOnElement(webStoryLink);
		
		
	}

	public void clickOnDisplayedWebStory() throws Exception {
		clickOnElement(selectWebStory1);
		
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(1));
		

	}

	public void getFirstPageOfStoryHeadingAndBody() throws Exception {

		driver.findElement(textHeading1).getText();
		driver.findElement(textBody1).getText();
		clickOnElement(forwardArrow);
	}

	public void getSecondPageOfStoryHeadingAndBody() throws Exception {

		driver.findElement(textHeading2).getText();
		driver.findElement(textBody2).getText();
		clickOnElement(forwardArrow);
	}

	public void getThirdPageOfStoryHeadingAndBody() throws Exception {
		driver.findElement(textHeading3).getText();
		driver.findElement(textBody3).getText();
		clickOnElement(forwardArrow);

	}

	public void getFourthPageOfStoryHeadingAndBody() throws Exception {

		driver.findElement(textHeading4).getText();
		driver.findElement(textBody4).getText();
		clickOnElement(forwardArrow);
	}

	public void getFifthPageOfStoryHeadingAndBody() throws Exception {

		driver.findElement(textHeading5).getText();
		driver.findElement(textBody5).getText();
		clickOnElement(forwardArrow);
	}

	public void getSixthPageOfStoryHeadingAndBody() throws Exception {
		driver.findElement(textHeading6).getText();
		driver.findElement(textBody6).getText();
		clickOnElement(forwardArrow);

	}

	public void getSeventhPageOfStoryHeadingAndBody() throws Exception {

		driver.findElement(textHeading7).getText();
		driver.findElement(textBody7).getText();
		clickOnElement(forwardArrow);
		clickOnElement(forwardArrow);

	}

	public void getEightPageOfStoryHeadingAndBody() throws Exception {

		driver.findElement(textHeading8).getText();
		driver.findElement(textBody8).getText();
		clickOnElement(forwardArrow);
	}

	public void getNinthPageOfStoryHeadingAndBody() throws Exception {

		driver.findElement(textHeading9).getText();
		driver.findElement(textBody9).getText();
		clickOnElement(forwardArrow);
	}

	public void closeBrowserWindow() {

		driver.close();
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		 driver.switchTo().window(tabs2.get(0));
		
	}
	
	public void clickOnNextWebStory() throws Exception {
		
		clickOnElement(selectWebStory2);
		
	}
	
	public void returnOnHomePage() throws Exception {
		
		clickOnElement(homePageLink);
		clickOnElement(homePageTab);
		
	}

}
