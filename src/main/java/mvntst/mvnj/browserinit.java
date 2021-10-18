package mvntst.mvnj;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserinit 
{
	//Global Declarations
	WebDriver driver;
	
	public  WebDriver initialize() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("D:\\NMN\\New folder\\QT\\mvnj\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		
		String browserName= prop.getProperty("browser");
//		System.out.println(browserName);

		if (browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if (browserName.equals("firefox"))
		{
			System.out.println("set properties of firefox browser!");
		}
		
		else if (browserName.equals("IE"))
		{
			System.out.println("set properties of IE browser!");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
		
		
	}


}
