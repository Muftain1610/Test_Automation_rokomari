package pages;

import org.openqa.selenium.By;

public class CartPage extends Basepage {
	
	public By PLACE_ORDER_BUTTON = By.xpath("//span[normalize-space()='Place Order']");
	
	
	public void clickPlaceOrderButton() {	
        clickOnElement(PLACE_ORDER_BUTTON);		
	}
	
}
