package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage 
{
	@FindBy(xpath="a[text()='Selenium Training'])[2]")
	private WebElement seleniumtraining;

	@FindBy(id="cartArea")
	private WebElement cart;

	@FindBy(xpath="(//i[@class='fa fa-twitter'])[2]")
	private WebElement twitter;

	public TestingPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public void twitterlogo()
	{
		twitter.click();	
	}

	public WebElement getTwitter() {
		// TODO Auto-generated method stub
		return null;
	}

	public WebElement getSeleniumtraining() {
		// TODO Auto-generated method stub
		return null;
	}
}
