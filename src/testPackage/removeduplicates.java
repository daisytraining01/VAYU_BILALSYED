package testPackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class removeduplicates{
public static void main(String[] args) {

	Map<String, String> map = new HashMap<>();
	map.put("Key 1", "TestVal1");
	map.put("Key 2", "TestVal2");
	map.put("Key 3", "TestVal1");
	map.put("Key 4", "TestVal2");
	map.put("Key 5", "TestVal2");
	map.put("Key 6", "TestVal3");
	//System.out.printf("Before: %s%n", map);

	// Set in which we keep the existing values
	Set<String> existing = new HashSet<>();
	map = map.entrySet()
	    .stream()
	    .filter(entry -> existing.add(entry.getValue()))
	    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
	System.out.printf("After removing the Duplicates: %s%n", map); 
	
}
}


	    /*HashMap<String, String> map = new HashMap<String, String>();
	    map.put("A", "1");
	    map.put("B", "2");
	    map.put("C", "2");
	    map.put("D", "3");
	    map.put("E", "3");

	    Set<String> keys = map.keySet(); // The set of keys in the map.

	    Iterator<String> keyIter = keys.iterator();

	    while (keyIter.hasNext()) {
	        String key = keyIter.next();
	        String value = map.get(key);

	        System.out.println(key + "\t" + value);

	        String nextValue = map.get(key);

	        if (value.equals(nextValue)) {
	            map.remove(key);
	        }
	    }
	    System.out.println(map);
	}*/
