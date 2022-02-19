package com.mystore.actiondriver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.mystore.actioninterface.ActionInterface;
import com.mystore.base.BaseClass;

public class Action extends BaseClass implements ActionInterface {

	public void scrollByVisibilityOfElement(WebDriver driver, WebElement ele) {
		// TODO Auto-generated method stub
		
	}

	public void click(WebDriver driver, WebElement ele) {
		Actions act = new Actions(driver);
		act.moveToElement(ele).click().build().perform();
	}

	public boolean isDisplayed(WebDriver ldriver, WebElement ele) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean type(WebElement ele, String text) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean findElement(WebDriver ldriver, WebElement ele) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isSelected(WebDriver ldriver, WebElement ele) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isEnabled(WebDriver ldriver, WebElement ele) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean selectBySendkeys(String value, WebElement ele) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean selectByIndex(WebElement element, int index) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean selectByValue(WebElement element, String value) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean selectByVisibleText(String visibletext, WebElement ele) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean mouseHoverByJavaScript(WebElement locator) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean JSClick(WebDriver driver, WebElement ele) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean switchToFrameByIndex(WebDriver driver, int index) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean switchToFrameById(WebDriver driver, String idValue) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean switchToFrameByName(WebDriver driver, String nameValue) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean switchToDefaultFrame(WebDriver driver) {
		// TODO Auto-generated method stub
		return false;
	}

	public void mouseOverElement(WebDriver driver, WebElement element) {
		// TODO Auto-generated method stub
		
	}

	public boolean moveToElement(WebDriver driver, WebElement ele) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean mouseover(WebDriver driver, WebElement ele) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean draggable(WebDriver driver, WebElement source, int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean draganddrop(WebDriver driver, WebElement source, WebElement target) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean slider(WebDriver driver, WebElement ele, int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean rightclick(WebDriver driver, WebElement ele) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean switchWindowByTitle(WebDriver driver, String windowTitle, int count) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean switchToNewWindow(WebDriver driver) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean switchToOldWindow(WebDriver driver) {
		// TODO Auto-generated method stub
		return false;
	}

	public int getColumncount(WebElement row) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getRowCount(WebElement table) {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean Alert(WebDriver driver) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean launchUrl(WebDriver driver, String url) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isAlertPresent(WebDriver driver) {
		// TODO Auto-generated method stub
		return false;
	}

	public String getCurrentURL(WebDriver driver) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getTitle(WebDriver driver) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean click1(WebElement locator, String locatorName) {
		// TODO Auto-generated method stub
		return false;
	}

	public void fluentWait(WebDriver driver, WebElement element, int timeOut) {
		Wait<WebDriver> wait = null;
	    try {
	        wait = new FluentWait<WebDriver>((WebDriver) driver)
	        		.withTimeout(Duration.ofSeconds(20))
	        	    .pollingEvery(Duration.ofSeconds(2))
	        	    .ignoring(Exception.class);
	        wait.until(ExpectedConditions.visibilityOf(element));
	        element.click();
	    }catch(Exception e) {
	    }
	}

	public void implicitWait(WebDriver driver, int timeOut) {
		// TODO Auto-generated method stub
		
	}

	public void explicitWait(WebDriver driver, WebElement element, int timeOut) {
		// TODO Auto-generated method stub
		
	}

	public void pageLoadTimeOut(WebDriver driver, int timeOut) {
		// TODO Auto-generated method stub
		
	}

	public String screenShot(WebDriver driver, String filename) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getCurrentTime() {
		// TODO Auto-generated method stub
		return null;
	}

}
