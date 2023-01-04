package excelreader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public static void main(String[] args) throws Exception {
		
		File f = new File(System.getProperty("user.dir")+"\\KT.xlsx");
		FileInputStream fis = new FileInputStream(f);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh= wb.getSheet("KTCTC");
			XSSFRow row = sh.getRow(2);
			XSSFCell cel = row.getCell(1);
			
			/*String data = cel.getStringCellValue();
			System.out.println(data);
			
			String dd= sh.getRow(0).getCell(1).getStringCellValue();
			System.out.println(dd);*/
			
			int a = sh.getLastRowNum();
			System.out.println(a);
			
			int b = sh.getPhysicalNumberOfRows();
			System.out.println(b);
			
			/*for(int i=0;i<=a;i++)
			{
				
				String dd1= sh.getRow(i).getCell(1).getStringCellValue();
				System.out.println(dd1);
				
			}*/
			
			
			for(int i=0;i<=b;i++)
			{
				
				XSSFRow row1 = sh.getRow(i);
				XSSFCell cel1=row1.getCell(1);
				String data1 = cel1.getStringCellValue();
				
				System.out.println(data1);
				
			}
			
		
	
		
	}

}
