package com.Vmetry.NTL.util;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.commons.logging.Log;
import org.openqa.selenium.OutputType;
import org.testng.ITestResult;

import com.Vmetry.NTL.initialize.Initializer;

import Temp.Takescreenshot;

public class screenshotgenerator extends Initializer{
	public void teardown(ITestResult it)
	{
		Object [] data =it.getParameters();
		if(it.isSuccess());
		{
			String path=createscreensot(data[].toString());
			Log.addscreencapure(path);
			Log.log(logStatus.PASS,"Testcase Pass", path);
			else
			{
				String path=createscreensot(it.getName());
				Log.addscreencapure(path)
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
