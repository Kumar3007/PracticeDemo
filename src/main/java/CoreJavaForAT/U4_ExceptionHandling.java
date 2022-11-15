package CoreJavaForAT;
/*
 * One try block can be followed multiple catch blocks
 * catch block should definetly follwed by try block..i.e, there should not be any statements between try and catch
 * catch should be immediate block after try
 */

public class U4_ExceptionHandling {
		public static void main(String[] args) {
			
			
			
			int a[]= {1,2,3,4,5,6};
			
			try
			{
			System.out.println(a[7]);

			}
			catch(ArithmeticException et)//catches only ArithmeticException
			{
			System.out.println("I catched ArithmeticException");	
			}
			catch(IndexOutOfBoundsException ets)
			{
				System.out.println("I catched IndexOutOfBoundsException");
			}
			catch(Exception e)// catches any exception
			{
				System.out.println(e+"Excetion handled");
			}
			System.out.println("Hi hello");
			
		}
}
