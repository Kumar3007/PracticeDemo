package CoreJavaForAT;

public class L_MaximumNoInMatrix {
	/*
	 * 5 6 7
	 * 7 3 1
	 * 2 4 8
	 */
	public static void main(String[] args) {
		
	
	int a[][]= {{5,6,7},{7,3,1},{2,4,8}};
	int max=a[0][0];
	
	for(int i=0;i<3;i++)
	{
		for (int j = 0; j < 3; j++) {
			
			if(a[i][j]>max)
			{
				max=a[i][j];
			}
		}
	}
System.out.println(max);
}
}
