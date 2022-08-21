package utilities;

import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;

public class BaseClass {
	
	public BaseClass() {
		
	}
	
	public static WebDriver driver;
	
	public void openUrl() {
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		 driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			driver.get("https://thesportstak.com/");
	}
	
	public void closeBrowser() {
		driver.quit();
	}
	
	public void clickOnElement(By loc)throws Exception {
		
		WebDriverWait wt = new WebDriverWait(driver,30);
		wt.until(ExpectedConditions.visibilityOfElementLocated(loc)).click();
	}
	
	public void clickOnElement(String loc) throws Exception {
		
		driver.findElement(By.xpath(loc)).click();
	}
	
	public void captureScreenshot(ITestResult result) throws Exception{
		if(ITestResult.FAILURE == result.getStatus()) {
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			
			File source = ts.getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(source,new File("./Screenshots/"+result.getName()+".png"));
			System.out.println(result.getName()+"method()Screenshot Captured");
		}
		
		
			
			
		}
	
	
	}

