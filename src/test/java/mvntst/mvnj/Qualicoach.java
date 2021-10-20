package mvntst.mvnj;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class Qualicoach
{
	public static Logger log = LogManager.getLogger(browserinit.class.getName());
	
	
	@Test
	public void aastudent() throws IOException, InterruptedException
	{
		collaborated.student s = new collaborated.student();
//		s.validLogin();
//		s.invalidLogin();
//		s.user();
//		s.dummyEnroll();
//		s.badgeNsurvey();
		s.courseCert();
//		s.dummyQuiz();
	}
	
	//@Test
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
