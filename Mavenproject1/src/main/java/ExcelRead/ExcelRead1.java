package ExcelRead;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead1 {
	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet s;
	
	public static String getStringData(int a,int b) throws IOException
	{
		f=new FileInputStream("C:\\Users\\deepa\\OneDrive\\Desktop\\Book1.xlsx");//path of file
		w=new XSSFWorkbook(f);
		s=w.getSheet("Sheet1");
		XSSFRow r=s.getRow(a);//s ill ninn row get  cheyan a index
		XSSFCell c=r.getCell(b);//to get column
		return c.getStringCellValue();//return string value in cell
	}
	public static String getIntegerData(int a,int b) throws IOException 
	{
		f=new FileInputStream("C:\\Users\\deepa\\OneDrive\\Desktop\\Book1.xlsx");
		w=new XSSFWorkbook(f);
		s=w.getSheet("Sheet1");
		XSSFRow r=s.getRow(a);
		XSSFCell c=r.getCell(b);
		int y= (int) c.getNumericCellValue();//type casting-one datatype to another(int illot convert cheyan)
		return String.valueOf(y);
	}
}
