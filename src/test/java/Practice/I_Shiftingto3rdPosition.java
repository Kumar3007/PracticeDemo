package Practice;

import java.util.Scanner;

public class I_Shiftingto3rdPosition {
	
	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50};
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		
		System.out.println("enter number");
		for(int i=key;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		
		for(int i=0;i<key;i++)
		{
			System.out.println(a[i]+" ");
		}
		
	}
	

}
