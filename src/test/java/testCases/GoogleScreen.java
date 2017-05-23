package testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class GoogleScreen {

public static WebDriver wd;
public static void openBrowser(){
		wd=new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.co.in");
	}
@AfterMethod
public static void screenShot() throws IOException{
		File src=((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("D:\\SeleniumWorkSpace\\Batch38\\GoogleTester\\Screenshot"));	
	}
}
