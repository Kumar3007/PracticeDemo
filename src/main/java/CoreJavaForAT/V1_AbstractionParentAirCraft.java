package CoreJavaForAT;
/*private is not allowed as access specifier for methods defined in abstract class--->becz we are allowing to access the methods
 * partial Abstraction
 * 
 */

public abstract class V1_AbstractionParentAirCraft {
		public void engine()
		{
			System.out.println("follow engine Guidelines");
		}
		
		public void safetyGuidelines()
		{
			System.out.println("follow safety Guidelines");
		}
		
		public abstract void bodyColor();
}







/*
 *======================================================================================================================
 *difference between Abstraction and Interface
 * 
 * 		Interface------------------------------------------Abstarction
 * contains only abstract methods						contains abstract methods,concrete methods or both
 * Access specifier for methods must be public			Except Private we can have any access specifier
 * Variables defined must be public,static,final		Except private variables can have any access specifiers
 * To implement an interface we usr implements keyowrd  To implement an abstarction we use extends keyowrd 
 */
