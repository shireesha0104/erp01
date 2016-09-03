package com.selenium.master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class hpage {
	@FindBy(xpath=".//*[@id='mi_a_suppliers']/a") WebElement sup;
	@FindBy(xpath=".//*[@id='mi_a_purchases']/a") WebElement pur;
	@FindBy(xpath=".//*[@id='mi_a_stock_items']/a") WebElement stkitms;
	@FindBy(xpath=".//*[@id='mi_a_stock_categories']/a") WebElement scrtegory;
	
	 public void suplier()
	 {
		sup.click();
		
	 }
 public void purchase(){
	 pur.click();
	 
 }
 public void stitem()
 {
	 stkitms .click();
 }
   public void  stcategory(WebDriver cs){
	   Actions act = new Actions(cs);
	   act.moveToElement(stkitms).build().perform();
	   scrtegory.click();
	   
   }
 
	
}


