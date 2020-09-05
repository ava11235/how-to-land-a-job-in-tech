import java.util.HashMap;
import java.util.Map;

public class ReverseMapKV {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new  HashMap<Integer,String>();
		map.put(1, "Joe");
		map.put(2, "Sofia");
		map.put(3, "Violet");
		
		System.out.println(reverse(map));
	

	}
	
	public static Map<String, Integer> reverse(Map<Integer, String> map) {
		   Map<String, Integer> reversedMap = new HashMap<String, Integer>();
		   for (Integer key : map.keySet()) {
		       String value = map.get(key);
		      reversedMap.put(value, key);
		   }
		   return reversedMap;
		}



}
