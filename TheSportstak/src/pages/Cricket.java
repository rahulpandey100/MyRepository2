package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.BaseClass;

public class Cricket extends BaseClass {
	
	By cricketTab = By.xpath("(//*[text()='Cricket'])[1]");
	By thirdPageLink = By.xpath("(//h2[@class='MuiTypography-root text-sports DetailsCardSide-tittle MuiTypography-body1'])[3]");
	By changeTheme = By.xpath("(//span[@class='MuiButton-label'])[1]");
	public Cricket() {
		
		
	}
	
	public void clickOnCricketTab() throws Exception {
		
		clickOnElement(cricketTab);
	}
	
	public void scrollToThirdPage() throws Exception {
		
		WebElement l=driver.findElement(thirdPageLink);
		Actions tp = new Actions(driver);
		
		tp.moveToElement(l).build().perform();
		clickOnElement(thirdPageLink);
	}
	
	public void changeTheTheme() throws Exception {
		
		clickOnElement(changeTheme);
	}
	
	

}
