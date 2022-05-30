package Filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo1 {
	
	public static void main(String[] args) {
		
		// Regular Method
	/*	ArrayList<Integer>  numbersList = new ArrayList<Integer>();
		
		numbersList.add(10);
		numbersList.add(15);
		numbersList.add(20);
		numbersList.add(25);
		numbersList.add(30);
		numbersList.add(35);
		
	*/
		
		List<Integer> numbersList = Arrays.asList(10,15,20,25,30,35);
		List<Integer> evenNumbersList = new ArrayList<Integer>();
		
/*		******Regular filter without using streams********************
		for(int n :numbersList )
		{
			if(n%2==0)
			{
				evenNumbersList.add(n);
			}
		}
		
		System.out.println(evenNumbersList);
*/	
	// ************with stream**********
		//1.
		evenNumbersList = numbersList.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(evenNumbersList);
		
		//2.
		numbersList.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
		
		//3.
		numbersList.stream().filter(n->n%2==0).forEach(System.out::println);
		
		
		
		
		
	}

}
