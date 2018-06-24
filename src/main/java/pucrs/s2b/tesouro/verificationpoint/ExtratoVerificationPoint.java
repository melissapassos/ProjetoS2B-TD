package pucrs.s2b.tesouro.verificationpoint;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import pucrs.s2b.tesouro.framework.Report;
import pucrs.s2b.tesouro.framework.ScreenShot;

public class ExtratoVerificationPoint {

	private static final String LOGIN_MESSAGE = "Consulting Consolidated Statement.";

	private WebDriver driver;

	public ExtratoVerificationPoint(WebDriver driver) {
		this.driver = driver;
	}

	public void checkValidLoginMessage() {
		if(this.pageContains(LOGIN_MESSAGE)) {
			Report.log(Status.FAIL, "Mensagem de erro foi exibida.", ScreenShot.capture(driver));
		}		
		else {
			Report.log(Status.PASS, "Consultado com sucesso.", ScreenShot.capture(driver));
		}
	}

	private boolean pageContains(String text){
		return this.driver.getPageSource().contains(text);
	}

}