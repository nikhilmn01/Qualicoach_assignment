package mvntst.mvnj;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class studentMain
{
	public static Logger log = LogManager.getLogger(browserinit.class.getName());
	
	
	@Test
	public void student() throws IOException, InterruptedException
	{
		collaborated.student s = new collaborated.student();
		s.aValidLogin();
		s.bInvalidLogin();
		s.cEmptyLogin();
		s.dUser();
		s.eDummyEnroll();
		s.fCourseCert();
		s.gBadgeNsurvey();
		s.hDummyQuiz();
	}
	
	

}
