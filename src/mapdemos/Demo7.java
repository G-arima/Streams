package mapdemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{
	String name;
	int marks;
	Student(String name,int marks)
	{
		this.name=name;
		this.marks=marks;
	}
}

public class Demo7 {

	public static void main(String[] args) {
		List<Student> studentRecords=Arrays.asList(
				new Student("Saurabh",55),
				new Student("Radhika",88),
				new Student("Pallavi",99));
		List<String> finalResult=new ArrayList<>();
		finalResult=studentRecords.stream().filter(s->s.marks>70).map(s->s.name).collect(Collectors.toList());
		System.out.println(finalResult);
		

	}

}
