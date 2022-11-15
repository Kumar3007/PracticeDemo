package CoreJavaForAT;

public class G_Assignment {
	public static void main(String[] args) {
		
	
	for(int i=0;i<=4;i++)
	{
		System.out.println("outer for loop started");
		for(int j=1;j<=4-i;j++)
		{
			System.out.println("inner forloop");
			
		}
		
		System.out.println("outer forloop finished");
	}
	}
}
/*1 2 3 4
  5 6 7
  8 9
  10     */	