package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccount extends BasePage{
	public MyAccount(WebDriver driver) {
		super(driver);
	}

	public MyAccount typeCurrentPassword(){
		driver.findElement(By.xpath("//*[@id=\"password-current\"]")).sendKeys("root");
		return this;
	}
	public MyAccount typeNewPassword(){
		driver.findElement(By.id("password")).sendKeys("root");
		return this;
	}
	public MyAccount typeConfirmPassword(){
		driver.findElement(By.id("password-confirm")).sendKeys("root");
		return this;
	}
	public MyAccount clickUpdateUser(){
		driver.findElement(By.xpath("//*[@id=\"account-update-form\"]/div/div[2]/div[2]/input")).click();
		return this;
	}
}
