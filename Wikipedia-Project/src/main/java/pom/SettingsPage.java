package pom;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SettingsPage extends HomePage{
	
	AndroidDriver driver;
	
	public SettingsPage(AndroidDriver driver) {
		super(driver);
	}
	
	@AndroidFindBy(xpath="(//android.widget.Switch[@resource-id=\"org.wikipedia.alpha:id/switchWidget\"])[1]")
	private WebElement showImagesToggleBtn;
	
	@AndroidFindBy(xpath="(//android.widget.Switch[@resource-id=\"org.wikipedia.alpha:id/switchWidget\"])[2]")
	private WebElement showLinkPreviewsToggleBtn;
	
	@AndroidFindBy(xpath="(//android.widget.Switch[@resource-id=\"org.wikipedia.alpha:id/switchWidget\"])[3]")
	private WebElement sendUsageReportsToggleBtn;
	
	@AndroidFindBy(xpath="(//android.widget.Switch[@resource-id=\"org.wikipedia.alpha:id/switchWidget\"])[4]")
	private WebElement sendCrashReportsToggleBtn;
	
	@AndroidFindBy(accessibility ="Navigate up")
	private WebElement navigateUp;
	
	public WebElement getImageToggleBtn() {
		return showImagesToggleBtn;
	}
	
	public WebElement getLinkPreviewBtn() {
		return showLinkPreviewsToggleBtn;
	}
	
	public WebElement getUsageReportsBtn() {
		return sendUsageReportsToggleBtn;
	}
	
	public WebElement getCrashReportsBtn() {
		return sendCrashReportsToggleBtn;
	}
	
	public WebElement getNavigateUpBtn() {
		return navigateUp;
	}
}
