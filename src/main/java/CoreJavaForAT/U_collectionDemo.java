package CoreJavaForAT;

import java.util.ArrayList;
import java.util.LinkedHashSet;

/*
 * Print unique from List---->amazon
 */
public class U_collectionDemo {
	
	public static void main(String[] args) {
		
		int sp[]= {4,5,5,5,4,6,6,9,4};
		//4-->3times  5-->3  6-->2  9-->1
						
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
			for (int i = 0; i < sp.length; i++) {
				set.add(sp[i]);

			}
			for (Integer word : set) {
				int count=0;

				for (int i = 0; i < sp.length; i++) {
					if(word.equals(sp[i]))
					{
						count++;
					}
				}
				if(count==1)
					System.out.println(word+" is unique number repeated "+count+" time");
				else
				System.out.println(word+" is repeated "+count+" times");
			}
		}
		
	}


