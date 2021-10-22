package collaborated;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import adminPageObjects.adLogin;
import adminPageObjects.addUser;
import adminPageObjects.crReport;
import adminPageObjects.createCr;
import adminPageObjects.deleteUser;
import adminPageObjects.scroll;
import mvntst.mvnj.browserinit;

public class admin extends browserinit
{
	String aUserName="admin55";
	String newUser="admin5555";
	String aPass = "Admin@6155";
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(admin.class.getName());
	SoftAssert a = new SoftAssert();
	
	public void adminLogin() throws IOException
	{
		driver.get("https://test.qualicoach.org/admin/search.php");
		log.info("reached website successfully");
		
		adLogin a = new adLogin(driver);
		log.info("login object created successfully");
		
		a.username().sendKeys(aUserName);
		a.pass().sendKeys(aPass);
		a.ok().click();
		log.info("clicked login");
	}
	
	public void sleepNclose() throws InterruptedException
	{
		log.info("initiated sleep for 1 sec");
		Thread.sleep(1000);
		log.info("closing current window");
		driver.close();	
	}
	

	public void login() throws IOException, InterruptedException 
	{
		driver=initialize();
		log.info("driver initiated successfully");
		adminLogin();
		log.info("login successful");
		
		sleepNclose();
		
	}
	
	
	public void addUser() throws InterruptedException, IOException
	{
		
		driver=initialize();
		log.info("driver initiated successfully");

		adminLogin();
		log.info("login successful");
		
		addUser u = new addUser(driver);
		log.info("user object created successfully");
		
		u.userNavigate().click();
		log.info("navigation successful");
		
		u.add().click();
		log.info("clicked add user");
		
		u.uname().sendKeys(newUser);
		log.info("clicked username");
		u.pwdClick().click();
		log.info("clicked password");
		u.newPwd().sendKeys(aPass);
		u.fName().sendKeys("adminnmn");
		u.lName().sendKeys("usernmn");
		u.email().sendKeys("admin@abcd.com");
		log.info("entered details");

		
		scroll s = new scroll(driver);
		log.info("scroll object created successfully");
		s.scroll1();
		
		Thread.sleep(3000);
		u.aUpdate().click();
		log.info("clicked on update");
		
		sleepNclose();
	}
	

	public void editUser() throws IOException, InterruptedException
	{
	
		driver=initialize();
		log.info("driver initiated successfully");

		adminLogin();
		log.info("login successful");
		
		try
		{
			adminPageObjects.editUser e = new adminPageObjects.editUser(driver);
			log.info("edit user object created successfully");
			e.userNavigate().click();
			log.info("navigation successful");
			e.browse().click();
			log.info("clicked on browse");
			e.search().sendKeys("adminnmn");
			log.info("searched for created user");
			e.filter().click();
			log.info("clicked on add filter");
			e.edit().click();
			log.info("clicked on edit");
		}
		catch(Exception e)
		{
			log.error(e + ": Because user is already deleted");
			a.assertFalse(false);
			
		}
		a.assertAll();

		sleepNclose();
		
	}
	
	
	public void bdeleteUser() throws IOException, InterruptedException 
	{
		
		try
		{
			driver=initialize();
			log.info("driver initiated successfully");

			adminLogin();
			log.info("login successful");
			
			deleteUser d= new deleteUser(driver);
			log.info("edit user object created successfully");
			
			d.userNavigate().click();
			log.info("navigated to browse");
			
			d.browse().click();
			log.info("clicked on browse");
			
			d.search().sendKeys("adminnmn");
			log.info("searched for created user");
			
			d.filter().click();
			log.info("clicked on add filter");
			
			d.delUser().click();
			log.info("clicked on delete user");
			
			d.confirm().click();
			log.info("confirm deletet");
		}
		catch(Exception e)
		{
			log.error(e + ": Because user is already deleted");
			a.assertFalse(false);
			
		}
		a.assertAll();

		sleepNclose();
			
	}
	
	
	public void createCourse() throws IOException, InterruptedException
	{
		
		driver=initialize();
		log.info("driver initiated successfully");

		adminLogin();
		log.info("login successful");
		
		try 
		{
			createCr c= new createCr(driver);
			log.info("edit user object created successfully");
			
			c.course().click();
			log.info("clicked on course");
			
			c.manageCourse().click();
			log.info("clicked on manage course");
			
			c.create().click();
			log.info("clicked on create course");
			
			c.name().sendKeys("abcabc");
			log.info("searched for course name");
			
			c.subBtn().click();
			log.info("clicked on submit button");
			
			c.find().click();
			log.info("clicked on find");
			
			c.create1().click();
			log.info("clicked on create course");
			
			c.courseName().sendKeys("fullName");
			log.info("entered name of the course");
			
			c.shortName().sendKeys("shortName");
			log.info("entered second name of the course");
			
			c.submit().click();
			log.info("clicked on submit");
		}
		catch (Exception e)
		{
			log.error(e + "could not create a course due to technical issue");
			a.assertFalse(false);
		}
		a.assertAll();
		sleepNclose();
	
	}
	
	
	public void downloadReport() throws IOException, InterruptedException
	{
		driver= initialize();
		log.info("driver initiated successfully");
		
		driver.get("https://test.qualicoach.org/my/");
		log.info("Navigated to website to download url successful");
		
		adLogin a = new adLogin(driver);
		log.info("edit user object created successfully");
		
		a.username().sendKeys(aUserName);
		a.pass().sendKeys(aPass);
		a.ok().click();
		log.info("entered details and clicked on login");
		
		crReport c= new crReport(driver);
		log.info("course report object created successfully");
		
		c.crSel().click();
		log.info("clicked on certificate select");
		
		c.manReports().click();
		log.info("clicked on manage reports");
		
		c.download().click();
		log.info("clicked on download in required fromat");
		
		sleepNclose();
		
		
	}


}
