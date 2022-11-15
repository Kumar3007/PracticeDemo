package CoreJavaForAT;
/*
 * Function Over Loading---->method Overloading
 * Rules:->Either Argument count should be different 
 * 							OR 
 * 			Argument data type(method Signature) should be different
 * 						
 * 
 */
public class U8_polymorphism {
	
			public void getData(int a)
			{
				System.out.println(a);
			}
			public void getData(int a,int b)
			{
				System.out.println(a);
				System.out.println(b);
		
			}
			
			public float getData(int a,float b)
			{
					float add = a+b;
					return add;
			}
			public void getData(String a)
			{
				System.out.println(a);
			}
	
			public static void main(String[] args) {
				
				U8_polymorphism a = new U8_polymorphism();
				a.getData(123);
				a.getData(100, 200);
				a.getData("kumar");
				a.getData(10, 10.5f);
	
		}
	
	
}
