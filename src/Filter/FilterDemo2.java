package Filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 {
	
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("jayesh","jay","sunil","rushikesh","sandip");
		
		List<String> longname = new ArrayList<String>();
		//1.
		longname = names.stream().filter(str->str.length()>6 && str.length()>8).collect(Collectors.toList());
		System.out.println(longname);
		
		//2.
		names.stream().filter(str->str.length()>6 && str.length()>8).forEach(str->System.out.println(str));
		
		//3.
		names.stream().filter(str->str.length()>6 && str.length()>8).forEach(System.out::println);
		
	}

}
