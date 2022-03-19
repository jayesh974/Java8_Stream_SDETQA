package Map;

import java.util.Arrays;
import java.util.List;

public class MapDemo2 {
	
	public static void main(String[] args) {
	
		
		List<String> vehicles = Arrays.asList("bus","car","flights","train","bicycle");
		
/*		// before java8/without using stream
		
		for(String name : vehicles)
		{
			System.out.println(name.length());
			
		}
*/
		
		// with using stream
		
//		vehicles.stream().map(vname->vname.length()).forEach(len->System.out.println(len));
		
		vehicles.stream().map(vname->vname.length()).forEach(System.out::println);
		
	}

}
