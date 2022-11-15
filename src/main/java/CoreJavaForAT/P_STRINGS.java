package CoreJavaForAT;

public class P_STRINGS {
	
	public static void main(String[] args) {
		
		/*  String is a Prebuilt Class in JAVA
			Basically there are two ways to define String
			1.String Literal
			2.By creating Object of String
			
			 We can Perform String Manupulation which contains powerfull methods*/
		
		String a="java/t/raining";		//String Literal------>java compilier internally creates object
		String ab=new String("hello"); //with String Class//String Object creates new object every time in memory
		String b="hello";// Jvm checks weather a string object with same content is present in string constant pool..i.e, it does not create one more object
		String bc=new String("hello");//creates one more object
		
		/*
		 * In String literal---->Reference to the Static pool will be created
		 * In Creating Object---->new Object will always get created
		 */
		System.out.println(a.charAt(4));
		System.out.println(a.indexOf("e"));
		System.out.println(a.substring(3, 6));
		System.out.println(a.substring(3));
		System.out.println(a.concat("kumar"));
		System.out.println(a);
		System.out.println(a.length());
		/*
		 * a.trim()---->removes white spaces
		 */
		System.out.println(a.toLowerCase());
		System.out.println(a.toUpperCase());
		/*
		 * Split***
		 */
		String arr[]=a.split("/");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(a.replace("t", "s"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
