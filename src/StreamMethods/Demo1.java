package StreamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Demo1 {
	
	public static void main(String[] args) {
		
//		distinct
		
		List<String> vehicleList = Arrays.asList("car","bike","bus","bycycle","car","bus");
		
		List<String> distinctvehicleList = vehicleList.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctvehicleList);
		
		vehicleList.stream().distinct().forEach(value->System.out.println(value));
		
//     count		
		
		long vehicleCount = vehicleList.stream().distinct().count();
		System.out.println(vehicleCount);
		
//		limit
		
		List<String> limitedVehicleList = vehicleList.stream().limit(3).collect(Collectors.toList());
		System.out.println(limitedVehicleList);
		vehicleList.stream().limit(3).forEach(value->System.out.println(value));
		
		
		
	}
	
	

}
