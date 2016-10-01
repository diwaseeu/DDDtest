package Temp;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.commons.logging.Log;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class ReportTest {
	public static WebDriver wd;
	public static ExtentReports report;
	public static ExtentTest  log;

		
	
	@Test (priority=1)
	public void googletest()
	{
		report = new Extentreports(C:\\seleniumWorkspace\\dddTEST\\Reports\\sample/html);
		log = report.starttest("googletest");
		wd = new firefoxdriver();
		wd.get("http://www.google.com);
	}
	
	@Test
	public void bingtest()
	{
		log = report.starttest("bingtest");
		wd.get("http://www.bing.com");
	}
	
	@Test
	public void yahootest()
	{
		log = report.starttest("yahootest");
		wd.get("http://www.yahoo.com/");
	}
@AfterMethod
public void teardown(ITestResult it)
{
	if(it.isSuccess());
	{
		String path=createscreensot(it.getName());
		Log.addscreencapure(path)
		Log.log(logStatus.PASS,"Testcase Pass", path);
		else
		{
			String path=createscreensot(it.getName());
			Log.addscreencapure(path);
			Log.log(logStatus.FAIL,"Testcase fail", path);
		}
		report.endtest(Log);
		report.flush(); 
	}
}

public static String createscreensot(String name)
{
	File scr =((Takescreenshot)wd).getscreenshotas(OutputType.FILE);
	File dst = new File("C:\\seleniumWorkspace\\dddTEST\\Screenshots"+name+".jpg");
	FileUtils.copyFile(scr, dst);
	return dst.toString();
	
	
	
} 

}
