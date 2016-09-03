package com.selenium.scripts;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.selenium.master.stoklib;

public class basicng {

 public static stoklib SL=new stoklib();
	
  @BeforeTest
  public void beforeTest() 
  {
  SL.Admlgn("admin","master");
  }

  @AfterTest
  public void afterTest() 
  {
    SL.LogOut();
  }

  @BeforeSuite
  public void beforeSuite() throws IOException 
  {
  SL.openApp("http://webapp.qedgetech.com");
  }

  @AfterSuite
  public void afterSuite() 
  {
     SL.clsApp();
  }





	

}


