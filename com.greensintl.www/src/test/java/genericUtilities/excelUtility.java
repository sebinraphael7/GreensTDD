package genericUtilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelUtility implements IPathConstant{

	
	public String getSingleDataFromExcel(String sheetName,int rowNum, int cellNum) throws Throwable
	{
		FileInputStream fis=new FileInputStream(IPathConstant.excelFilePath);
		Workbook wb=WorkbookFactory.create(fis);
		String data=wb.getSheet("Sheet1").getRow(rowNum).getCell(cellNum).getStringCellValue();
//		System.out.println(data);
		wb.close();
		fis.close();
		return data;
				
	}
	public int getRowCount(String sheetName) throws IOException
	{
		FileInputStream fis=new FileInputStream(IPathConstant.excelFilePath);
		Workbook wb=WorkbookFactory.create(fis);
		int rowCount=wb.getSheet(sheetName).getLastRowNum();
		wb.close();
		fis.close();
		return rowCount;
	}
	public int getCellCount(String sheetName,int rownum) throws IOException
	{
		FileInputStream fis=new FileInputStream(IPathConstant.excelFilePath);
		Workbook wb=WorkbookFactory.create(fis);
		int cellcount=wb.getSheet(sheetName).getRow(rownum).getLastCellNum();
		wb.close();
		fis.close();
		return cellcount;
	}
	public String getCellData(String sheetName,int rownum,int colnum) throws IOException
	{
		FileInputStream fi = new FileInputStream(IPathConstant.excelFilePath);
		XSSFWorkbook workbook = new XSSFWorkbook(fi);
		XSSFSheet sheet = workbook.getSheet(sheetName);
		XSSFRow row = sheet.getRow(rownum);
		XSSFCell cell = row.getCell(colnum);
		
		DataFormatter formatter = new DataFormatter();
		String data;
		try{
		data = formatter.formatCellValue(cell); //Returns the formatted value of a cell as a String regardless of the cell type.
		}
		catch(Exception e)
		{
			data="";
		}
		workbook.close();
		fi.close();
		return data;
}
}

//can add fis.close
	