package pucrs.s2b.tesouro.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drivers {
	public static WebDriver getChromeDriver(){
		WebDriverManager.chromedriver().setup();
		return new ChromeDriver();
	}
}