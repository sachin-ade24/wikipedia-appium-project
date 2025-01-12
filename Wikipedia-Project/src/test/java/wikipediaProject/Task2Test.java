package wikipediaProject;

import org.testng.annotations.Test;

import pom.HomePage;

public class Task2Test extends BaseTest{
	
	@Test
	public void test1() throws InterruptedException {
		HomePage obj =  new HomePage(driver);
		obj.clickOnTheElement(obj.getSearchField());
		Thread.sleep(1500);
		obj.typeIntoTheTextbox("New York");
		for(int i=1; i<=2; i++) {
			obj.clickOnTheElement(obj.getCloseBtn());
			Thread.sleep(1500);
		}
	}
}
