package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.IndexPage;

public class IndexPageTest extends BaseClass {
	private IndexPage indexPage = new IndexPage();
	
	String browser = "Chrome";
	
	@BeforeMethod
	public void setup() {
		launchApp("Chrome");
	}
	
	@AfterMethod
	public void tearDown() {
		getDriver().quit();
	}
	
	@Test
	public void verifyTitle() {
		String actTitle=indexPage.getMyStoreTitle();
		Assert.assertEquals(actTitle, "My Store");
	}
}
