package CoreJavaForAT;

public class J_Multidimensional {
	
	
	public static void main(String[] args) {
		
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		//System.out.println(a[2][1]);
		
		for (int i = 0; i < a.length; i++) //row
		{
		
			for (int j = 0; j < a.length; j++) {//col
				System.out.println(a[i][j]);
			}
		}

}
}