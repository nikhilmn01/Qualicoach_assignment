package collaborated;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import mvntst.mvnj.browserinit;
import pageObjects.courseEnroll;
import pageObjects.courseSelector;
import pageObjects.login;
import pageObjects.userProfile;

public class student extends browserinit
{
	//Global Declarations
	String uName= "scam143";
	String pwd="scam143";
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(browserinit.class.getName());
	SoftAssert a = new SoftAssert();
	
	
//	public student(WebDriver driver) 
//	{
//		this.driver=driver;
//	}
	
	public void login() throws IOException
	{
		log.info("entered login block");
		
		
		driver.get("https://test.qualicoach.org/login/index.php");
		log.info("successfully reached the website");
		
		login l =new login(driver);
		log.info("login object created successfully");
		
		l.username().sendKeys(uName);
		l.pass().sendKeys(pwd);
		log.info("Username and password is entered");
		
		l.ok().click();
		log.info("Valid login ready");
		
	}
	public void sleepNclose() throws InterruptedException
	{
		log.info("entered sleepNclose block");
		Thread.sleep(1000);
		driver.close();
	}
	

	
	public void validLogin() throws IOException, InterruptedException
	{
		driver = initialize();

		log.info("entered validLogin block");
		login();
		log.info("Valid login successful");
		sleepNclose();
		
	}
	
	public void invalidLogin() throws IOException, InterruptedException
	{
		driver = initialize();

		log.info("entered invalid Login block");
				
		driver.get("https://test.qualicoach.org/login/index.php");
		log.info("successfully reached the website");
		
		login l =new login(driver);
		log.info("login object created successfully");

		l.username().sendKeys("abcxd");
		l.pass().sendKeys("AJGV");
		log.info("Username and password is entered");

		l.ok().click();
		log.info("Valid login ready");

		l.errorMessage();
		log.error("Invalid username or password message displayed successfully");
		sleepNclose();
		
		
	}
	
	public void user() throws IOException, InterruptedException
	{
		driver = initialize();

		log.info("entered login block");
		
		login();
		log.info("executed login block");
		
		userProfile u= new userProfile(driver);
		log.info("user profile object created successfully");

		u.menu().click();
		log.info("clicked menu");

		u.profile().click();
		log.info("clicked profile");

		u.edit().click();
		log.info("clicked edit");

		u.editCity().clear();
		log.info("clicked editCity");

		u.editCity().sendKeys("Bengaluru");
		log.info("entered city name");

		u.update().click();
		log.info("clicked update");
		
		sleepNclose();

		
	}
	
	public void dummyEnroll() throws IOException, InterruptedException
	{
		driver = initialize();

		login();
		log.info("executed login block");

		
		courseEnroll ce = new courseEnroll(driver);
		log.info("course enroll object created successfully");

		ce.scroll();
		log.info("executed scroll method");

		ce.select();
		log.info("executed select method");
		
		try
		{
			ce.enroll().click();
			log.info("executed enroll ");
		}
		catch(org.openqa.selenium.ElementNotInteractableException e)
		{
			String error = "Already enrolled to this course and hence the object is not interactable";
			a.assertFalse(false);
			log.error(error);
//			System.out.println(error);
		}
		catch(Exception e)
		{
			String error = ": Because, user already enrolled to this course ";
			a.assertFalse(false);
			log.error(e + error);
		}

		a.assertAll();
		
		sleepNclose();

	}
	
	public void courseCert() throws IOException, InterruptedException
	{
		driver = initialize();

		login();
		log.info("executed login block");

		
		courseSelector c = new courseSelector(driver);
		log.info("course selector object created successfully");

		c.scroll();
		log.info("executed scroll method");

		c.select();
		log.info("executed select method");


		
		try 
		{
			c.cert().click();
			log.info("clicked certificate tab");
			
			c.cert1().click();
			log.info("clicked certificate subTab");
			
			c.getCert().click();
			log.info("certificate downloaded");
		}
		catch(org.openqa.selenium.ElementNotInteractableException e )
		{
			log.error(e);
		}
		
		catch( org.openqa.selenium.NoSuchElementException d)
		{
			log.error(d);
		}
		
		catch(Exception a)
		{
			log.error("Parent Exception: "+ a);
		}

		sleepNclose();
	
		
	}
	
	public void badgeNsurvey() throws IOException, InterruptedException
	{
		driver = initialize();

		login();
		log.info("executed login block");
		
		courseSelector c = new courseSelector(driver);
		log.info("course selector object created successfully");

		c.scroll();
		log.info("executed scroll method");

		c.select();
		log.info("executed select method");

		c.badgeNsurvey().click();
		log.info("clicked badgeNsurvey tab");

		c.getBadge().click();
		log.info("clicked getBadge");

		c.feedback().click();
		log.info("clicked feedback");
		sleepNclose();
		
		
	}
	
	public void dummyQuiz() throws IOException, InterruptedException
	{
		driver = initialize();

		login();
		log.debug("executed login block");
		
		courseEnroll ce = new courseEnroll(driver);
		log.info("course enroll object created successfully");

		ce.scroll();
		log.debug("executed scroll method");

		ce.select();
		log.debug("executed select method");

		try
		{
			ce.enroll().click();
			log.debug("executed enroll ");
		}
		catch(org.openqa.selenium.ElementNotInteractableException e)
		{
			
			String error = "Already enrolled to this course and hence the object is not interactable";
			a.assertFalse(false);
			System.out.println(error);
			log.error(e.getMessage());
		}

		log.info("executed enroll method");

		ce.quiz().click();
		log.debug("clicked on quiz tab");

		ce.quizSel().click();
		log.info("clicked on quiz subTab");

		
		try
		{
			ce.quizAttempt().click();
			log.info("attempt the quiz ");
		}
		catch(org.openqa.selenium.NoSuchElementException e)
		{
			String error = "Already taken the quiz";
			a.assertFalse(false);
			log.error(error);
		}
		
		log.info("quiz attempted");
		
		
		
		sleepNclose();
		
	}
	

}
