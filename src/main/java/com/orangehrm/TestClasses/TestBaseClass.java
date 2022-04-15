package com.orangehrm.TestClasses;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import com.orangehrm.POMClasses.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;
public class TestBaseClass {

	public static WebDriver driver;
	public static Logger log;
	@BeforeTest
	public void set() {
		log=Logger.getLogger("OrangeHRM");
	    PropertyConfigurator.configure("log4j.properties");
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		log.info("Browser open");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		log.info("URL open");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@AfterTest
	public void end() {
		driver.quit();
		log.info("Browser Close");
	}

       }
 	
	


