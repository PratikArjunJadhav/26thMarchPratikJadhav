package excelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile = new File("C:\\Users\\HP\\Desktop\\class data\\Selenium\\Book2.xlsx");
		
           Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
          
           //How to count total no of rows
           
           int TotalNumberOfRows = mySheet.getLastRowNum();
           int rowCount = TotalNumberOfRows;
           System.out.println("Total number of Rows are "+rowCount);
           
          short TotalNumberOfCell = mySheet.getRow(TotalNumberOfRows).getLastCellNum();
           
         int Cellcount = TotalNumberOfCell-1;
         System.out.println("Total number of Cells are "+Cellcount);
         System.out.println("========================================");
         for(int i=0; i<=rowCount; i++)
         {
        	 for(int j=0; j<=Cellcount; j++)
        	 {
        		 Cell cellvalue = mySheet.getRow(i).getCell(j);
        	     CellType datatype = cellvalue.getCellType();
        	        
        	    if(datatype==CellType.STRING)  
        	    {
        	    	String value = cellvalue.getStringCellValue();
        	    	System.out.print(value+" ");
        	    	
        	    }
        	    else if(datatype==CellType.NUMERIC)
        	    {
        	    	double value = cellvalue.getNumericCellValue();
        	    	System.out.print(value +" ");
        	    }
        	    else if(datatype==CellType.BOOLEAN)
        	    {
        	    	boolean value = cellvalue.getBooleanCellValue();
        	    	System.out.print(value +" ");
        	    }
        	    else if (datatype== CellType.BLANK);
        	    {
        	    	
        	    	System.out.print(" ");
        	    }
        	 }
        	System.out.println( );
         }
        
	}
         
         
	}


