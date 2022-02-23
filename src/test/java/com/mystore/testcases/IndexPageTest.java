package com.mystore.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.mystore.base.BaseClass;
import com.mystore.managers.PageObjectManager;
import com.mystore.pageobjects.IndexPage;
import com.mystore.utility.Log;

public class IndexPageTest extends BaseClass {
	
	PageObjectManager pom;
	
	@Parameters("browser")
	@BeforeMethod
	public void setup(String browser) {
		launchApp(browser);
		pom = new PageObjectManager(getDriver());
	}
	
	@AfterMethod
	public void tearDown() {
		getDriver().quit();
	}
	
	@Test(priority=1)
	public void verifyTitle() {
		Log.startTestCase("verifyTitle");
		String actTitle=pom.getIndexPage().getMyStoreTitle();
		Assert.assertEquals(actTitle, "My Store");
	}
	
	@Test(priority=2)
	public void verifyLogo() {
		Log.startTestCase("verifyLogo");
		Boolean value = pom.getIndexPage().validateLogo();
		Assert.assertTrue(value);
	}
	
	@Test(priority=3)
	public void clickSignInBtn() {
		Log.startTestCase("clickSignInBtn");
		pom.getIndexPage().clickOnSignIn();
		System.out.println("Before: " + pom.getLoginPage().getLoginPageTitle());
		Assert.assertEquals(pom.getLoginPage().getLoginPageTitle(), "Login - My Store");
		System.out.println("After: " + pom.getLoginPage().getLoginPageTitle());
	}
}
