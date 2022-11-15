package CoreJavaForAT;

public class F_nestedLoops {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=4;i=i+1) //this block loop run for 4 times
		{
			System.out.println("outer loop started");
			for(int j=1;j<=4;j++)
			{
				System.out.println("inner loop");
			}
			System.out.println("outer loop finished");
			
		}
	}

}
//4times outer forloop=16 times inner forloop