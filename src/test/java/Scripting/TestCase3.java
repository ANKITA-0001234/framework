package Scripting;

import java.io.IOException;

import org.testng.annotations.Test;

import PomPages.CorejavaPage;
import PomPages.SkillraryLoginPage;
import PomPages.WishlistPage;
import genericLib.BaseClass;

public class TestCase3 extends BaseClass
{
	@Test
	public void tc3() throws InterruptedException, IOException
	{
		SkillraryLoginPage s1 = new SkillraryLoginPage(driver);
		s1.serachtextbox(pdata.getdata("coursename"));
		s1.serachbutton();

		CorejavaPage cp = new CorejavaPage(driver);
		cp.java();

		WishlistPage wp = new WishlistPage(driver);
		driverutilies.switchFrame(driver);
		wp.playbutton();
		Thread.sleep(10000);
		wp.pausebutton();
		driverutilies.switchbackframe(driver);
		wp.addtowishlistbtn();
	}
}
