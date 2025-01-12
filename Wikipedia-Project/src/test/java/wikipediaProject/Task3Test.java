package wikipediaProject;

import org.testng.annotations.Test;

import pom.HomePage;
import pom.SettingsPage;

public class Task3Test extends BaseTest{
	@Test
	public void test1() throws InterruptedException {
		HomePage obj =  new HomePage(driver);
		obj.clickOnTheElement(obj.getOverflowBtn());
		Thread.sleep(1000);
		obj.clickOnTheElement(obj.getOverflowSettings());
		Thread.sleep(1000);
	}
	
	@Test
	public void test2() throws InterruptedException {
		SettingsPage set = new SettingsPage(driver);
		set.clickOnTheElement(set.getImageToggleBtn());
		Thread.sleep(1000);
		set.clickOnTheElement(set.getLinkPreviewBtn());
		Thread.sleep(1000);
		set.clickOnTheElement(set.getUsageReportsBtn());
		Thread.sleep(1000);
		set.clickOnTheElement(set.getCrashReportsBtn());
		Thread.sleep(1000);
		set.clickOnTheElement(set.getNavigateUpBtn());
		Thread.sleep(1000);
	}
}
