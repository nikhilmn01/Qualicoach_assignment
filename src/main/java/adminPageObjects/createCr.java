package adminPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class createCr 
{
	public WebDriver driver;
	
	public createCr(WebDriver driver) 
	{
		this.driver=driver;
	}

	public WebElement course()
	{
		return driver.findElement(By.xpath("//ul/li[3]/a[contains(text(),'Courses')]"));
	}
	
	public WebElement manageCourse()
	{
		return driver.findElement(By.xpath("//li/a[contains(text(),'Manage courses and categories')]"));
	}

	public WebElement create()
	{
		return driver.findElement(By.xpath("//a[contains(text(),'Create new category')]"));
	}
	
	public WebElement name()
	{
		return driver.findElement(By.id("id_name"));
	}
	
	public WebElement subBtn()
	{
		return driver.findElement(By.id("id_submitbutton"));
	}
	
	public WebElement find()
	{
		return driver.findElement(By.xpath("//a[contains(text(),'abcabc')]"));
	}
	
	public WebElement create1()
	{
		return driver.findElement(By.xpath("//a[contains(text(),'Create new course')]"));
	}
	
	public WebElement courseName()
	{
		return driver.findElement(By.id("id_fullname"));
	}
	
	public WebElement shortName()
	{
		return driver.findElement(By.id("id_shortname"));
	}
	
	public WebElement submit()
	{
		return driver.findElement(By.id("id_saveanddisplay"));
	}
	
	
}
