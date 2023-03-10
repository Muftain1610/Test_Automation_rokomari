package testcases;

import org.testng.annotations.Test;

import pages.CartPage;
import pages.HomePage;
import pages.HumayunAhmedNextPage;
import pages.HumayunAhmedPage;
import pages.LoginPage;
import pages.ShippingPage;
import utilities.DriverSetUp;

public class TestPages extends DriverSetUp {
	
	
	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();
	HumayunAhmedPage humayunAhmedPage = new HumayunAhmedPage();
	HumayunAhmedNextPage humayunAhmedNextPage = new HumayunAhmedNextPage();
	CartPage cartPage = new CartPage();
	ShippingPage shippingPage = new ShippingPage();
	
	@Test
	 public void TestallPages() {
		
		loginPage.doLogin("muftainahmedjoy1849@gmail.com", "Joy16@10#");
		loginPage.clickLogin();

		
		homePage.clickPopUpmessage();
		homePage.clickAuthors();
		homePage.clickHumayunAhmed();
		humayunAhmedPage.clickPopUpmessage();
		
		humayunAhmedPage.clickCheckBoxes();
		humayunAhmedPage.clickNextbutton();

		humayunAhmedNextPage.clickPopUpmessage();
		humayunAhmedNextPage.clickBookhover();
		humayunAhmedNextPage.clickAddtocart();
		humayunAhmedNextPage.clickCarticon();
		cartPage.clickPlaceOrderButton();
		shippingPage.doLogin("1627914912");
		shippingPage.clickSendPin();
		
	}

}
