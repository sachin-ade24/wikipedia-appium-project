package wikipediaProject;

import org.testng.annotations.Test;

import pom.HomePage;

public class Task1Test extends BaseTest{
	
	@Test
	public void test1() throws InterruptedException {
		HomePage obj =  new HomePage(driver);
		obj.clickOnTheElement(obj.getListBtnElement());
		Thread.sleep(3000);
		obj.clickOnTheElement(obj.getHistoryBtnElement());
		Thread.sleep(3000);
		obj.clickOnTheElement(obj.getNearbyBtnElement());
		Thread.sleep(3000);
		obj.clickOnTheElement(obj.getBrowserBtnElement());
		Thread.sleep(3000);
		obj.scrollToTheElement("In the news");
	}
}
