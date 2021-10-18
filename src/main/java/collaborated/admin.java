package collaborated;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
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
	
	public void adminLogin() throws IOException
	{
		driver.get("https://test.qualicoach.org/admin/search.php");
		adLogin a = new adLogin(driver);
		a.username().sendKeys(aUserName);
		a.pass().sendKeys(aPass);
		a.ok().click();
	}
	
	public void sleepNclose() throws InterruptedException
	{
		
		Thread.sleep(1000);
		driver.close();	
	}
	

	public void login() throws IOException, InterruptedException 
	{
		driver=initialize();
		adminLogin();
		
		sleepNclose();
		
	}
	
	
	public void addUser() throws InterruptedException, IOException
	{
		
		driver=initialize();

		adminLogin();
		
		addUser u = new addUser(driver);
		u.userNavigate().click();
		u.add().click();
		u.uname().sendKeys(newUser);
		u.pwdClick().click();
		u.newPwd().sendKeys(aPass);
		u.fName().sendKeys("adminnmn");
		u.lName().sendKeys("usernmn");
		u.email().sendKeys("admin@abcd.com");
		
		scroll s = new scroll(driver);
		s.scroll();
		Thread.sleep(3000);
		u.aUpdate().click();
		
		sleepNclose();
	}
	

//	public void editUser() throws IOException, InterruptedException
//	{
//	
//		driver=initialize();
//
//		adminLogin();
//		
//		editUser e= new editUser(driver);
//		e.userNavigate().click();
//		e.browse().click();
//		e.search().sendKeys("adminnmn");
//		e.filter().click();
//		e.edit().click();
//		
//		sleepNclose();
//		
//	}
	
	
	public void bdeleteUser() throws IOException, InterruptedException 
	{
		
		driver=initialize();

		adminLogin();
		
		deleteUser d= new deleteUser(driver);
		d.userNavigate().click();
		d.browse().click();
		d.search().sendKeys("adminnmn");
		d.filter().click();
		d.delUser().click();
		d.confirm().click();
		
		sleepNclose();
			
	}
	
	
	public void createCourse() throws IOException, InterruptedException
	{
		
		driver=initialize();

		adminLogin();
		
		createCr c= new createCr(driver);
		c.course().click();
		c.manageCourse().click();
		c.create().click();
		c.name().sendKeys("abcabc");
		c.subBtn().click();
		c.find().click();
		c.create1().click();
		c.courseName().sendKeys("fullName");
		c.shortName().sendKeys("shortName");
		c.submit().click();
		
		sleepNclose();
	
	}
	
	
	public void downloadReport() throws IOException, InterruptedException
	{
		driver= initialize();
		driver.get("https://test.qualicoach.org/my/");
		adLogin a = new adLogin(driver);
		a.username().sendKeys(aUserName);
		a.pass().sendKeys(aPass);
		a.ok().click();
		
		crReport c= new crReport(driver);
		c.crSel().click();
		c.manReports().click();
		c.download().click();
		
		sleepNclose();
		
		
	}


}
