package pucrs.s2b.tesouro.testcase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import pucrs.s2b.tesouro.framework.Drivers;
import pucrs.s2b.tesouro.framework.Report;
import pucrs.s2b.tesouro.framework.ScreenShot;
import pucrs.s2b.tesouro.tasks.RedemptionTasks;
import pucrs.s2b.tesouro.verificationpoint.RedemptionVerificationPoint;

public class RedemptionTestCase {

	private WebDriver driver;

	public RedemptionTasks homePage;
	private RedemptionVerificationPoint verificationPoint;

	@Before
	public void setUp() {
		Report.startTest("Accessing the Investment Redemption Option.");
		driver = Drivers.getChromeDriver();

		homePage = new RedemptionTasks(driver);
		verificationPoint = new RedemptionVerificationPoint(driver);
	}

	@Test
	public void testMain() throws InterruptedException {
		driver.get("https://tesourodireto.bmfbovespa.com.br/PortalInvestidor/login.aspx");
		driver.manage().window().maximize();

		Thread.sleep(1000);
		Report.log(Status.INFO, "O site foi iniciado.", ScreenShot.capture(driver));

		homePage.login("***********", "livroroxo27#@");

		Report.log(Status.INFO, "Login feito com sucesso.", ScreenShot.capture(driver));

		homePage.rescue();

		Report.log(Status.INFO, "Testando opcao de Agendamento de Resgate!", ScreenShot.capture(driver));

		homePage.instituicao();

		Report.log(Status.INFO, "Escolhendo a Instituicao Financeira.", ScreenShot.capture(driver));

		homePage.cancelar();

		Report.log(Status.INFO, "Dado erro ao selecionar Insituicao Financeira, tentando cancelar operacao.", ScreenShot.capture(driver));

		homePage.cancela();
		
		Report.log(Status.INFO, "Botao Cancelar nao funciona.", ScreenShot.capture(driver));

		homePage.inicio();

		Report.log(Status.INFO, "Encerrando sessao.", ScreenShot.capture(driver));

		homePage.logout();

		verificationPoint.checkRescueMessage();
	}

	@After
	public void tearDown() {
		driver.quit();
	}
}