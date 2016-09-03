package com.selenium.master;

import java.io.IOException;

public class Exelib {

	public static void main(String[] args) throws IOException 
	{

		stoklib SL=new stoklib();
		String Res=SL.openApp("http://webapp.qedgetech.com");
         System.out.println(Res);
         Res=SL.Admlgn("admin","master");
	     System.out.println(Res);
	     
	    /* Res= SL.Suppliers("num", "name", "Adress", "city", "country", "Cnctperson"," Phnum", "Email"," mobilenum", "Notes");
	    		 
	     System.out.println(Res);*/
	     Res=SL.LogOut();
	     SL.clsApp();
	}
}
