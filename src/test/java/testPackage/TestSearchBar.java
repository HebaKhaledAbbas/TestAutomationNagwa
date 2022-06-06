package testPackage;


import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import data.JsonDataReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.searchResultHomePage;

public class TestSearchBar {
	
	
	WebDriver driver;
	searchResultHomePage searchResultHomePageObj = new searchResultHomePage(driver);

	
	@BeforeMethod
	public void before_method () {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		searchResultHomePageObj = new searchResultHomePage(driver);
		searchResultHomePageObj.navigate();
		
	}
	
	@Test
	public void AssertSearchIsWorking () throws FileNotFoundException, IOException, ParseException {
		
		JsonDataReader jsonReader = new JsonDataReader();
		jsonReader.JsonReader();
		
		
		searchResultHomePageObj.ClickOnSearch();
		searchResultHomePageObj.enterLessonName(jsonReader.SearchData);
		searchResultHomePageObj.ClickOnSearch();
		searchResultHomePageObj.ClickOn2ndResult();
		searchResultHomePageObj.ClickOnWorksheet();
		searchResultHomePageObj.ClickOnStartPracticing();
	}
	
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
}
