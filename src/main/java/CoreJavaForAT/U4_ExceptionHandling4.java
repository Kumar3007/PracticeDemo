package CoreJavaForAT;
/*
 * Finally block executes irrespective of exception handled or not
 * As Automation Engineer..,
 * for closing the browser if test script fails we use finally block
 * for deleting the cookies we use finally block
 * even if script pass or fail finally block executes
 * Tell me one Why Finally block will not get Executed---->Stopping the JVM will not exrcuted
 */

public class U4_ExceptionHandling4 {
		public static void main(String[] args) {
			
			
			
			int a=10;
			int b=0;
			
			try
			{
			int c=a/b;
			System.out.println(c);
			}
			
			//System.out.println("Hi hello");
			finally
			{
				System.out.println("delete cookies");
			}
			System.out.println("after finally block");
		}
}
