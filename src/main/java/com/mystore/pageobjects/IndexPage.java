package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class IndexPage extends BaseClass {
	
	Action action= new Action();
	
	@FindBy(xpath = "//a[@class='login']")
	private WebElement signInBtn;
	
	public IndexPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public LoginPage clickOnSignIn() {
		action.fluentWait(getDriver(), signInBtn, 10);
		action.click(getDriver(), signInBtn);
		return new LoginPage();
	}
	
	public String getMyStoreTitle() {
		System.out.println(getDriver().getTitle());
		String myStoreTitel=getDriver().getTitle();
		return myStoreTitel;
	}

}
