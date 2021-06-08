package com.cyient.test;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cyient.page.LoginPage;

//we will delete it
public class DemoTest {

	// bala,bala123 --> 1 test case
	// john,john123 --> 2 test case
	// peter,peter123 --> 3 test case
	

	@DataProvider
	public Object[][] validData() {
		Object[][] main = new Object[3][2];
		// i-->number of testdata/testcase
		// j-->number of parameter

		main[0][0] = "bala";
		main[0][1] = "bala123";

		main[1][0] = "john";
		main[1][1] = "john123";

		main[2][0] = "peter";
		main[2][1] = "peter123";
	
		return main;
	}

	@Test(dataProvider = "validData")
	public void validTest(String username, String password) {
		System.out.println("Test Run" + username + password);
	}
	
//	  @DataProvider
//      public Object[][] validData()
//      {
//              Object[][] main= new Object[2][4];
//              main[0][0]="admin";
//              main[0][1]="pass";
//              main[0][2]="English (Indian)";
//              main[0][3]="Open EMR";
//              return main;
//      }
//
//      @Test(dataProvider = "validCredentialTest")
//      public void validCredentialTest(String username,String password,String lang,String espectedValue) {
//              LoginPage page = new LoginPage(driver);
//              page.sendUsername(username);
//              page.sendPassword(password);
//              page.selectLanguage(lang);
//              page.selectLogin();
//              DashBoardPage dashboard = new DashBoardPage(driver);
//              System.out.println(dashboard.getDashBoardPageTitle());
//
//              Assert.assertEquals(dashboard.getDashBoardPageTitle(), espectedValue);
//
//      }

}
