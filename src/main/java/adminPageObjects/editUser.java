package adminPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class editUser 
{
	public WebDriver driver;
	
	public editUser(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	public WebElement userNavigate()
	{
		return driver.findElement(By.xpath("//a[contains(text(),'Users')]"));
	}
	
	public WebElement browse() 
	{
		return driver.findElement(By.xpath("//ul/li/a[contains(text(),'Browse list of users')]"));
	}
	
	public WebElement search() 
	{
		return driver.findElement(By.id("id_realname"));
	}
	
	public WebElement filter() 
	{
		return driver.findElement(By.id("id_addfilter"));
	}
	
	public WebElement edit()
	{
		return driver.findElement(By.cssSelector("img[title='Edit']"));
	}

}
