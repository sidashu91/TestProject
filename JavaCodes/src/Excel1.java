import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel1 {
	
	public static void main(String[] args) throws IOException {
		

		XSSFWorkbook wb = new XSSFWorkbook("D:\\Java\\Workspace\\excelReading.xlsx");
		XSSFSheet sh =  wb.getSheetAt(0); //sheet 1
		
		String data = sh.getRow(0).getCell(0).getStringCellValue(); //get row value value, column value and retrieve the cell value
		data= sh.getRow(0).getCell(1).getStringCellValue();
		
		System.out.println(data);
		
	     wb.close();
		
	}

}
