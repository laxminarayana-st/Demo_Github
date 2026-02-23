package feb23;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFShapeGroup;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RowsCellCount {

	public static void main(String[] args) throws Throwable 
	{
		//Read path of excel
		FileInputStream fi = new FileInputStream("D:/MyFile.xlsx");
		
		//get workbook from above file
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		
		//get sheet from wb;
		//XSSFSheet
		

	}

}
