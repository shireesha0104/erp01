package com.selenium.jar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class stockitems {

	

public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://webapp.qedgetech.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		String Expval= "Login";
	     String Actval = driver.findElement(By.id("btnsubmit")).getText();
		if (Expval.equalsIgnoreCase(Actval)) 
		{
		System.out.println("Application launched");	
		}
		else
		{
		}
		 driver.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a"));
		 driver.findElements(By.xpath(".//*[@id='mi_a_stock_categories']/a"));

	}

}
