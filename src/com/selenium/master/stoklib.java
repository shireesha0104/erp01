package com.selenium.master;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class stoklib 
{

public static final String Suplier = null;
public static final CharSequence supplier07 = null;
public static WebDriver driver;
public static String Expval,Actval;
public static Properties pr;
public static FileInputStream fis;


public String openApp(String Url) throws IOException
{
	fis=new FileInputStream("D:\\shireesha\\selenium\\src\\com\\selenium\\properities\\rep.properties");
	pr=new Properties();
	pr.load(fis);
	
	
	Expval="Login";
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get(Url);
	Actval=driver.findElement(By.id(pr.getProperty("login"))).getText();
    if (Expval.equalsIgnoreCase(Actval))
    {
	//System.out.println("pass");
	  return "Pass";
    }
    else
    {
    	//System.out.println("Fail");
       return "Fail";
    }
}

public String Admlgn(String Un,String Pwd)
{
	Expval="Administrator";
	driver.findElement(By.id(pr.getProperty("reset"))).click();
	driver.findElement(By.id(pr.getProperty("uname"))).sendKeys(Un);
	driver.findElement(By.id(pr.getProperty("paswd"))).sendKeys(Pwd);
	driver.findElement(By.id(pr.getProperty("submit"))).click();
	 Actval=driver.findElement(By.xpath(pr.getProperty("actval"))).getText();
 	    if(Expval.equalsIgnoreCase(Actval))
 	       {
 			//System.out.println("Stock accounting home page displayed");
 	      return "pass";
 	       }
 	       else
 	       {
 	    	//System.out.println("Stock accounting home page not displayed");
 	       return "Fail";
 	       }
}
public String Suppliers(String num, String name, String Adress, String city, String country, String  Cnctperson, String Phnum, String Email, String mobilenum, String Notes )
{
	
	Expval="Add succeeded";
	driver.findElement(By.xpath(pr.getProperty("supp"))).click();
	driver.findElement(By.xpath(pr.getProperty("Sadd"))).click();
	
	driver.findElement(By.id(pr.getProperty("number']"))).sendKeys(num);
	
	driver.findElement(By.id(pr.getProperty("name"))).sendKeys(name);
	driver.findElement(By.id(pr.getProperty("Adress"))).sendKeys(Adress);
	driver.findElement(By.id(pr.getProperty("city'"))).sendKeys(city);
	
	driver.findElement(By.id(pr.getProperty("country'"))).sendKeys(country);
	driver.findElement(By.id(pr.getProperty("ctactperson'"))).sendKeys(Cnctperson);
	driver.findElement(By.id(pr.getProperty("phnum"))).sendKeys(Phnum);
	
	driver.findElement(By.id(pr.getProperty("email"))).sendKeys(Email);
	driver.findElement(By.id(pr.getProperty("mobnum'"))).sendKeys(mobilenum);
	driver.findElement(By.id(pr.getProperty("notes'"))).sendKeys(Notes);
	 Actval = driver.findElement(By.xpath(pr.getProperty("add"))).getText();
	 if(Expval.equalsIgnoreCase(Actval))
      {
		//System.out.println("Stock accounting home page displayed");
     return "pass";
      }
      else
      {
   	//System.out.println("Stock accounting home page not displayed");
      return "Fail";
      }
	
	


	}




public String StockUOM(String UOMID,String uomdescription)
{
	   Expval ="Add succeeded";

	   Actions act =new Actions(driver);
    act.moveToElement(driver.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a"))).build().perform();
    
   driver.findElement(By.xpath(".//*[@id='mi_a_unit_of_measurement']/a")).click();
   
   driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")).click();
   
   driver.findElement(By.id("x_UOM_ID")).sendKeys(UOMID);
   
   driver.findElement(By.id("x_UOM_Description")).sendKeys(uomdescription);
   
   driver.findElement(By.id("btnAction")).click();
   
   driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button[1]")).click();
   
   Actval=driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[3]/div/div")).getText();
   Sleeper.sleepTightInSeconds(2);
   
   driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button")).click();
   
   if (Expval.equalsIgnoreCase(Actval)) 
   {
		return "pass";
	}
   else
   {
  
	   return "fail";
   }
}



public String LogOut() {
driver.findElement(By.xpath(".//*[@id='mi_logout']/a")).click();
List<WebElement> li= driver.findElements(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button[1]"));
for (int i = 0; i < li.size(); i++) {
	if (li.get(i).getText().equalsIgnoreCase("OK!")) {
	li.get(i).click();
	break;
	}
	
}
if (driver.findElement(By.id("btnsubmit")).isDisplayed()) {
	return "pass";
}
else{
	return "fail";
}
	
	
	
}
public void clsApp()
{
	driver.quit();
}

}




	







		 
		
	
