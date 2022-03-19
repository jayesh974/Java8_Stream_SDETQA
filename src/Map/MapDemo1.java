package Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {
	
	public static void main(String[] args) {
		
		
		List<String> vehicles = Arrays.asList("bus","car","flights","train","bicycle");
		
		List<String> vehicleInUpperCase = new ArrayList<String>();
		
		
/*    without using stream concept		
		for(String name : vehicles)
		{
			vehicleInUpperCase.add(name.toUpperCase());
			
		}
		
*/
		
	   // with stream concept - Map
		
		vehicleInUpperCase = vehicles.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
		System.out.println(vehicleInUpperCase);
		
	
	}

}
