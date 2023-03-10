package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class ShippingPage extends Basepage {
	
	public String SHIPPING_PAGE_URL = "https://www.rokomari.com/shipping?isgift=0";
	public By PHONE_NUMBER_FIELD = By.xpath("//input[@id='phone-number']");
	public By SEND_PIN_FIELD = By.xpath("//input[@id='send-otp']");


	public void doLogin(String phonenumber) {
		writeTextOnElement(PHONE_NUMBER_FIELD, phonenumber);
		clickOnElement(PHONE_NUMBER_FIELD);
	}
	
	public void clickSendPin() {
		Actions action = new Actions(getdriver());
		action.moveToElement(getElement(SEND_PIN_FIELD)).build().perform();
		clickOnElement(SEND_PIN_FIELD);
	}

}
