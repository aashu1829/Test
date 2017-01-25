package com.acc.dummy.test.selenium;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice5 {
	
	@Test
	public void pracr(){
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumDrivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
		
		List<WebElement> checkboxes=driver.findElements(By.name("tool"));
		
		for(int i=0; i<=checkboxes.size(); i++){
			
			String valuecheckboxes = checkboxes.get(i).getAttribute("value");
			System.out.println("The value of the checkboxes is ---->"+valuecheckboxes);
			
		
			
			if (valuecheckboxes.equalsIgnoreCase("qtp")){

				checkboxes.get(i).click();
				System.out.println("the checkboxes are clicked");

				 // This will take the execution out of for loop

				 

				 }
		}
		
	}

}
