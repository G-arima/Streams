package filtersdemo;

import java.util.ArrayList;
import java.util.List;

class Student{
	int marks;
	String name;
	Student(int marks,String name){
		this.marks=marks;
		this.name=name;
	}
}

public class Pgm17 {

	public static void main(String[] args) {
		List<Student> studentData=new ArrayList();
		studentData.add(new Student(99,"Garima"));
		studentData.add(new Student(100,"Shubham"));
		studentData.add(new Student(70,"Shiwaaye"));
		studentData.add(new Student(50,"Abhilaksh"));
		studentData.stream().filter(s->s.marks>70).filter(s->s.name.startsWith("S")).forEach(s->System.out.println(s.marks +":" +s.name));
		
		

	}

}
