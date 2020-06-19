package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateProject extends BasePage {
	public CreateProject(WebDriver driver) {
		super(driver);
	}
	public String usernameOrPasswordIncorrect(){
		return driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div/div/div/div[4]/p")).getText();}

	public String captureAdminText (){
		return driver.findElement(By.xpath("//*[@id=\"navbar-container\"]/div[2]/ul/li[3]/a/span")).getText();
	}
	public MyAccount clickOnMe (){
		driver.findElement(By.xpath("//*[@id=\"breadcrumbs\"]/ul/li/a")).click();
		return new MyAccount(driver);
	}
}
