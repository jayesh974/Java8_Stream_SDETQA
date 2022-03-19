package Filter_Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee
{
	int id;
	String ename;
	int salary;
	
	Employee(int id, String ename, int salary)
	{
		this.ename=ename;
		this.id=id;
		this.salary=salary;
	}
}

public class Filter_MapDemo {

	public static void main(String[] args) {
/*		
		List<Employee> employeeList = new ArrayList<Employee>();
		
		employeeList.add(new Employee(101,"jayesh",50000));
		employeeList.add(new Employee(102,"sunil",60000));
		employeeList.add(new Employee(103,"ritesh",40000));
		employeeList.add(new Employee(104,"aditya",70000));
		
*/
		List<Employee> employeeList = Arrays.asList(
				new Employee(101,"jayesh",50000),
				new Employee(102,"sunil",60000),
				new Employee(103,"ritesh",40000),
				new Employee(104,"aditya",70000)
				);
		
		//combination of filter and Map
		
		 
		List<Integer> employeeSalList = employeeList.stream()
		                   .filter(e->e.salary>45000)       //filtering
		                   .map(e->e.salary)                //  returning only salary from object
		                   .collect(Collectors.toList());
		
		System.out.println(employeeSalList);
				
				
				
		
	}
	

}
