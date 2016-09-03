package com.selenium.scripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


	public class uomng extends  basicng 
	{
	

@Test(dataProvider="udata")
	public void uom(String Uid,String Udes)
	{
		SL.StockUOM(Uid,Udes);
	}
	@DataProvider

	public Object[][] udata()
	{
		Object[][] Obj=new Object[3][2];
		
		Obj[0][0]="100GB23";
		Obj[0][1]="selenium12";
	 
		Obj[1][0]="100GB13";
		Obj[1][1]="selenium12";

		Obj[2][0]="100GB03";
		Obj[2][1]="selenium12";

	     return Obj;
	}
		
	}



