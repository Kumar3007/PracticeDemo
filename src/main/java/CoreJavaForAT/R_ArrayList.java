package CoreJavaForAT;
/* Duplicates
 * Insertion Order
 * Heterogenous objects*
 * null values
 */

import java.util.ArrayList;

public class R_ArrayList 
/*can accept duplicates
 * ArrayList,LinkedList,Vector------>implements List Interface
 * Arraylist can grow dynamically and can access,insert,any value in any index
 */
{
	public static void main(String[] args) {
		
			ArrayList<String> a = new ArrayList<String>();
			a.add("kumar");
			a.add("java");
			System.out.println(a);
			a.add(0, "student");
			System.out.println(a);
			
			//can accept heterogenous elements
			a.add("256");
			System.out.println(a+"-->can accept heterogenous elements ");
			/*a.remove(1);
			System.out.println(a);
			a.remove("java");
			System.out.println(a);*/
			
			
			System.out.println(a.get(2));
			//testing is present or not
			System.out.println(a.contains("testing"));
			System.out.println(a.indexOf("kumar"));
			System.out.println(a.isEmpty());
			System.out.println(a.size());
		
			//can accept duplicates
			a.add("kumar");
			System.out.println(a);
			a.add(1, "kumar");
			System.out.println(a+"-->Can accept duplicates");
			
			a.add(null);
			System.out.println(a+"-->null insertion is possible");
			System.out.println(a+"-->Insertion Order is Preserved");
			
	}

}
