package sampleCode;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;






public class ExcelData {
	// TODO Auto-generated method stub
	
	//Supposing a workbook having a sheet name 'demo'.
	//The 'demo' sheet contains a column 'data', under 'data' there are 2 fields present username and password.

	public String getData (String testcaseName) throws IOException 
	{
		String s;
		FileInputStream fis = new FileInputStream("C:\\Users\\User\\Desktop\\Book1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		Iterator<Sheet> sheets = workbook.iterator();
		while (sheets.hasNext()) {
			Sheet main = sheets.next();
			if (main.getSheetName().equalsIgnoreCase("demo")) {

				// Till here we got to the required sheet, next find the required column
				Iterator<Row> rows = main.iterator();
				Row firstRow = rows.next();
				Iterator<Cell> cells = firstRow.cellIterator();
				int columnIndex = 0;
				int k = 0;
				while (cells.hasNext()) {
					Cell cell = cells.next();
					if (cell.getStringCellValue().equalsIgnoreCase("data")) {
						columnIndex = k;
					}
					k++;
				}

				// Till here we got the column number, now we have to traverse all rows for this
				// particular column
				
				while (rows.hasNext()) 
				{
					Row r = rows.next();
					if (r.getCell(columnIndex).getStringCellValue().equals(testcaseName))
					{
						Iterator<Cell> mainCells = r.cellIterator();
						while (mainCells.hasNext()) {
							Cell mainCell = mainCells.next();
							s = mainCell.getStringCellValue();
						}
					}
					

				}
			}
			
			
		}return "";
		
		
	}
}