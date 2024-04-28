package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileRead {
	
	String filepath ="C:\\Users\\kumar\\git\\FITAPorurSeleniumWeekEnd\\Input\\MakeMyTrip.xlsx";
	String outfilepath ="C:\\Users\\kumar\\git\\FITAPorurSeleniumWeekEnd\\Input\\output.xlsx";
	List<Object> ls = new ArrayList<>();
	public void ExcelfileRead() throws IOException
	{
		File F = new File(filepath);
		FileInputStream Fs = new FileInputStream(F); // it will read all type os files
		XSSFWorkbook wbk = new XSSFWorkbook(Fs);
		//Sheet sheet =wbk.getSheet("ValidData");
		Sheet sheet =wbk.getSheetAt(0);
		int totalRows =sheet.getPhysicalNumberOfRows();
		for(int i=0;i<totalRows;i++)
		{
			Row row =sheet.getRow(i);
			int totalColumns =row.getLastCellNum();
			for(int j =0 ;j <totalColumns;j++)
			{
				Cell eachcell = row.getCell(j);
				ls.add(ReadDataAsSuch(eachcell));
				System.out.print(ReadDataAsSuch(eachcell));
				System.out.print(" ");
			}
			System.out.println("");
		}
		Fs.close();
	}
	
	public void ExcelfileWrite() throws IOException
	{
		String[] value = {"apple","orange","watermelon"};
		File F = new File(outfilepath);
		FileOutputStream Fs = new FileOutputStream(F); // it will read all type os files
		XSSFWorkbook wbk = new XSSFWorkbook(); // temp workbook is getting created
		//Sheet sheet =wbk.getSheet("ValidData");
		Sheet sheet =wbk.createSheet("output"); // sheet will be created in the temp workbook
		int totalRows =1;
		for(int i=0;i<totalRows;i++)
		{
			Row row =sheet.createRow(i);
			int totalColumns =value.length;
			for(int j =0 ;j <totalColumns;j++)
			{
				Cell eachcell = row.createCell(j);
				eachcell.setCellValue(value[j]);
			}
			System.out.println("");
		}
		wbk.write(Fs);
		Fs.close();
	}
	
	public Object ReadDataAsSuch(Cell cellValue)
	{
		if(cellValue.getCellType()==CellType.STRING)
		{
			return cellValue.getStringCellValue();
		}
		else if(cellValue.getCellType()==CellType.NUMERIC)
		{
			DataFormatter data =  new DataFormatter();
			return data.formatCellValue(cellValue);
			//return cellValue.getNumericCellValue();
		}
		return null;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExcelFileRead E = new ExcelFileRead();
		E.ExcelfileRead();
		E.ExcelfileWrite();
	}

}
