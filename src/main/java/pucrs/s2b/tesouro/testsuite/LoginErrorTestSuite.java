package pucrs.s2b.tesouro.testsuite;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import pucrs.s2b.tesouro.framework.Report;
import pucrs.s2b.tesouro.testcase.LoginErrorTestCase;

@RunWith(Suite.class)
@SuiteClasses({
	LoginErrorTestCase.class,
})
public class LoginErrorTestSuite {
	
	@BeforeClass
	public static void initTest() {
		Report.create("Tesouro Direto", "Suite de teste de login invalido, senha valida.");
	}

	@AfterClass
	public static void endTest() {
		Report.close();
	}
}
