package automation_challenge;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Keys;

public class WebDriverMain {
	
	
	public static void main (String[] args){
	
	//Creating a new browser webdriver
	System.setProperty("webdriver.chrome.driver", "./chromedriver.exe"); 
	WebDriver driver;
	
	driver = new ChromeDriver();
	WebDriverWait wait=new WebDriverWait(driver, 20);
	driver.manage().window().fullscreen();

	//Deeping into the Ali express webpage
	
	driver.get("https://best.aliexpress.com/?lan=es");
	
	
	//Searching an iphone on the web
	
	driver.findElement(By.id("search-key")).sendKeys("Iphone");
	driver.findElement(By.id("search-key")).sendKeys(Keys.RETURN);
	//driver.findElement(By.id("search-cate")).click();
	//((WebElement) driver).sendKeys(Keys.RETURN);
	
	
	//if there is and add close it
	

    WebElement add;
	add= wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("next-dialog-close")));
	add.click();
	
    //If there are is a second webpage on the search page on the browser clicking it else giving back a search error

	  ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,15000)");

     WebElement button;
	 button= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[3]/div/div[2]/span[3]/input")));
 	 button.sendKeys("2");
 	 button.sendKeys(Keys.RETURN);
 	 
    
    //driver.find_elements_by_xpath("//*[contains(text(), 'My Button')]")
    
	
	
	//driver.find_elements_by_xpath("//*[contains(text(), 'My Button')]")
	
	
	//searching for the second add result, if there is one click it else giving back an error
	
	
	
	//Going into the result, if there is 1 or more items available test is ok, else test will fail
	
	//driver.close();
	}
	
	
	
	

}
