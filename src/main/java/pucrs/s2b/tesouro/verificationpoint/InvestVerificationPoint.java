package pucrs.s2b.tesouro.verificationpoint;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import pucrs.s2b.tesouro.framework.Report;
import pucrs.s2b.tesouro.framework.ScreenShot;

public class InvestVerificationPoint {

	private static final String INVEST_MESSAGE = "Option to invest successfully.";

	private WebDriver driver;

	public InvestVerificationPoint(WebDriver driver) {
		this.driver = driver;
	}

	public void checkValidInvestMessage() {
		if(this.pageContains(INVEST_MESSAGE)) {
			Report.log(Status.FAIL, "Mensagem de erro nao foi exibida.", ScreenShot.capture(driver));
		} 
		
		else {
			Report.log(Status.PASS, "Mensagem de erro exibida corretamente.", ScreenShot.capture(driver));
		}
	}

	private boolean pageContains(String text){
		return this.driver.getPageSource().contains(text);
	}

}