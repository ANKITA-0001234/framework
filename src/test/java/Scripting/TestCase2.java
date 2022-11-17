package Scripting;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import PomPages.SkillraryDemoLogin;
import PomPages.SkillraryLoginPage;
import PomPages.TestingPage;
import genericLib.BaseClass;

public class TestCase2 extends BaseClass
{
	@Test
	public void tc2() throws IOException 
	{
		SkillraryLoginPage s = new SkillraryLoginPage(driver);
		s.gerasbutton();
		s.skillrarydemoapp();

		driverutilies.switchtabs(driver);

		SkillraryDemoLogin sd = new SkillraryDemoLogin(driver);
		driverutilies.dropdown(sd.getCoursetab(),pdata.getdata("dropdownopt"));

		TestingPage tp = new TestingPage(driver);
		driverutilies.draganddrop(driver,tp.getSeleniumtraining());

		Point loc = tp.getTwitter().getLocation();
		int x = loc.getX();
		int y = loc.getY();
		driverutilies.scrollBar(driver,x,y);

		tp.twitterlogo();
	}
}
