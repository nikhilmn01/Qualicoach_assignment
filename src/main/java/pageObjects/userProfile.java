package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class userProfile 
{
	
	public WebDriver driver;
	
	public userProfile(WebDriver driver) 
	{
		this.driver=driver;
	}

	public WebElement menu()
	{
		return driver.findElement(By.cssSelector(".userbutton"));
	}
	
	public WebElement profile()
	{
		return driver.findElement(By.xpath("//a/span[@id='actionmenuaction-2']"));
	}
	
	public WebElement edit()
	{
		return driver.findElement(By.xpath("//a[contains(text(),'Edit profile')]"));
	}
	
	public WebElement editCity()
	{
		return driver.findElement(By.id("id_city"));
	}
	
	public WebElement update()
	{
		return driver.findElement(By.id("id_submitbutton"));
	}
	
	

}
