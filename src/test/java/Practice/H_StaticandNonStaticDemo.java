package Practice;

public class H_StaticandNonStaticDemo {
	
	static
	{
		System.out.println("from static bloclk");
	}
	
	{
		System.out.println("from non-static block");
	}
	
	public static void main(String[] args) {
		
		H_StaticandNonStaticDemo demo = new H_StaticandNonStaticDemo();
		System.out.println("from main method");

	}

}
