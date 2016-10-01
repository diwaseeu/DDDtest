package com.Vmetry.NTL.initialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Temp.ExtentReports;
import Temp.ExtentTest;



public class Initializer {
	
//extents report
public static ExtentReports report;
public static ExtentTest  log;
//properties for environment	
public static FileInputStream envfis = null;
public static Properties envprop = null;
public static WebDriver wd= null;

//properties for locator
public static FileInputStream locfis = null;
public static Properties locprop = null;

//C:\seleniumWorkspace\dddTEST\src\test\java\com\Vmetry\NTL\config\locator.properties

	public static void intialize() throws IOException
	{
		report = new Extentreports(C:\\seleniumWorkspace\\dddTEST\\Reports\\sample\\html);
		envfis=new FileInputStream(new File("C:"+File.separator+"seleniumWorkspace"+File.separator+"dddTEST"+File.separator+"src"+File.separator+"test"+File.separator+"java"+File.separator+"com"+File.separator+"Vmetry"+File.separator+"NTL"+File.separator+"config"+File.separator+"env.properties"));
		envprop= new Properties();
		envprop.load(envfis);
		//
		locfis=new FileInputStream(new File("C:"+File.separator+"seleniumWorkspace"+File.separator+"dddTEST"+File.separator+"src"+File.separator+"test"+File.separator+"java"+File.separator+"com"+File.separator+"Vmetry"+File.separator+"NTL"+File.separator+"config"+File.separator+"locator.properties"));
		locprop= new Properties();
		locprop.load(locfis);
		
		//System.out.println(envprop.getProperty("URL")); // to verify the properties value is fetched
		if(envprop.getProperty("BROWSER").equals("firefox"))
		{
			 wd = new FirefoxDriver();
		}
		
			
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}
	public static WebElement getWebelementByXpath(String xpath)
	{
		return wd.findElement(By.xpath(locprop.getProperty(xpath)));
		
		
	}
}
