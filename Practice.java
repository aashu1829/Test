package com.acc.dummy.test.selenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	@Test
	public void practiceqa(){
	
	System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	String url ="http://store.demoqa.com/";
	driver.get(url);
	String asdf = driver.getTitle();
	System.out.println("The title of the page is -->"+asdf);
	for (int i=0; i<=asdf.length(); i++){
	System.out.println("The length of the title is --->"+asdf.length());
	
		}	
	String actualurl = driver.getCurrentUrl();
	
	Assert.assertEquals("The expected and the actuals urls are the same", url, actualurl );
	
	String ps = driver.getPageSource();
	int  pslength = ps.length();
	System.out.println("The length of the page source is ---->"+pslength);
	}
	
	
	
}
