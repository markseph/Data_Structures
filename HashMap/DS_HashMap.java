import java.util.HashMap;

public class DS_HashMap {
	public static void main(String[] args) {
		// empty HashMap
		HashMap<String, Integer> map = new HashMap<String, Integer>(3);
		
		// add elements to HashMap
		map.put("apple", 1);
		map.put("banana", 3);
		map.put("cherry", 2);
		
		// print size and content of HashMap
		System.out.println("Size of HashMap: " + map.size() + " elements");
		System.out.println("Content of HashMap: " + map);
		
		// use lookup key
		String key = "banana";
		if(map.containsKey(key)) {
			Integer b = map.get(key);
			
			System.out.println("Looking up key: " + key);
			System.out.println("{Key=" + key + ", Value=" + b + "}");
		}
	}
}