package excelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// create excel sheet and pass the path along with name and extension in File Object
		File myfile = new File("C:\\Users\\HP\\Desktop\\class data\\Selenium\\Book2.xlsx");

         // Using WorkBookFactory class read excel sheet
		
		//1. how to read String value
         
		String name = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(name);
		
		//2. how to read String  value
		
		String name1 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		System.out.println(name1);
		
		//3. how to read numeric  value
		
		double Number = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(1).getCell(0).getNumericCellValue();
		
		System.out.println(Number);
		
		
		double num1 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(1).getCell(1).getNumericCellValue();
		System.out.println(num1);
		
		
		
		 double MYCHAR = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(2).getCell(1).getNumericCellValue();
	
	       System.out.println(MYCHAR);
	
		//4. how to read Boolean value
		
		boolean bvalue = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(4).getCell(0).getBooleanCellValue();
		System.out.println(bvalue);
	
		boolean bvalue1 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(4).getCell(1).getBooleanCellValue();
		System.out.println(bvalue1);
	
		//4. how to read char value
		
		
		String name122 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(3).getCell(1).getStringCellValue();
		System.out.println(name122);
	
		
	}

}
