package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;

public class TestNavigatingToHomepage {

	
	WebDriver driver;
	HomePage homePage = new HomePage(driver);
	
	@BeforeMethod
	public void before_method () {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		homePage = new HomePage(driver);
		homePage.navigate();
		
	}
	
	@Test
	public void isHomePageDisplayed ()  {
		
	
		
		homePage.ClickOnEnglish();
		boolean SigninDisplayed = homePage.IsSignInDisplayed();
		Assert.assertTrue(SigninDisplayed);

}
	
   @AfterMethod
	public void afterMethod() {
		driver.quit();
	}
	
}