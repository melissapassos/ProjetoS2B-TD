package pucrs.s2b.tesouro.tasks;

import org.openqa.selenium.WebDriver;

import pucrs.s2b.tesouro.appobjects.InvestAppObject;

public class InvestTasks {
	public InvestAppObject home;

	public InvestTasks(WebDriver driver) {
		this.home = new InvestAppObject(driver);
	}
	
	public void login(String login, String senha){
		home.getLoginTextField().sendKeys(login);
		home.getSenhaTextField().sendKeys(senha);
		home.getLogarButton().click();
		
	}

	public void invest() {
		home.getMenuButton().click();
		home.getInvestButton().click();
		home.getInstituicaoButton().click();
		home.getAgentButton().click();
	}
	
	public void logout(){
		home.getSairButton().click();
	}
}