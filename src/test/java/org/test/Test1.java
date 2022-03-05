package org.test;

import org.base.BaseClass;
import org.loctr.Locators;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test1 extends  BaseClass{
	
	@BeforeClass
	private void lanchBrowser() {
		browser("Chrome");
	}
	
	@Test(dataProvider="invalidId")
	private void tc1(String mail,String pass)  {
		lanchUrl("https://www.facebook.com/");
		Locators l=new Locators();
		textclear(l.getEmailBox());
		textclear(l.getPasswordBox());
		entertext(l.getEmailBox(), mail);
		entertext(l.getPasswordBox(), pass);
		clickbutton(l.getPassEye());
		clickbutton(l.getLoginButton());	
		
	}
	
	@DataProvider(name="invalidId")
	private Object[][] data() {
		return new Object[][] {
			{"Ruban","Ruban1234"},
//			{"Rajendran","Rajendran12345"},
//			{"Rajesh","Rajesh12345"},
//			{"Rakshee","Rakshee12345"}
		};
	}
	
	@AfterClass
	private void closeTheDriver() {
		end();
	}
	
	
	

}
