package FlatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student {
	String sname;
	int sid;
	String grade;

	Student(String sname, int sid, String grade) {
		this.sname = sname;
		this.sid = sid;
		this.grade = grade;
	}

}

public class FlatMapDemo3 {

	public static void main(String[] args) {

		List<Student> studentList1 = new ArrayList<Student>();

		studentList1.add(new Student("Smith", 101, "A"));
		studentList1.add(new Student("Tom", 102, "B"));
		studentList1.add(new Student("Marry", 103, "C"));

		List<Student> studentList2 = new ArrayList<Student>();

		studentList1.add(new Student("Scott", 101, "A"));
		studentList1.add(new Student("Pandya", 102, "B"));
		studentList1.add(new Student("Kohli", 103, "C"));
		
		List<List<Student>> studentList = Arrays.asList(studentList1,studentList2);
		
		//before Java8
/*		
		for(List<Student> s:studentList)
		{
			for( Student stu:s)
			{
				System.out.println(stu.sname);
			}
		}
		
*/
		
		// using stream/flatmap
		
		List<String> names = studentList.stream()
				.flatMap(stulist->stulist.stream())
				.map(s->s.sname)                           // extract the names
				.collect(Collectors.toList());
		System.out.println(names);
		
		
		

	}

}
