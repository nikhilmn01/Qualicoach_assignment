package mvntst.mvnj;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class adminMain
{
	public static Logger log = LogManager.getLogger(browserinit.class.getName());
	
	
	@Test
	public void admin() throws IOException, InterruptedException
	{
		collaborated.admin a = new collaborated.admin();
		a.login();
		a.addUser();
//		a.editUser();
		a.bdeleteUser();
		a.createCourse();
		a.downloadReport();
	}
	
	

}