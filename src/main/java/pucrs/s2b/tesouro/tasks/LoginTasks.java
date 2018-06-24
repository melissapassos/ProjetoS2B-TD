package pucrs.s2b.tesouro.tasks;

import org.openqa.selenium.WebDriver;

import pucrs.s2b.tesouro.appobjects.LoginAppObject;

public class LoginTasks {
	
	public LoginAppObject appObjects;
	
	public LoginTasks(WebDriver driver){
		this.appObjects = new LoginAppObject(driver);
	}
	
	public void fillForm(String login, String senha){
		appObjects.getLoginTextField().sendKeys(login);
		appObjects.getSenhaTextField().sendKeys(senha);
		appObjects.getLogarButton().click();
	}
	
	public void toLogar(){
		
	}
}