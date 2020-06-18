package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
	public HomePage(WebDriver driver) {
		super(driver);
	}
	public String usernameOrPasswordIncorrect(){
		return driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div/div/div/div[4]/p")).getText();}

	public String captureAdminText (){
		return driver.findElement(By.xpath("//*[@id=\"navbar-container\"]/div[2]/ul/li[3]/a/span")).getText();

	}
}
