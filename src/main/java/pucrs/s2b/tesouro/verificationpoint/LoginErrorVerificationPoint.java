package pucrs.s2b.tesouro.verificationpoint;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import pucrs.s2b.tesouro.framework.Report;
import pucrs.s2b.tesouro.framework.ScreenShot;

public class LoginErrorVerificationPoint {
	
	private static final String LOGIN_ERROR_MESSAGE = "The login you entered is incorrect.";
	
	private WebDriver driver;
	
	public LoginErrorVerificationPoint(WebDriver driver) {
		this.driver = driver;
	}
	
	public void checkLoginFieldErrorMessage() {
		if(this.pageContains(LOGIN_ERROR_MESSAGE)) {
			Report.log(Status.FAIL, "Mensagem de login invalido nao foi exibida corretamente.", ScreenShot.capture(driver));
		}
		
		else {
			Report.log(Status.PASS, "Mensagem de login invalido foi exibida corretamente.", ScreenShot.capture(driver));
		}
	}

	private boolean pageContains(String text){
		return this.driver.getPageSource().contains(text);
	}
}