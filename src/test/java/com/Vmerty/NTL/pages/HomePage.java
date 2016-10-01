package com.Vmerty.NTL.pages;

import com.Vmetry.NTL.initialize.Initializer;

public class HomePage extends Initializer {



public static void EnterUsername(String username){
	
	getWebelementByXpath("HOMEPAGE_TYPE_USERNAME_XPATH").sendKeys(username);
	
}

public static void EnterNumber(String number){
	
	getWebelementByXpath("HOMEPAGE_TYPE_MOBILE_XPATH").sendKeys(number);
	
}

public static void EnterPickup(String pickup){
	
	getWebelementByXpath("HOMEPAGE_TYPE_PICKUP_XPATH").sendKeys(pickup);
	
}

public static void EnterDrop(String drop){
	
	getWebelementByXpath("HOMEPAGE_TYPE_DROP_XPATH").sendKeys(drop);
	
}

public static void EnterSelect(String select){
	
	getWebelementByXpath("HOMEPAGE_SELECT_DROPDOWN_XPATH").sendKeys(select);
	
}

public static void EnterClick(){
	
	getWebelementByXpath("HOMEPAGE_CLICK_CHECKBOX_XPATH").click();
	
}












}