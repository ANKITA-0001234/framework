package Scripting;

import org.testng.annotations.Test;
import PomPages.Addtocartpage;
import PomPages.SkillraryDemoLogin;
import PomPages.SkillraryLoginPage;
import genericLib.BaseClass;

public class TestCase1 extends BaseClass
{
	@Test
	public void tc1() 
	{
		SkillraryLoginPage s1=new SkillraryLoginPage(driver);
		s1.gerasbutton();
		s1.skillrarydemoapp();

		driverutilies.switchtabs(driver);

		SkillraryDemoLogin sd = new SkillraryDemoLogin(driver);
		driverutilies.mouseHover(driver,sd.getCousetab());
		sd.seleniumtraining();

		Addtocartpage ad = new Addtocartpage(driver);
		driverutilies.doubleClick(driver,ad.getPlus());
		ad.cartbutton();
		driverutilies.alertpopup(driver);
	}
}
