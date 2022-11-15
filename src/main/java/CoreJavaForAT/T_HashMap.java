package CoreJavaForAT;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.collections4.map.HashedMap;

/*Takes the value in form of Key Pair values
 * Hashmap is coverted into set by using entrySet
 * interview question:- create Hashtable --->Pass table set collections 
 */

public class T_HashMap {
	public static void main(String[] args) {
		
			HashedMap<Integer, String> hm = new HashedMap<Integer, String>();
			
			//insertion order is not preserved
			hm.put(0, "hello");
			hm.put(1, "world");
			hm.put(2, "morning");
			
			//Heterogenous elements are allowed
			System.out.println(hm.put(3,"$")+"-->Heterogenous elements are allowed");
			hm.put(3, null);
			System.out.println(hm);
			System.out.println(hm.get(2));
			System.out.println(hm.get(42));
			
			
			//Hashmap is coverted into set by using entrySet
			Set<Entry<Integer, String>> sn = hm.entrySet();
			Iterator<Entry<Integer, String>> it = sn.iterator();
			while(it.hasNext())
			{
				//System.out.println(it.next());
				
				//
				Map.Entry mp = (Map.Entry)it.next();
				System.out.println(mp.getKey());
				System.out.println(mp.getValue());
				
			}
	}

}
