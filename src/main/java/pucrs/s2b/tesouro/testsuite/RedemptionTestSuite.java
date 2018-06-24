package pucrs.s2b.tesouro.testsuite;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import pucrs.s2b.tesouro.framework.Report;
import pucrs.s2b.tesouro.testcase.RedemptionTestCase;


@RunWith(Suite.class)
@SuiteClasses({
	RedemptionTestCase.class,
})
public class RedemptionTestSuite {
	
	@BeforeClass
	public static void initTest() {
		Report.create("Tesouro Direto", "Suite de teste do botão Resgatar.");
	}

	@AfterClass
	public static void endTest() {
		Report.close();
	}

}