package maps1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;



public class Map1 {
	
	public static void main(String[] args) {
		
		
HashMap<Integer, String> hm = new HashMap<>();
hm.put(101, "ABC");
hm.put(102, "DEF");
hm.put(101, "XYS");
hm.put(1021, "DEF");
hm.put(1011, "XYS");
System.out.println(hm);



//Sorted Order Based On keys:
TreeMap<Integer, String> treemap1 = new TreeMap<>();
treemap1.put(101, "ABC");
treemap1.put(102, "DEF");
treemap1.put(101, "XYS");
treemap1.put(1021, "DEF");
treemap1.put(1011, "XYS");
treemap1.put(1055, "swafdef");
System.out.println(treemap1);
	
	
	
	//Insertion Order based on Keys :
	LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
	lhm.put(101, "ABC");
	lhm.put(102, "DEF");
	lhm.put(101, "XYS");
	lhm.put(1021, "DEF");
	lhm.put(1011, "XYS");
	System.out.println(lhm);
	
	
	//Merge Two Maps :
	lhm.putAll(treemap1);
	System.out.println(lhm);
	
	//to remove form map need to pss key:
	lhm.remove(101);
	System.out.println(lhm);
	
	System.out.println("TO Check if the Key is present : "+ lhm.containsKey(1021));
	System.out.println("To Check if the value is present "+ lhm.containsValue("DEF"));
	System.out.println("To check the size of the map "+lhm.size());
	
//Replacing the value based Keys :"
	lhm.replace(1021, "AAAAA");
	System.out.println(lhm);
	
	lhm.replace(102, "DEF","pppp");  //Key Old value New Value
	System.out.println(lhm);
	
	
	//Traversing Map Using For Each
	
	for (Map.Entry<Integer, String> m : treemap1.entrySet()) 
	{
		System.out.println(m.getKey()+"-------->"+m.getValue());
	}
	
	
	//Traversing Map Using Iterator
	
	Iterator<Entry<Integer, String>> itr =  treemap1.entrySet().iterator();
			while (itr.hasNext()) 
			{
			Entry<Integer, String> e = itr.next();
			System.out.println(e.getKey()+"------>"+e.getValue());
				
			}
	
	
	}

}
