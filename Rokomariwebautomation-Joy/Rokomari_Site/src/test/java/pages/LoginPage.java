package pages;

import org.openqa.selenium.By;

public class LoginPage extends Basepage {
	
	
	public String LOGIN_PAGE_URL = "https://www.rokomari.com/login";
	public By SIGNIN_BUTTON_FIELD = By.xpath("//a[normalize-space()='Sign in']");
	public By EMAIL_INPUT_FIELD = By.xpath("//input[@id='j_username']");
	public By PASSWORD_INPUT_FIELD = By.xpath("//input[@id='j_password']");
	public By SIGNIN_BUTTON = By.xpath("//button[normalize-space()='Sign In']");
	
	
	public void doLogin(String email, String password) {
		getdriver().get(LOGIN_PAGE_URL);
		writeTextOnElement(EMAIL_INPUT_FIELD, email);
		writeTextOnElement(PASSWORD_INPUT_FIELD, password);
//		clickOnElement(SIGNIN_BUTTON);
	}
	
	public void clickLogin() {
		clickOnElement(SIGNIN_BUTTON);	
	}

}
