package com.actitime.generics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Filelab {
	public String getPropertyData(String udata) throws IOException
	{
		FileInputStream fis = new FileInputStream("./data/username admin.property");	
		Properties p = new Properties();
		p.load(fis);
		String data = p.getProperty(udata);
		return data;
	}
	public String getExcelData(String sheetname, int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./data/TestScript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}

	public void setExcelData(String sheetname, int row, int cell, String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./data/TestScript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheetname).getRow(row).getCell(cell).setCellValue(data);
		FileOutputStream fos = new FileOutputStream("./data/TestScript.xlsx");
		wb.write(fos);

	}
}

