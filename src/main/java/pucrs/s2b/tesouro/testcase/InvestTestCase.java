package pucrs.s2b.tesouro.testcase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import pucrs.s2b.tesouro.framework.Drivers;
import pucrs.s2b.tesouro.framework.Report;
import pucrs.s2b.tesouro.framework.ScreenShot;
import pucrs.s2b.tesouro.tasks.InvestTasks;
import pucrs.s2b.tesouro.verificationpoint.InvestVerificationPoint;

public class InvestTestCase {
	
	private WebDriver driver;
	
	public InvestTasks homePage;
	private InvestVerificationPoint verificationPoint;
	
	@Before
	public void setUp() {
		Report.startTest("Option to invest are valid.");
		driver = Drivers.getChromeDriver();
		
		homePage = new InvestTasks(driver);
		verificationPoint = new InvestVerificationPoint(driver);
	}
	
	@Test
	public void testMain() throws InterruptedException {
		driver.get("https://tesourodireto.bmfbovespa.com.br/PortalInvestidor/login.aspx");
		driver.manage().window().maximize();

		Report.log(Status.INFO, "O site iniciou.", ScreenShot.capture(driver));

		homePage.login("************", "***********");
		
		homePage.invest();
		
		Report.log(Status.INFO, "Selecionando opcao investir.", ScreenShot.capture(driver));

		Thread.sleep(2000);
		
		verificationPoint.checkValidInvestMessage();

	}

	@After
	public void tearDown() {
		driver.quit();
	}
}