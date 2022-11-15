package CoreJavaForAT;

public class M_InterviewQuestions {
		/*							Find the minimum number
		 * 5 6 5						Identify the coloumn of minimum number
		 * 7 3 1					Find the maximum number in identified coloumn
		 * 2 4 3
		 */
		public static void main(String[] args) {
			
		
		int a[][]= {{5,6,5},{7,3,1},{2,4,3}};
		int min=a[0][0];
		int mincoloumn = 0;
		
		for(int i=0;i<3;i++)
		{
			for (int j = 0; j < 3; j++) {
				
				if(a[i][j]<min)
				{
					min=a[i][j];
					mincoloumn=j;
				}
			}
		}
		System.out.println(min);
	
		int max=a[0][mincoloumn];
		int k=0;
		while(k<3)
		{
			if(a[k][mincoloumn]>max)
			{
				max=a[k][mincoloumn];
			}
			k++;
		}
		
		System.out.println(max);
	}
	}
		

	


