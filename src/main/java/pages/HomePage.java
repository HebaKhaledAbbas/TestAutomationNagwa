package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	
	//variables
	private WebDriver driver;
	private String Url = "https://www.nagwa.com/";
	
	
	//locators
	By EnglishBtn = By.linkText("English");
	By SignInBtnForAssertion = By.xpath("//i[@class='f-icon lock-icon']");
	
	
	
	
	
	//constructor
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	//Actions
	public void navigate() {
		driver.navigate().to(Url);
	}
	
	public void ClickOnEnglish () {
		
		driver.findElement(EnglishBtn).click();
	}
	
	public boolean IsSignInDisplayed () {
		
		return driver.findElement(SignInBtnForAssertion).isDisplayed();
	}
	
		
	
	
	
}
