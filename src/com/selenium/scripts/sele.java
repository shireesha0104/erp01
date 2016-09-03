package com.selenium.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public  class sele {
	public static void main (String[]args){
	WebDriver driver = new FirefoxDriver();
	driver.get("http://webapp.qedgetech.com");
	driver.manage().window().maximize();
	String Expval= "Login";
     String Actval = driver.findElement(By.id("btnsubmit")).getText();
	if (Expval.equalsIgnoreCase(Actval)) 
	{
	System.out.println("Application launched");	
	}
	else
	{
	}
	driver.findElement(By.id("btnreset")).click();
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.id("password")).sendKeys("master");
	driver.findElement(By.id("btnsubmit")).click();
	

	 Actions act=new Actions(driver);
	 act.moveToElement(driver.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a"))).build().perform();
	 driver.findElement(By.xpath(".//*[@id='mi_a_stock_categories']/a")).click();
	 driver.findElement(By.xpath("//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")).click();
	 driver.findElement(By.xpath(".//*[@id='x_Category_Name']")).sendKeys("s");
	 driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]")).click();
	driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]")).click();		 


	}

	
	}



