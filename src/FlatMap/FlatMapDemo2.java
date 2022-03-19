package FlatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo2 {
	
	public static void main(String[] args) {
		
		List<String> team1 = Arrays.asList("Scott","David","John");
		List<String> team2 = Arrays.asList("Marry","Luna","Tom");
		List<String> team3 = Arrays.asList("Ken","Jonny","Ketty");
		
		List<List<String>> playersInWorldCup = new ArrayList<List<String>>();
		
		playersInWorldCup.add(team1);
		playersInWorldCup.add(team2);
		playersInWorldCup.add(team3);
		
		// Regular Method
/*		
		for(List<String> team : playersInWorldCup )
		{
			for(String name : team)
			{
				System.out.println(name);
			}
		}
*/
		 // Using java stream
		
		List<String> names = playersInWorldCup.stream().flatMap(plist->plist.stream()).collect(Collectors.toList());
		System.out.println(names);
		
		
		
		
		
		
		
	}

}
