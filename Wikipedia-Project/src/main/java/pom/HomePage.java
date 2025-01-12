package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage {
	
	AndroidDriver driver;
	
	public HomePage(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id="android:id/button1")
	private WebElement okButton;
	
	@AndroidFindBy(xpath="(//android.widget.ImageView[@resource-id='org.wikipedia.alpha:id/icon'])[1]")
	private WebElement browserButton;
	
	@AndroidFindBy(xpath="(//android.widget.ImageView[@resource-id='org.wikipedia.alpha:id/icon'])[2]")
	private WebElement listButton;
	
	@AndroidFindBy(xpath="(//android.widget.ImageView[@resource-id='org.wikipedia.alpha:id/icon'])[3]")
	private WebElement historyButton;
	
	@AndroidFindBy(xpath="(//android.widget.ImageView[@resource-id='org.wikipedia.alpha:id/icon'])[4]")
	private WebElement nearbyButton;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='org.wikipedia.alpha:id/view_card_header_title' and @text='In the news']")
	private WebElement inTheNews;
	
	@AndroidFindBy(id="org.wikipedia.alpha:id/fragment_feed_header")
	private WebElement searchField;
	
	@AndroidFindBy(id="org.wikipedia.alpha:id/search_src_text")
	private WebElement searchBox;
	
	@AndroidFindBy(id="org.wikipedia.alpha:id/search_close_btn")
	private WebElement closeButton;
	
	@AndroidFindBy(id="org.wikipedia.alpha:id/menu_overflow_button")
	private WebElement overflowButton;
	
	@AndroidFindBy(id="org.wikipedia.alpha:id/explore_overflow_settings")
	private WebElement overflowSettings;
	
	public WebElement getOkBtnElement() {
		return okButton;
	}
	
	public WebElement getListBtnElement() {
		return listButton;
	}
	
	public WebElement getBrowserBtnElement() {
		return browserButton;
	}
	
	public WebElement getHistoryBtnElement() {
		return historyButton;
	}
	
	public WebElement getNearbyBtnElement() {
		return nearbyButton;
	}
	
	public WebElement getSearchField() {
		return searchField;
	}
	
	public WebElement getCloseBtn() {
		return closeButton;
	}
	
	public WebElement getOverflowBtn() {
		return overflowButton;
	}
	
	public WebElement getOverflowSettings() {
		return overflowSettings;
	}
	
	public void clickOnTheElement(WebElement element) {
		element.click();
	}
	
	public void scrollToTheElement(String text) {
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"))"));
	}
	
	public void typeIntoTheTextbox(String text) {
		searchBox.isDisplayed();
		searchBox.sendKeys(text);
		String enteredText = searchBox.getText();
		Assert.assertEquals(enteredText, "New York");
	}
	
}
