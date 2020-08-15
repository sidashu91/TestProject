import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingWholeFile 
{
public static void main(String[] args) throws IOException 
{
	
	XSSFWorkbook wb = new XSSFWorkbook("D:\\Java\\Workspace\\excelReading.xlsx");
	XSSFSheet sh =  wb.getSheetAt(0); 
	//First Sheet
	
	DataFormatter dfr = new DataFormatter();
	
	
	for (Row r : sh) 
	{
		
		for (Cell c : r) 
		{
		String data1=	dfr.formatCellValue(c);
		System.out.print(data1+"\t");			
		}
		System.out.println();
	}
	
	
	
	
	
	
	
}

	
	
	
	
}
