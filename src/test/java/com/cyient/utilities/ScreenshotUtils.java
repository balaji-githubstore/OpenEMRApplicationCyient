package com.cyient.utilities;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtils {
	
	
	public static void takeScreenShot(WebDriver driver)
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File file= ts.getScreenshotAs(OutputType.FILE);	
		Date date=new Date();
		String sDate=date.toString().replace(":", "-");
		file.renameTo(new File("screenshot/sc_"+sDate+".png"));
	}

}
