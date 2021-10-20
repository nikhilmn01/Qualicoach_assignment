package adminPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class addUser 
{
	public WebDriver driver;
	
	public addUser(WebDriver driver) 
	{
		this.driver=driver;
	}

	public WebElement userNavigate()
	{
		return driver.findElement(By.xpath("//a[contains(text(),'Users')]"));
	}
	
	public WebElement add()
	{
		return driver.findElement(By.xpath("//ul/li[3]/a[contains(text(),'Add a new user')]"));
	}
	
	public WebElement uname()
	{
		return driver.findElement(By.id("id_username"));
	}
	
	public WebElement pwdClick()
	{
		return driver.findElement(By.xpath("//span/em[contains(text(),'Click to enter text')]"));
	}
	
	public WebElement newPwd()
	{
		return driver.findElement(By.id("id_newpassword"));
	}
	
	public WebElement fName()
	{
		return driver.findElement(By.id("id_firstname"));
	}
	
	public WebElement lName()
	{
		return driver.findElement(By.id("id_lastname"));
	}
	
	public WebElement email()
	{
		return driver.findElement(By.id("id_email"));
	}
	
	public WebElement aUpdate()
	{
		return driver.findElement(By.id("id_submitbutton"));
	}
}
