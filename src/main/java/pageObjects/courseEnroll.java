package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class courseEnroll 
{
	
	public WebDriver driver;
	
	public courseEnroll(WebDriver driver) 
	{
		this.driver = driver;
	}

	public void scroll() throws InterruptedException
	{
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1800)");
		Thread.sleep(500);
	}
	
	public void select() throws InterruptedException
	{
		Actions a = new Actions(driver);
		Thread.sleep(500);
		WebElement mouseHower = driver.findElement(By.xpath("//div[@class='course grid']/div[9]/i/img"));							//Hover mouse onto mouseHover button
		a.moveToElement(mouseHower).build().perform();
		
		Thread.sleep(1000);
		
		WebElement mouseClick = driver.findElement(By.xpath("//div[@class='course grid']/div[9]/a/p"));
		a.moveToElement(mouseClick).click().build().perform();
	}
	
	public WebElement enroll()
	{
		return driver.findElement(By.id("id_submitbutton"));
	}
	
	public WebElement quiz()
	{
		return driver.findElement(By.xpath("//a[contains(text(),'Quiz')]"));
	}
	
	public WebElement quizSel()
	{
		return driver.findElement(By.xpath("//div[@id='collapse6']/div/ul/li/a/div[2]"));
	}
	
	public WebElement quizAttempt()
	{
		return driver.findElement(By.xpath("//input[@value='Attempt quiz now']"));
	}

}
