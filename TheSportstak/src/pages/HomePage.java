package pages;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import test.HomePageTestClass;
import utilities.BaseClass;

public class HomePage extends BaseClass {
	
	
	By selectLanguage = By.xpath("//span[@class='MuiButton-startIcon MuiButton-iconSizeSmall']");
	public HomePage() {
		
		
	}
	
	
	
	public void selectLanguage() throws Exception {
		clickOnElement(selectLanguage);
		
	}
	
	//get The List Of All The Links
	
	public void listOfLinks() throws MalformedURLException, IOException {
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println("Total links are ="+list.size());
		
		List<WebElement> activeList = new ArrayList<WebElement>();
		
		for(int i=0;i<list.size();i++) {
			
			if(list.get(i).getAttribute("href")!=null) {
				activeList.add(list.get(i));
				
			}
			
			System.out.println("Size of Active Links ="+activeList.size());
			
			for(int j=0;j<activeList.size();j++) {
				
				HttpURLConnection connection = (HttpURLConnection) new URL(activeList.get(j).getAttribute("href")).openConnection();
				connection.connect();
				String response = connection.getResponseMessage();
				connection.disconnect();
				System.out.println(activeList.get(j).getAttribute("href")+" "+response);
			}
		}
		
		
	}
	
	
	

	

}
