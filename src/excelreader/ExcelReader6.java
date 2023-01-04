package excelreader;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader6 {

	public static void main(String[] args)throws Exception {
		File f = new File(System.getProperty("user.dir")+"\\KT.xlsx");
		FileInputStream fis = new FileInputStream(f);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh= wb.getSheet("KTCTC");
			
			int a= sh.getLastRowNum();
			
			for(int i=0;i<=a;i++)
			{
				XSSFRow rw= sh.getRow(i);
				
				XSSFCell cel = rw.getCell(0);
				String k= printCellValueAccordingToCellType(cel);
				cel = rw.getCell(1);
				String v = printCellValueAccordingToCellType(cel);
				System.out.print(k+"=");
				System.out.print(v);
				System.out.println();
			}
	}
	
			
			
				public static String printCellValueAccordingToCellType(XSSFCell cel)
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


