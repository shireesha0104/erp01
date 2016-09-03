package com.selenium.testdata;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.selenium.master.stoklib;

public class xlsheet {


	

	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException 
	{

		stoklib SL=new stoklib();
		
		String Res=SL.openApp("http://webapp.qedgetech.com");
         System.out.println(Res);
         Res=SL.Admlgn("admin","master");
	     System.out.println(Res);
	     
	  FileInputStream Fis=new FileInputStream("D:\\shireesha\\selenium\\src\\com\\selenium\\testdata\\UOM.xlsx");
	  
	  XSSFWorkbook wb=new XSSFWorkbook(Fis);
	  XSSFSheet ws=wb.getSheet("Sheet1");
	  
	  int rc=ws.getLastRowNum();
	  for (int i = 1; i<=rc; i++) 
	  {
		  XSSFRow r=ws.getRow(i);
		  
		  XSSFCell c1=r.getCell(0);
		  XSSFCell c2=r.getCell(1);
		  
		  
		  XSSFCell c3=r.createCell(2);
		  
		  String uid=c1.getStringCellValue();
		  String des=c2.getStringCellValue();
		  
		  String res=SL.StockUOM(uid, des);
		  
		  c3.setCellValue(res);
		  FileOutputStream fos=new FileOutputStream("D:\\shireesha\\selenium\\src\\com\\selenium\\results\\res.xlsx");
		  
		  
		
	}


	}

}
