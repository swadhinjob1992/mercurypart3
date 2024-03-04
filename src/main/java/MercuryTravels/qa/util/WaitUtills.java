package MercuryTravels.qa.util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import MercuryTravels.qa.base.TestBase;

public class WaitUtills extends TestBase{
	public static WebDriverWait wait;

	public WaitUtills(){
		PageFactory.initElements(driver, this);
	}
	
    public static void WaitUntillElementVisible(WebElement element,int time) {
    	wait = new WebDriverWait(driver, time);
    	wait.until(ExpectedConditions.elementToBeClickable(element)).click();    	
    }
    
    public static void WaitUntillTitleVisible(String expectedTitle) {
    	wait = new WebDriverWait(driver, 15);
    	wait.until(ExpectedConditions.titleContains(expectedTitle));    	
    }
}
