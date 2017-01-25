package com.acc.dummy.test.selenium;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice4 {
	
	@Test
	public void prac(){
	System.setProperty("webdriver.gecko.driver", "C:\\SeleniumDrivers\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	
	driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
	
	List<WebElement> radiobuttons = driver.findElements(By.name("sex"));
	
	boolean radiovalue ;
	radiovalue = radiobuttons.get(0).isSelected();
	System.out.println("The value of the radio button is --->"+radiovalue);
	if(radiovalue = false){
		radiobuttons.get(0).click();
		System.out.println("The value in the if loop is-->" +radiobuttons.get(1));
	}
	else{
		radiobuttons.get(1).click();
		System.out.println("The value in the else loop is-->" +radiobuttons.get(0));
	}
	
	}
}
