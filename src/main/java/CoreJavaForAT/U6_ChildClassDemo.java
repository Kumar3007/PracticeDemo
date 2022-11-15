package CoreJavaForAT;

public class U6_ChildClassDemo extends U5_InheritanceParentClass {//this line says that we are successfully derived properties of parent class 

	public void engine()
	{
		System.out.println("new engine");
	}
	public void color()
	{
		System.out.println(colour);
	}
	
	
	public static void main(String[] args) {
		U6_ChildClassDemo cd = new U6_ChildClassDemo();
		cd.color();
	//	System.out.println(cd.colour);
		cd.Breaks();
		cd.engine();
						

	}

}
