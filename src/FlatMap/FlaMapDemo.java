package FlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlaMapDemo {
	
	public static void main(String[] args) {
		
//		Map
		
		List<Integer> List1 = Arrays.asList(1,2,3,4,5,6);
		
		List<Integer> List2 = List1.stream().map(n->n+10).collect(Collectors.toList());
		
		System.out.println(List2);
		
//		FlatMap
		
		List<Integer> Lst1 = Arrays.asList(1,2);
		List<Integer> Lst2 = Arrays.asList(3,4);
		List<Integer> Lst3 = Arrays.asList(5,6);
		
		List<List<Integer>> finalList = Arrays.asList(Lst1,Lst2,Lst3);
		
		System.out.println(finalList);
		
		List<Integer> finalResult = finalList.stream().flatMap(x->x.stream().map(n->n+10)).collect(Collectors.toList());
		
		System.out.println(finalResult);
		
		
		
		
		
		
		
		
		
		
	}

}
