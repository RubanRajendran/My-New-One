package org.test;

import org.base.BaseClass;
import org.loctr.Locators;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test3 extends BaseClass {
	@BeforeClass
	private void lanchBrowser() {
		browser("");
	}
	
	@Test(dataProvider="invalidId")
	private void tc1(String mail,String pass)  {
		lanchUrl("https://www.facebook.com/");
		Locators ll=new Locators();
		textclear(ll.getEmailBox());
		textclear(ll.getPasswordBox());
		entertext(ll.getEmailBox(), mail);
		entertext(ll.getPasswordBox(), pass);
		clickbutton(ll.getPassEye());
		clickbutton(ll.getLoginButton());	
		
	}
	
	
	@DataProvider(name="invalidId")
	private Object[][] data() {
		return new Object[][] {
			{"Ruban","Ruban1234"},
			{"Rajendran","Rajendran12345"},
			{"Rajesh","Rajesh12345"},
			{"Rakshee","Rakshee12345"}
		};
	}
	
	@AfterClass
	private void closeTheDriver() {
		end();
	}

}
