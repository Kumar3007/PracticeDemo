package CoreJavaForAT;

public class I_ArraysDemo {
	public static void main(String[] args) {
		
		
		//a container which stores multiple values of similar data
		
		int a[]=new int[5];//Declare the array and allocates memory for the value
		
		//initilization
		a[0]=8;
		a[1]=9;
		a[2]=7;
		a[3]=5;
		a[4]=10;
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);//retrieve
		}
		
		//Using Literals
		int b[]= {9,8,7,6,5,4,3,2};
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
		
	}

}
