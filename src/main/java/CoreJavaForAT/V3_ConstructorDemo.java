package CoreJavaForAT;
/*It is just like a method---> The only difference is 
 * ------->it should not have any return type
 * ------->method name should be =class name
 * Used to iniatilize variables
 * Constructor block executes automatically whenever object is created for class
 * Whenever object is created constructor is called automatically
 *  Complier will call implicit constructor	
 *  We use this constructor to define variables or initiate some properties in real time
 *  Types of constructor---->implicit Constructor---->called by JVM complier
 *  					---->Default or Explicit Constructor-->executes whenever object is created
 *  					---->Parameterized Constructor-------->
 *  we cannot return anything here
 */
public class V3_ConstructorDemo {
	
	public V3_ConstructorDemo()		//Explicit constructor
	{
		System.out.println("I am from constructor");
		System.out.println("I am from constructor1");
	}
	public V3_ConstructorDemo(int a,int b)	//Parameterized constructor
	{
		System.out.println("from parameterized Constructor");
			int c=a+b;
			System.out.println(c);
		
	}
	public void getData()
	{
		System.out.println("I am from Method");
	}
	
	public static void main(String[] args) {
			V3_ConstructorDemo a = new V3_ConstructorDemo();//Whenever object is created constructor is called automatically(implict and explicit)
			V3_ConstructorDemo b = new V3_ConstructorDemo(4,5);	//parameterized				
	}

}
