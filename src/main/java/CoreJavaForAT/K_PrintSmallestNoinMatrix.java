package CoreJavaForAT;

public class K_PrintSmallestNoinMatrix {
	
	/*
	 * 5 6 7
	 * 7 3 1
	 * 2 4 8
	 */
	public static void main(String[] args) {
		
	
	int a[][]= {{5,6,7},{7,3,1},{2,4,8}};
	int min=a[0][0];
	
	for(int i=0;i<3;i++)
	{
		for (int j = 0; j < 3; j++) {
			
			if(a[i][j]<min)
			{
				min=a[i][j];
			}
		}
	}
System.out.println(min);
}
}