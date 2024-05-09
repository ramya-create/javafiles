package demo5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
public class TestMap {
	public static void main(String[] args) {
		//HashMao..
		HashMap<String, Integer> hm =new HashMap<String, Integer>();
		hm.put("a", 100);
		hm.put("z", 600);
		hm.put("c", 300);
		hm.put("d", 400);
		hm.put("d", 4000);
		hm.put(null, 4000);
		hm.put(null, 4100);
		hm.put(null, null);
		hm.put(null, null);
		
		Set<Map.Entry<String, Integer>> st1=tm.entrySet();
		for(Map.Entry<String, Integer> me: st1) {
			System.out.println(me.getKey()+":");
			System.out.println(me.getValue());
		}
		
		//LinkedashMap
		System.out.println("Display data using linkedHashMap - Maintains insertion order with linked list");
		LinkedHashMap<String, Integer> lm=new LinkedHashMap<String, Integer>();
		lm.put("a", 100);
		lm.put("b1", 200);
		lm.put("c", 300);
		lm.put("d", 400);
		
		Set<Map.Entry<String,Integer>> s=lm.entrySet();
		for<Map.Entry<String, Integer>> s=lm.entrySet(){
			System.out.println(me.getKey()+":");
			System.out.println(me.getValue());
		}
		
	}
}
