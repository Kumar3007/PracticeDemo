package CoreJavaForAT;

public class H_AssignmentReference {

	public static void main(String[] args) {
		int k=1;
		for(int i=0;i<=4;i++)
		{
			//System.out.println("outer forloop started"+i);
			
			for(int j=1;j<=4-i;j++)
			{
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			//System.out.println("outer forloop finished");
			System.out.println();
		}
	}
}
