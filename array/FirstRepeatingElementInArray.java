package array;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FirstRepeatingElementInArray {

	public static void main(String[] args) {
		System.out.println(firstRepeatingElement(new int[] {10, 5, 3, 4, 3, 5, 6}));
	}
	
	private static int firstRepeatingElement(int[] arr) {
		Map<Integer,List<Integer>> map=new HashMap<>();
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				List<Integer> list=map.get(arr[i]);
				list.add(i);
				map.put(arr[i],list);
			}else {
				List<Integer> list=new ArrayList<>();
				list.add(i);
				map.put(arr[i], list);
			}
				
		}
		Map<Integer,List<Integer>> mp=map.entrySet().stream().filter(e->e.getValue().size()>1)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		List<Integer> list=mp.values().stream().flatMap(a->a.stream()).collect(Collectors.toList());
		Optional<Integer> k=list.stream().min(Comparator.comparing(Integer::valueOf));
		
		return j;
	}
}
