package pucrs.s2b.tesouro.appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Classe para mapeamento dos objetos da página de página inicial para fazer
 * investimento.
 */

public class InvestAppObject {
	public WebDriver driver;

	public InvestAppObject(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getLoginTextField() {
		return driver.findElement(By.xpath("//*[@id=\"BodyContent_txtLogin\"]"));
	}

	public WebElement getSenhaTextField() {
		return driver.findElement(By.xpath("//*[@id=\"BodyContent_txtSenha\"]"));
	}

	public WebElement getLogarButton() {
		return driver.findElement(By.xpath("//*[@id=\"BodyContent_btnLogar\"]"));
	}

	public WebElement getMenuButton() {
		return driver.findElement(By.xpath("//*[@id=\"barra-top-bar\"]/div/nav/section/ul/li[3]/a"));
	}

	public WebElement getInvestButton() {
		return driver.findElement(By.xpath("//*[@id=\"Topo_lnkAgendarCompra\"]"));
	}

	public WebElement getInstituicaoButton() {
		return driver.findElement(By.xpath("//*[@id=\"BodyContent_ddlAgente\"]"));
	}

	public WebElement getAgentButton() {
		return driver.findElement(By.xpath("//*[@id=\"BodyContent_ddlAgente\"]/option[2]"));
	}

	public WebElement getSairButton() {
		return driver.findElement(By.xpath("//*[@id=\"Topo_lkbSair1\"]"));
	}

}
