package Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GenericUtility.ExcelUtility;

public class N_DPandExcel {
	
	@Test(dataProvider="dataset")
	public void test(String Username,String Password,String phno)
	{
		System.out.println(Username+" "+Password+" "+phno);
	}
	
	@DataProvider
	public Object dataset() throws IOException
	{
		File excelfile = new File(".\\data\\Mock.xlsx");
		FileInputStream fis = new FileInputStream(excelfile);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheet("sheet2");
				int noOfRows = sheet.getPhysicalNumberOfRows();
				int noOfColoumns = sheet.getRow(0).getLastCellNum();
				
			Object[][] dataset = new Object[noOfRows-1][noOfColoumns];
			for(int i=0;i<noOfRows-1;i++)
			{
				for(int j=0;j<noOfColoumns;j++)
				{
					DataFormatter df = new DataFormatter();
					dataset[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
				}
			}
		workbook.close();
		fis.close();
		
		return dataset;
	}

}
