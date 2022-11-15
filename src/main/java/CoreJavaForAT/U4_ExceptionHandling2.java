package CoreJavaForAT;
/*
 * One try block can be followed multiple catch blocks
 * catch block should definetly follwed by try block..i.e, there should not be any statements between try and catch
 * catch should be immediate block after try
 */

public class U4_ExceptionHandling2 {
		public static void main(String[] args) {
			
			
			
			int a=10;
			int b=0;
			
			try
			{
			int c=a/b;
			System.out.println(c);
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
