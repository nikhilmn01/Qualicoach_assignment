package mvntst.mvnj;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.courseEnroll;
import pageObjects.courseSelector;
import pageObjects.login;
import pageObjects.userProfile;

public class qchTest extends browserinit
{
	//Global Declarations
	String uName= "user87";
	String pwd="User@9135";
	
	public void login() throws IOException
	{
		driver=initialize();
		driver.get("https://test.qualicoach.org/login/index.php");
		
		login l =new login(driver);
		l.username().sendKeys(uName);
		l.pass().sendKeys(pwd);
		l.ok().click();
		
	}
	
	//Test Cases
	@Test
	public void validLogin() throws IOException, InterruptedException
	{
		login();
		
		Thread.sleep(1000);
		driver.close();
		
	}
	
	@Test
	public void invalidLogin() throws IOException, InterruptedException
	{
		driver=initialize();
		driver.get("https://test.qualicoach.org/login/index.php");
		
		login l =new login(driver);
		l.username().sendKeys("abcxd");
		l.pass().sendKeys("AJGV");
		l.ok().click();
		String errorMessage = l.errorMessage();
		System.out.println("The error message shown for the invalid login attempt: " + errorMessage);
		
		Thread.sleep(1000);
		driver.close();
		
	}
	
	@Test
	public void user() throws IOException, InterruptedException
	{
		login();
		
		userProfile u= new userProfile(driver);
		u.menu().click();
		u.profile().click();
		u.edit().click();
		u.editCity().clear();
		u.editCity().sendKeys("Bengaluru");
		u.update().click();
		
		Thread.sleep(1000);
		driver.close();
	}
	
	@Test
	public void dummyEnroll() throws IOException, InterruptedException
	{
		login();
		
		courseEnroll ce = new courseEnroll(driver);
		ce.scroll();
		ce.select();
//		ce.enroll().click();
		Thread.sleep(1000);
		driver.close();
	}
	
	@Test
	public void courseCert() throws IOException, InterruptedException
	{
		login();
		
		courseSelector c = new courseSelector(driver);
		c.scroll();
		c.select();
		c.cert().click();
		c.cert1().click();
//		c.getCert().click();
		
		Thread.sleep(3000);
		driver.quit();
		
	}
	
	@Test
	public void badgeNsurvey() throws IOException, InterruptedException
	{
		login();
		
		courseSelector c = new courseSelector(driver);
		c.scroll();
		c.select();
		c.badgeNsurvey().click();
		c.getBadge().click();
		c.feedback().click();
		
		Thread.sleep(1000);
		driver.quit();
		
	}
	
	@Test
	public void dummyQuiz() throws IOException, InterruptedException
	{
		login();
		
		courseEnroll ce = new courseEnroll(driver);
		ce.scroll();
		ce.select();
//		ce.enroll().click();
		ce.quiz().click();
		ce.quizSel().click();
//		ce.quizAttempt().click();
		ce.quizAttempt();
		
		Thread.sleep(1000);
		driver.close();
	}
	



}
