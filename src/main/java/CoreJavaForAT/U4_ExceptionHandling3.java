package CoreJavaForAT;
/*
 * Finally block executes irrespective of exception handled or not
 * for closing the browser if test script fails we use finally block
 * for deleting the cookies we use finally block
 * even if script pass or fail finally block executes
 */

public class U4_ExceptionHandling3 {
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
			//System.out.println("Hi hello");
			finally
			{
				System.out.println("delete cookies");
			}
			System.out.println("after finally block");
		}
}
