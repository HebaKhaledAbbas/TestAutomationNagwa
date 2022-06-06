package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class searchResultHomePage {


	//variables
	WebDriver driver;
	private String url = "https://www.nagwa.com/en/";


	//locators
	By SearchIcon = By.xpath("//button[@type='button']");
	By _2ndSearchResult = By.linkText("Vector Addition");
	By worksheetLink = By.linkText("Lesson Worksheet");
	By StartPracticintBtn = By.linkText("Start Practising");


	//constructor
	public searchResultHomePage(WebDriver driver) {
		this.driver = driver;
	}



	//Actions
	public void navigate () {
		driver.navigate().to(url);
	}

	public void ClickOnSearch() {

		driver.findElement(SearchIcon).click();
	}

	public void enterLessonName (String query) {

		driver.findElement(SearchIcon).sendKeys(query + Keys.ENTER);
	}

	public void ClickOn2ndResult () {

		driver.findElement(_2ndSearchResult).click();
	}

	

	public void ClickOnWorksheet () {

		driver.findElement(worksheetLink).click();
	}

	public void ClickOnStartPracticing() {

		driver.findElement(StartPracticintBtn).click();
	}
	


}
