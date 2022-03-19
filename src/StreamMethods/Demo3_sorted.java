package StreamMethods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo3_sorted {
	
	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(2,5,4,1,9,3,7);
		
//		ascending order
		List<Integer> sortedList = list1.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);     
	
//		descending order/reverse
		List<Integer> reversesortedList = list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(reversesortedList);
		
		
		
		
		
	}

}
