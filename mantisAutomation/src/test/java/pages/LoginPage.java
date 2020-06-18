package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

	public LoginPage (WebDriver driver) {
		super(driver);
	}
	public LoginPage typeLogin(String user){
		driver.findElement(By.id("username")).sendKeys(user);
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/fieldset/input[2]")).click();
		return this;
	}
	public LoginPage typePassword(String password){
		driver.findElement(By.id("password")).sendKeys(password);
		return this;
	}
	public HomePage clickLogin (){
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/fieldset/input[3]")).click();
		return new HomePage(driver);
	}
}
