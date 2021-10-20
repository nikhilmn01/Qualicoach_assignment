package adminPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class crReport 
{
	public WebDriver driver;
	
	public crReport(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	public WebElement crSel()
	{
		return driver.findElement(By.xpath("//a[contains(text(),'Grades of resources')]"));
	}
	
	public WebElement manReports()
	{
		return driver.findElement(By.xpath("//a[@title='Manage reports']"));
	}
	
	public WebElement download()
	{
		return driver.findElement(By.xpath("//table[@id='reportslist']/tbody/tr[1]/td[6]/a[3]"));
	}


}
