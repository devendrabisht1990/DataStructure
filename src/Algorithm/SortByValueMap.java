package Algorithm;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.*;

public class SortByValueMap {

	
	public  static void main(String args[]){
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("A", 20);
		map.put("B", 10);
		map.put("C", 5);
		map.put("D", 40);
		map.put("E", 1);
		
		Set<Entry<String,Integer>> mapEntries = map.entrySet();
		List<Entry<String,Integer>> mapEntriesList = mapEntries.stream().collect(Collectors.toList());
		mapEntriesList.sort((e1,e2) -> e1.getValue().compareTo(e2.getValue()));
		System.out.println(mapEntriesList);
	}
}
