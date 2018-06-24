package pucrs.s2b.tesouro.appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Classe para mapeamento dos objetos da página de página inicial para tirar extrato.
 */

public class ExtratoAppObject {
	public WebDriver driver;
	
	public ExtratoAppObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getAccountButton() {
		return this.driver.findElement(By.linkText("Account"));
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
	
	public WebElement getBarraButton() {
		return driver.findElement(By.xpath("//*[@id=\"barra-top-bar\"]/div/nav/section/ul/li[5]"));
	}

	public WebElement getExtratoButton() {
		return driver.findElement(By.xpath("//*[@id=\"barra-top-bar\"]/div/nav/section/ul/li[5]/ul/li[6]/a"));
	}

	public WebElement getMesButton() {
		return driver.findElement(By.xpath("//*[@id=\"BodyContent_ddlMes\"]/option[4]"));
	}

	public WebElement getConsultarButton() {
		return driver.findElement(By.xpath("//*[@id=\"BodyContent_btnConsultar\"]"));
	}

	public WebElement getSairButton() {
		return driver.findElement(By.xpath("//*[@id=\"Topo_lkbSair1\"]"));
	}
	
}