package main.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class BasePage {

	public WebDriver driver;
	
	public BasePage() {
		driver=InitTest.instance.driver;
		System.out.print(driver);
		PageFactory.initElements(driver,this);
	}
	

}
