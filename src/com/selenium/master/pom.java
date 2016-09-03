package com.selenium.master;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class pom {

@org.testng.annotations.Test
public void Lexe()
{
	WebDriver driver=new FirefoxDriver();
	driver.get("http://webapp.qedgetech.com");
	driver.manage().window().maximize();
	
	loginpage LP=PageFactory.initElements(driver,loginpage.class);
	LP.Adminlgn("admin","master");
	hpage Hp=PageFactory.initElements(driver,hpage.class);
	Hp.suplier();
	Hp.purchase();
	Hp.stitem();
	
}
}