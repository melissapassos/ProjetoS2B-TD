package pucrs.s2b.tesouro.testcase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import pucrs.s2b.tesouro.framework.Drivers;
import pucrs.s2b.tesouro.framework.Report;
import pucrs.s2b.tesouro.framework.ScreenShot;
import pucrs.s2b.tesouro.tasks.ExtratoTasks;
import pucrs.s2b.tesouro.verificationpoint.LoginErrorVerificationPoint;

public class LoginErrorTestCase {

	private WebDriver driver;

	public ExtratoTasks homePage;
	private LoginErrorVerificationPoint verificationPoint;

	@Before
	public void setUp() {
		Report.startTest("Invalid login.");
		driver = Drivers.getChromeDriver();

		homePage = new ExtratoTasks(driver);
		verificationPoint = new LoginErrorVerificationPoint(driver);
	}

	@Test
	public void testMain() throws InterruptedException {
		driver.get("https://tesourodireto.bmfbovespa.com.br/PortalInvestidor/login.aspx");
		driver.manage().window().maximize();

		Report.log(Status.INFO, "O site iniciou.", ScreenShot.capture(driver));

		Thread.sleep(2000);

		homePage.login("*********", "livroroxo27#@");

		Thread.sleep(2000);
		
		Report.log(Status.INFO, "Aviso de Login incorreto.", ScreenShot.capture(driver));
		
		verificationPoint.checkLoginFieldErrorMessage();

	}

	@After
	public void tearDown() throws InterruptedException {

		Thread.sleep(2000);

		driver.quit();
	}
}