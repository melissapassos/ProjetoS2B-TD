package pucrs.s2b.tesouro.appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Classe para mapeamento dos objetos da página de login.
 */

public class LoginAppObject {
	private WebDriver driver;

	public LoginAppObject(WebDriver driver) {
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
}	
