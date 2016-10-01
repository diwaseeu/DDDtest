package com.Vmetry.NTL.Testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Vmerty.NTL.pages.HomePage;
import com.Vmetry.NTL.initialize.Initializer;
import com.thoughtworks.selenium.webdriven.commands.Click;

public class HomePageTest extends Initializer{
	
	@Test
	public void Testhomepage() throws IOException{
		
		intialize();
		log= report.starttest(data);
		//url 
	//	wd.get(envprop.getProperty("URL"));
	    wd.get("http://www.ntltaxi.com/");
		HomePage.EnterUsername("arun");
		HomePage.EnterNumber("9840450500");
		HomePage.EnterPickup("PARRYS");
		HomePage.EnterDrop("ADYAR");
		HomePage.EnterSelect("Sedan");
		HomePage.EnterClick();
		
		
	}
	@BeforeTest
	public void setup()
	{
		
	}
	
	@Dataprovider
	//First set
	data[0][0] = "Homepage_dataset1"
	data[0][1] = "username"
}

@AftetMethod
public void teardown(iTresult it)
{
	screenshotgenerator.getscreenshot(it);
}