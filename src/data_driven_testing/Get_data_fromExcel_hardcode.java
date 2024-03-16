package data_driven_testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Get_data_fromExcel_hardcode {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream("./data/TestScript.xlsx");
	Workbook wb= WorkbookFactory.create(fis);
	Cell data = wb.getSheet("CreateCustomer").getRow(1).getCell(3);
	System.out.println(data);
	
	
}
}
