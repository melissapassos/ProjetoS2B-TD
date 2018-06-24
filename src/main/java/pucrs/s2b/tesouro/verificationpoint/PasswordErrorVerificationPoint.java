package pucrs.s2b.tesouro.verificationpoint;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import pucrs.s2b.tesouro.framework.Report;
import pucrs.s2b.tesouro.framework.ScreenShot;

public class PasswordErrorVerificationPoint {
	
	private static final String PASSWORD_ERROR_MESSAGE = "Usuario/Senha Invalido";
	
	private WebDriver driver;
	
	public PasswordErrorVerificationPoint(WebDriver driver) {
		this.driver = driver;
	}
	
	public void checkLoginFieldErrorMessage() {
		if(this.pageContains(PASSWORD_ERROR_MESSAGE)) {
			Report.log(Status.PASS, "Mensagem de senha invalida exibida corretamente.", ScreenShot.capture(driver));
		}		
		else {
			Report.log(Status.FAIL, "A mensagem de erro não foi exibida corretamente.", ScreenShot.capture(driver));
		}
	}

	private boolean pageContains(String text){
		return this.driver.getPageSource().contains(text);
	}
	
}