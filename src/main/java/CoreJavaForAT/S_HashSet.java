package CoreJavaForAT;

import java.util.HashSet;
import java.util.Iterator;

public class S_HashSet {
	/* Does not allow duplicates
	 * Hashset,LinkedHashset,Treeset classes------>implements Set interface
	 * There is no guarntee that elements stored in sequential order--->Random
	 */
	public static void main(String[] args) {
		
					HashSet<String> hs = new HashSet<String>();
					//insertion order is not followed
						hs.add("India");
						hs.add("usa");
						hs.add("UK");
						hs.add("he");
						hs.add("she");
				
						System.out.println(hs+"-->insertion order is not followed");
					
						//does not allow duplicates
						hs.add("India");
						System.out.println(hs+"-->does not allow duplicates");
						
						//Heterogenous elements are allowed
						hs.add("$%^&");
						System.out.println(hs+"-->Heterogenous elements are allowed");
						
						//null insertion is allowed but only once
						hs.add(null);
						hs.add(null);
						System.out.println(hs+"-->null insertion is allowed but only once");
						
						System.out.println("==========Retrieving Data========");
						//Iterator
						Iterator<String> i = hs.iterator();
						while(i.hasNext())
						{
							System.out.println(i.next());
						}
												
						
}

}
