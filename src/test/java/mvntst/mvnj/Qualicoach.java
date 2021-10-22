package mvntst.mvnj;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class Qualicoach
{
	public static Logger log = LogManager.getLogger(Qualicoach.class.getName());
	
	
	@Test
	public void aastudent() throws IOException, InterruptedException
	{
		Thread.sleep(2000);
		log.info("********************Start of user account********************");
		collaborated.student s = new collaborated.student();
		s.validLogin();
		s.invalidLogin();
		s.user();
		s.dummyEnroll();
		s.badgeNsurvey();
		s.courseCert();
		s.dummyQuiz();
		log.info("********************end of user account********************");
		Thread.sleep(1000);
	}
	
	@Test
	public void admin() throws IOException, InterruptedException
	{
		Thread.sleep(2000);
		log.info("********************Start of admin account********************");
		collaborated.admin a = new collaborated.admin();
		a.login();
		a.addUser();
		a.editUser();
		a.bdeleteUser();
		a.createCourse();
		a.downloadReport();
		log.info("********************end of admin account********************");
		Thread.sleep(1000);

	}

}
