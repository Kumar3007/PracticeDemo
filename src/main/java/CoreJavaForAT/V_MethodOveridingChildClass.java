package CoreJavaForAT;
/*
 * Function Overiding-->Method Overiding
 * Rules:-->same name,same method signature,same parameter
 * 							AND
 * 			Visibility of child class must be equal to greater than visibility of parent class
 */
public class V_MethodOveridingChildClass extends U9_MethodOveridingParentClass{

			public void color()
			{
				System.out.println(colour);
			}
			
			public void engine()
			{
				System.out.println("engine code implemented");
			}
			public void audioSystem()
			{
				System.out.println("audioSystem in ChildClass");
			}
	
	public static void main(String[] args) {
		V_MethodOveridingChildClass a = new V_MethodOveridingChildClass();

		a.color();
		a.engine();
		a.audioSystem();
	}

}
