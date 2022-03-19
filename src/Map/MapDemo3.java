package Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo3 {
	
	public static void main(String[] args) {
		
		List<Integer> numberList =  Arrays.asList(2,3,4,5,6);
		
		List<Integer> multipliedList = new ArrayList<Integer>();
/*		
		// Before 8
		
		for(Integer num : numberList)
		{
//			System.out.println(num*3);
			multipliedList.add(num*3);
		}
		System.out.println(multipliedList);
*/	
		
		// using stream
		
		multipliedList = numberList.stream().map(mul->(mul*3)).collect(Collectors.toList());
		System.out.println(multipliedList);
		
//		or
		numberList.stream().map(mul->(mul*3)).forEach(mul->System.out.println(mul)); 
		
	}
	
	

}
