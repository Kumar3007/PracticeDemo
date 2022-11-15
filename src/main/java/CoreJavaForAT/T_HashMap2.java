package CoreJavaForAT;

import java.util.Hashtable;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
/*
 * Difference between HashedMap and Hastable
 */
import org.apache.commons.collections4.map.HashedMap;
public class T_HashMap2 {
	public static void main(String[] args) {
		
			Hashtable<Integer, String> hm = new Hashtable<Integer, String>();
			hm.put(0, "hello");
			hm.put(1, "world");
			hm.put(2, "morning");
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
