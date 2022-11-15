package TestYantra;

public class MissingElementInArray {
	
	public static void main(String[] args) {
		int[] a= {1,2,4,5};
			int sum=0;
			int sum1=0;
			for(int i=0;i<=a.length-1;i++)
			{
				sum=sum+a[i];
			}
		for(int i=1;i<=5;i++)
		{
			sum1=sum1+a[i];
		}
		
	System.out.println(sum1);
		
}
}