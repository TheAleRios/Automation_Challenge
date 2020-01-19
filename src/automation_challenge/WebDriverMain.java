package automation_challenge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebDriverMain {
	
	
	public static void main (String[] args){
	
	//Creating a new browser webdriver
	System.setProperty("webdriver.chrome.driver", "./chromedriver.exe"); 
	WebDriver driver;
	
	driver = new ChromeDriver();
	

	//Deeping into the Ali express webpage
	
	driver.get("https://best.aliexpress.com/?lan=es");
	
	
	//Searching an iphone on the web
	
	
	
	//If there are is a second webpage on the search page on the browser clicking it else giving back a search error
	
	
	
	//searching for the second add result, if there is one click it else giving back an error
	
	
	
	//Going into the result, if there is 1 or more items available test is ok, else test will fail
	
	
	}
	
	
	
	

}
