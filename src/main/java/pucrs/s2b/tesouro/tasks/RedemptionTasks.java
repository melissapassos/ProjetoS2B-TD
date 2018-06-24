package pucrs.s2b.tesouro.tasks;

import org.openqa.selenium.WebDriver;

import pucrs.s2b.tesouro.appobjects.RedemptionAppObject;

public class RedemptionTasks {
	public RedemptionAppObject home;

	public RedemptionTasks(WebDriver driver) {
		this.home = new RedemptionAppObject(driver);
	}

	public void login(String login, String senha) throws InterruptedException {
		home.getLoginTextField().sendKeys(login);
		home.getSenhaTextField().sendKeys(senha);
		home.getLogarButton().click();
	}

	public void rescue() {
		home.getMenuRescueButton().click();
		home.getRescueButton().click();
		home.getAgendarButton().click();
	}

	public void instituicao () {
		home.getInstFinButton().click();
		home.getCorretModalButton().click();
	}
	
	public void cancelar() {
		home.getCancelarButton().click(); 
		home.getContinuarButton().click();
		home.getDataButton().click();
		home.getContinButton().click();		
	}
	
	public void cancela() {
		home.getCancelButton().click();
	}
	
	public void inicio() {
		home.getInicioButton().click();
	}

	public void logout() {
		home.getSairButton().click();
	}

}