package com.acc.dummy.test.selenium;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice6 {
	
	@Test
	public void prac6() throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumDrivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
		
		Select oselect = new Select(driver.findElement(By.name("selenium_commands")));
		oselect.selectByIndex(0);
		Thread.sleep(2000);
		
		oselect.deselectByIndex(0);
		Thread.sleep(2000);
		
		oselect.selectByVisibleText("Navigation Commands");
		Thread.sleep(2000);
		
		oselect.deselectByVisibleText("Navigation Commands");
	
	
		List<WebElement> listo = oselect.getOptions();
		
		for(int i=0; i<=listo.size()-1; i++){
			
			System.out.println("The list in the multiple selection is--->" +oselect.getOptions().get(i).getText());
		}
		
		
		
		
		
		
	}

}
