package com.acc.dummy.test.selenium;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Practice7 {
	
	@Test
		public void prac7() {
			System.setProperty("webdriver.gecko.driver", "C:\\SeleniumDrivers\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://toolsqa.wpengine.com/automation-practice-table");
						
			
			String sRowValue = "Clock Tower Hotel";
			
			
			for (int i=1;i<=5;i++){
				String sValue = null;
				sValue = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[" + i + "]/th")).getText();
					if(sValue.equalsIgnoreCase(sRowValue)){
						
						for (int j=1;j<=5;j++){
							String sColumnValue= driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[" + i + "]/td["+ j +"]")).getText();
							System.out.println(sColumnValue);
						}
					break;
					}
				}
			driver.close();
		}
	}


