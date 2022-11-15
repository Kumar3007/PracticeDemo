package MOCK;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DP {
	
		@Test(dataProvider="dataset")
		public void test(char dp,String Ku)
		{
			System.out.print(dp+" "+Ku+" ");
		}
	
		@DataProvider
	public Object dataset()
	{
		Object[][] dataset=new Object[5][2];
			dataset[0][0]='A';
			dataset[0][1]="Anil";
			
			dataset[1][0]='B';
			dataset[1][1]="ball";
			
			dataset[2][0]='C';
			dataset[2][1]="cat";
			
			dataset[3][0]='D';
			dataset[3][1]="dog";
			
			dataset[4][0]='E';
			dataset[4][1]="kumar";
			
			return dataset;
					
	}
}
