package excelreader;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader5 {

	public static void main(String[] args) throws Exception {

		File f = new File(System.getProperty("user.dir")+"\\KT.xlsx");
		FileInputStream fis = new FileInputStream(f);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh= wb.getSheet("KTCTC");
			
			int a= sh.getLastRowNum();
			
			for(int i=0;i<=a;i++)
			{
				XSSFRow rw= sh.getRow(i);
				
				XSSFCell cel = rw.getCell(0);
				printCellValueAccordingToCellType(cel);
				cel = rw.getCell(1);
				printCellValueAccordingToCellType(cel);
				
			}
	}
	
			
			
				public static void printCellValueAccordingToCellType(XSSFCell cel)
				{
					
				
				switch (cel.getCellType())
				{
					case STRING : 
					{
						System.out.println(cel.getStringCellValue());
						break;
					}
				
					case BOOLEAN : 
					{
						System.out.println(cel.getBooleanCellValue());
						break;
					}
					case NUMERIC : 
					{
						System.out.println(cel.getNumericCellValue());
						break;
					}
					default : 
					{
						System.out.println("Unexpected cell type");
						break;
					}
					
				}
			}

	

}
