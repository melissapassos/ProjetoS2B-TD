package pucrs.s2b.tesouro.appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Classe para mapeamento dos objetos da página de página inicial para fazer
 * resgate de investimento.
 */

public class RedemptionAppObject {
	public WebDriver driver;

	public RedemptionAppObject(WebDriver driver) {
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

	public WebElement getMenuRescueButton() {
		return driver.findElement(By.xpath("//*[@id=\"barra-top-bar\"]/div/nav/section/ul/li[3]/a"));
	}

	public WebElement getRescueButton() {
		return driver.findElement(By.xpath("//*[@id=\"Topo_lnkAgendarVenda\"]"));
	}

	public WebElement getAgendarButton() {
		return driver.findElement(By.xpath("//*[@id=\"BodyContent_rdbAgendar\"]"));
	}

	public WebElement getInstFinButton() {
		return driver.findElement(By.xpath("//*[@id=\"BodyContent_ddlAgente\"]"));
	}

	public WebElement getCorretModalButton() {
		return driver.findElement(By.xpath("//*[@id=\"BodyContent_ddlAgente\"]/option[2]"));
	}

	public WebElement getCancelarButton() {
		return driver.findElement(By.xpath("//*[@id=\"BodyContent_btnCancelar\"]"));
	}

	public WebElement getContinuarButton() {
		return driver.findElement(By.xpath("//*[@id=\"BodyContent_btnContinuar\"]"));
	}

	public WebElement getDataButton() {
		return driver.findElement(By.xpath("//*[@id=\"BodyContent_ddlDataVenda\"]/option[25]"));
	}

	public WebElement getContinButton() {
		return driver.findElement(By.xpath("//*[@id=\"BodyContent_btnContinuar\"]"));
	}

	public WebElement getCancelButton() {
		return driver.findElement(By.xpath("//*[@id=\"BodyContent_btnCancelar\"]"));
	}

	public WebElement getCanceButton() {
		return driver.findElement(By.xpath("//*[@id=\"BodyContent_btnCancelar\"]"));
	}

	public WebElement getInicioButton() {
		return driver.findElement(By.xpath("//*[@id=\"barra-top-bar\"]/div/nav/section/ul/li[1]/a"));
	}

	public WebElement getSairButton() {
		return driver.findElement(By.xpath("//*[@id=\"Topo_lkbSair1\"]"));
	}
}
