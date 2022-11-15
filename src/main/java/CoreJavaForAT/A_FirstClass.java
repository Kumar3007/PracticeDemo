//variales classes objects methods
package CoreJavaForAT;

public class A_FirstClass {
	
	
	static int q=8;
		//int r=10;
	
	public void getdata()
	{
		System.out.println("i am from getdata of 1st class");
	}
	
	
	public static void main(String[] args) {
		System.out.println(q);
		System.out.println("hi hello");
		A_FirstClass obj = new A_FirstClass();
		obj.getdata();
		System.out.println(obj.q);
		
		B_secondClass obj1 = new B_secondClass();
			obj1.setdata();
	}

}
