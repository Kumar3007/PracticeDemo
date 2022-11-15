package Practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class P_ReadAndWriteDataFromExcelSimultaneously 
  {
   @Test
   public void ExcelData() throws Throwable, Throwable
   {
	   String file = ".\\data\\practice.xlsx";
	   FileInputStream fis= new FileInputStream(file);
	   Workbook wb = WorkbookFactory.create(fis);
	  Sheet sh = wb.getSheet("Sheet2");
	  String value = sh.getRow(0).getCell(0).getStringCellValue();
	  sh.createRow(1).createCell(0).setCellValue("Selenium");
	  System.out.println(value);
	  
	  FileOutputStream fout= new FileOutputStream(file);
	  wb.write(fout);
	  wb.close();
	  
   }
}
