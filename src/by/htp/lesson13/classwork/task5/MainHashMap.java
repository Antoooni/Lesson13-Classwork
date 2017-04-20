	package by.htp.lesson13.classwork.task5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MainHashMap {

	public static void main(String[] args) {
		Map<Category, Integer>  map = new HashMap<Category, Integer>();
		map.put(Category.AUTO, 150);
		map.put(Category.APPLIANCES, 75);
		map.put(Category.COMPUTERS, 50);
		map.put(Category.HOUSES, 10);
		map.put(Category. MOTO, 60);
		map.put(Category.CHILDREN, 0);
		map.put(Category. ELECTRONICS, 321);
		map.put(Category.HEALTHandBEAUTY, 150);
		
//		
		
		 System.out.println("Unsorted map: ");
	        for (Category key : map.keySet()) {
	            System.out.println( "Category: "+key + " quantity- " + map.get(key));
	        }
	        List<Entry<Category, Integer>> entries = new ArrayList<Entry<Category, Integer>>(map.entrySet());
	        Collections.sort(entries, new Comparator<Entry<Category, Integer>>() {
	            @Override
	            public int compare(Entry<Category, Integer> e1, Entry<Category, Integer> e2) {
	               if(e1.getValue()!=null||e2.getValue()!=null){
	            	int v1 = e1.getValue(); 
	                int v2 = e2.getValue();
	                return (v1 > v2) ? 1 : (v1 == v2) ? 0 : -1;
	               }return 0;
	            }
	        });
	        System.out.println('\n'+"Sorted map: ");
	        for (Entry<Category, Integer> e : entries) {
	            System.out.println("Category: "+ e.getKey() + " quantity- " + e.getValue());
	        }

	}

}
