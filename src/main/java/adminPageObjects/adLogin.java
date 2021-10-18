package adminPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class adLogin 
{
	public WebDriver driver;
	
	public adLogin(WebDriver driver) 
	{
		this.driver=driver;
	}

	public WebElement username()
	{
		return driver.findElement(By.id("username"));
	}
	
	public WebElement pass()
	{
		return driver.findElement(By.id("password"));
	}
	
	public WebElement ok()
	{
		return driver.findElement(By.id("loginbtn"));
	}
	
	public String errorMessage()
	{
		String message = driver.findElement(By.cssSelector(".error")).getText();
		return message;
		
	}

}
