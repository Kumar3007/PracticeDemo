package MOCK;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	
	@Test(dataProvider="dataset")
	public void test(char dp)
	{
		System.out.println(dp+" ");
	}
	
	@DataProvider
	public Object dataset()
	{
		Object[][] dataset = new Object[4][1];
				dataset[0][0]='A';
				dataset[1][0]='B';
				dataset[2][0]='C';
				dataset[3][0]='D';
				return dataset;
		
	}

}
