package adminPageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class scroll 
{
	public WebDriver driver;
	
	public scroll(WebDriver driver) 
	{
		this.driver = driver;
	}
	public void scroll1() throws InterruptedException
	{
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(500);
	}
	

}
