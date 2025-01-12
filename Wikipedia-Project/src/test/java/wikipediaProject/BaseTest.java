package wikipediaProject;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import pom.HomePage;

public class BaseTest {
	
	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	
	@BeforeClass
	public void configureAppium() throws MalformedURLException, URISyntaxException {
		service = new AppiumServiceBuilder().withAppiumJS(
				new File("C://Users//sbaburao//AppData//Roaming//nvm//v20.12.0//node_modules//appium//lib//main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start();
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Sachin Pixel 3a API 35");
		options.setApp(
				"C://Users//sbaburao//eclipse-workspace//Wikipedia-Project//src//test//java//resources//WikipediaSample.apk");
		driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		clickOnOk();
	}
	
	public void clickOnOk() {
		HomePage obj =  new HomePage(driver);
		obj.clickOnTheElement(obj.getOkBtnElement());
	}
	
	@AfterClass
	public void tearDown() {
	    driver.quit();
	    service.stop();
	}

}
