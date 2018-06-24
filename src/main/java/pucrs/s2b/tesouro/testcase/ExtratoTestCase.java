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
import pucrs.s2b.tesouro.verificationpoint.ExtratoVerificationPoint;


public class ExtratoTestCase {
	
	private WebDriver driver;
	
	public ExtratoTasks homePage;
	private ExtratoVerificationPoint verificationPoint;
	
	@Before
	public void setUp() {
		Report.startTest("Logging in to get an extract.");
		driver = Drivers.getChromeDriver();
		
		homePage = new ExtratoTasks(driver);
		verificationPoint = new ExtratoVerificationPoint(driver);
	}
	
	@Test
	public void testMain() throws InterruptedException {
		driver.get("https://tesourodireto.bmfbovespa.com.br/PortalInvestidor/login.aspx");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		Report.log(Status.INFO, "O site iniciou.", ScreenShot.capture(driver));
		
		homePage.login("************", "************");
		
		Thread.sleep(2000);
		
		Report.log(Status.INFO, "Login efetuado com sucesso.", ScreenShot.capture(driver));

		homePage.extrato();
		Report.log(Status.INFO, "Consultando extrato consolidado do mes de Abril de 2018.", ScreenShot.capture(driver));
		
		homePage.logout();
		
		verificationPoint.checkValidLoginMessage();
	}	

	@After
	public void tearDown() {
	driver.quit();
	}
}
