package genericLib;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Photo 
{
	private String name;

	public void getPhoto(WebDriver driver) throws IOException 
	{
		Date d = new Date();
		String current = d.toString().replaceAll(":","-");

		TakesScreenshot ts = (TakesScreenshot)driver;
		File src =ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(AutoConstant.photoPath+name+current+".png");
		FileUtils.copyFile(src, dest);
	}
}
