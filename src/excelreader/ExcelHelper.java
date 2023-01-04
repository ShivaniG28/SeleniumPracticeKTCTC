package excelreader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelHelper {
	
		
	
		
		
			private static String printCellValueAccordingToCellType(XSSFCell cel)
			{
				
			Object data = null;
			switch (cel.getCellType())
			{
				case STRING : 
				{
					data = cel.getStringCellValue();
					break;
				}
			
				case BOOLEAN : 
				{
					data = cel.getBooleanCellValue();
					break;
				}
				case NUMERIC : 
				{
					data =  cel.getNumericCellValue();
					break;
				}
				default : 
				{
					System.out.println("Unexpected cell type");
					break;
				}
				
			}
			return data.toString();
		}


}
