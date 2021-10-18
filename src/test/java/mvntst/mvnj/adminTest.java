package mvntst.mvnj;

import java.io.IOException;

import org.testng.annotations.Test;

import adminPageObjects.adLogin;
import adminPageObjects.addUser;
import adminPageObjects.crReport;
import adminPageObjects.createCr;
import adminPageObjects.deleteUser;
import adminPageObjects.editUser;
import adminPageObjects.scroll;

public class adminTest extends browserinit
{
	String aUserName="admin55";
	String newUser="admin5555";
	String aPass = "Admin@6155";
	
	public void adminLogin() throws IOException
	{
		driver= initialize();
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
	
	@Test
	public void login() throws IOException, InterruptedException 
	{
		adminLogin();
		
		sleepNclose();
		
	}
	
	@Test
	public void addUser() throws InterruptedException, IOException
	{
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
	
//	@Test
//	public void editUser() throws IOException, InterruptedException
//	{
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
	
	@Test
	public void deleteUser() throws IOException, InterruptedException 
	{
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
	
	@Test
	public void createCourse() throws IOException, InterruptedException
	{
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
	
	@Test
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
