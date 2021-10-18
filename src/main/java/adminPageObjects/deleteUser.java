package adminPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class deleteUser 
{
	public WebDriver driver;
	
	public deleteUser(WebDriver driver) 
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
	
	public WebElement delUser()
	{
		return driver.findElement(By.cssSelector("img[title='Delete']"));
	}
	
	public WebElement confirm()
	{
		return driver.findElement(By.cssSelector("input[value='Delete']"));
	}
	

}
