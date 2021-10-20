package mvntst.mvnj;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sample {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://test.qualicoach.org/login/index.php");
		driver.findElement(By.id("username")).sendKeys("user87");
		driver.findElement(By.id("password")).sendKeys("User@9135");
		driver.findElement(By.id("loginbtn")).click();
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;										// any javascript to be executed is first instantiated using this statement
		Thread.sleep(500);
		jse.executeScript("window.scrollBy(0,1800)");
		
		Thread.sleep(1000);
		
		Actions a = new Actions(driver);
		Thread.sleep(500);
		WebElement mouseHower = driver.findElement(By.xpath("//div[@class='course grid']/div[4]/i/img"));							//Hover mouse onto mouseHover button
		a.moveToElement(mouseHower).build().perform();
		
		Thread.sleep(1000);
		
		WebElement mouseClick = driver.findElement(By.xpath("//div[@class='course grid']/div[4]/a/p"));
		a.moveToElement(mouseClick).click().build().perform();

	}

}