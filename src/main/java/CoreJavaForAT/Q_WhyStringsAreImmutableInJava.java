package CoreJavaForAT;
/*
 * Why Strings are Immutable------------------------------------------------------->It cannot be altered or changed existing value
 * How memory is allocated to String Literals and String Object
 * When to use == and equals methods to compare strings
 * importance of String Builder and String Buffer classs and their differences
 * Program in making String mutable with String Buffer
 */

public class Q_WhyStringsAreImmutableInJava {
	public static void main(String[] args) {
		String a="hello";
		String b="hello";
		String c=a.concat("world");
		System.out.println(c);
		System.out.println(a);
		String s=new String("hello");//String Object creates new object every time in memory
		String s1=new String("hello");
		
		//to modify original string----->java guys created string buffer and string builder 
		//can be mutable---------------->can modify existing value
		
		StringBuffer sb=new StringBuffer("hello");  //--------------->can modify existing value
		sb.append("world");
		System.out.println(sb);
		sb.insert(2, "she");
		System.out.println(sb);		//heshelloworld
		sb.replace(5, 7, "aa");     
		System.out.println(sb);		 //hesheaaoworld
		sb.deleteCharAt(12);
		System.out.println(sb);		//hesheaaoworl
		sb.reverse();
		System.out.println(sb); 	//lrowoaaehseh
		
		//StringBuilder is not thread safe., It is Non Synchronized,It is faster
		//example---->sequential execution--->StringBuilder
		//example----->parallel execution---->StringBuffer---->takescare of threadsafe mechanisam
		System.out.println("================================StringBuilder=====================================");
				StringBuilder sbb = new StringBuilder("kumar");
				sbb.append("R");
				System.out.println(sbb);
		
		System.out.println("=====================================(equals and ==)=========================================");
		System.out.println(a.equals(b));//true---->equals Compares Content
		System.out.println(a==b);//true------------>== compares references
		System.out.println(a.equals(s));//true
		System.out.println(a==s);//false--->fails matching the references
		System.out.println(s==s1);//false--->fails matching the references
		System.out.println(s.equals(s1));//true---->compares content
		
		
		
		
		
		
	}

}
