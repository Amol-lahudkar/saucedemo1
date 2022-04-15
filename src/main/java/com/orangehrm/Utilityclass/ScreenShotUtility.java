package com.orangehrm.Utilityclass;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotUtility {
	public static void ScreenShot(WebDriver driver) throws IOException {
		Date d=new Date();
		String date=d.toString().replace(":", "-");
		TakesScreenshot ss =(TakesScreenshot)driver;
		File source=ss.getScreenshotAs(OutputType.FILE);
		File destiny=new File("C:\\Users\\user\\eclipse-workspace\\my programs\\SauceDemo1\\src\\main\\java\\screenshots");
		FileHandler.copy(source, destiny);

}
}