package com.acc.dummy.test.selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice2 {

	@Test
	public void practice(){
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumDrivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		String url ="http://demoqa.com/frames-and-windows/";
		driver.get(url);
		driver.findElement(By.xpath(".//*[@id='tabs-1']/div/p/a")).click();
		driver.close();		
		
	}
}
