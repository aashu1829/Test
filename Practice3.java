package com.acc.dummy.test.selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice3 {
	
	
	@Test
	public void TagName(){
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumDrivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
		 driver.findElement(By.partialLinkText("Partial")).click();
		 String sClass = driver.findElements(By.tagName("button")).toString();
			System.out.println(sClass);
	}

}
