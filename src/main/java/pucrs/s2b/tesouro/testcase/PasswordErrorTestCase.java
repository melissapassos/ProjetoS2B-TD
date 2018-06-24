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

import pucrs.s2b.tesouro.verificationpoint.PasswordErrorVerificationPoint;

public class PasswordErrorTestCase {

	private WebDriver driver;

	public ExtratoTasks homePage;
	private PasswordErrorVerificationPoint verificationPoint;

	@Before
	public void setUp() {
		Report.startTest("Invalid password.");
		driver = Drivers.getChromeDriver();

		homePage = new ExtratoTasks(driver);		
		verificationPoint = new PasswordErrorVerificationPoint(driver);
	}

	@Test
	public void testMain() throws InterruptedException {
		driver.get("https://tesourodireto.bmfbovespa.com.br/PortalInvestidor/login.aspx");
		driver.manage().window().maximize();

		Report.log(Status.INFO, "O site foi iniciado.", ScreenShot.capture(driver));

		Thread.sleep(2000);

		homePage.login("***********", "abc123@");

		Thread.sleep(2000);
		
		Report.log(Status.INFO, "Aviso de senha incorreta.", ScreenShot.capture(driver));
		
		verificationPoint.checkLoginFieldErrorMessage();
	}

	@After
	public void tearDown() throws InterruptedException {

		Thread.sleep(2000);

		driver.quit();
	}
}