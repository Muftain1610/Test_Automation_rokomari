package testcases;

import org.testng.annotations.Test;

import io.qameta.allure.Description;
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
	
	@Test (description = "TestallPages")
	@Description("TestallPages from Allure")
	
	 public void TestallPages() throws InterruptedException {
		
		homePage.clickHomePage();
		loginPage.doLogin("muftainahmedjoy1849@gmail.com", "Joy16@10#");
		loginPage.clickLogin();
		loginPage.takeScreenShot("Login Successfully");
		
		homePage.clickAuthors();
		
		homePage.clickHumayunAhmed();
		cartPage.takeScreenShot("Click Humayun Ahmed Page");
		
		humayunAhmedPage.clickFirstCheckBox();
		humayunAhmedPage.clickThirdCheckBox();
		humayunAhmedPage.clickNextPage();
		
		humayunAhmedNextPage.clickBookHover();
		humayunAhmedNextPage.clickBook();
		humayunAhmedNextPage.takeScreenShot("Add to card");
		
		humayunAhmedNextPage.clickCartIcon();
		
		cartPage.clickPlaceOrderButton();
		cartPage.takeScreenShot("Click Place Order");
		
		shippingPage.personalinfo();
	
	}
}
