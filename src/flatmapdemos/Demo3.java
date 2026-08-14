package flatmapdemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student
{
String sname;
int sid;
char grade;

Student(String sname,int sid, char grade)
{
	this.sname=sname;
	this.sid=sid;
	this.grade=grade;
}
}
public class Demo3 {

	public static void main(String[] args) {
		List<Student> studentList1=new ArrayList<Student>();
		studentList1.add(new Student("Mishika",101,'A'));
		studentList1.add(new Student("Mishthi",102,'B'));
		studentList1.add(new Student("Mridula",103,'C'));
		List<Student> studentList2=new ArrayList<Student>();
		studentList2.add(new Student("Meera",104,'A'));
		studentList2.add(new Student("Garima",105,'B'));
		studentList2.add(new Student("Rajesh",106,'C'));
		List<List<Student>> stuDetails=Arrays.asList(studentList1,studentList2);
		//before stream
		
		for(List<Student> ele:stuDetails)
			{
			for(Student stuname : ele)
				{ 
			System.out.println(stuname.sname);	
			}
		}
		//After stream
		List<String> studentNames=stuDetails.stream().flatMap(stu->stu.stream()).map(sList->sList.sname).collect(Collectors.toList());
		System.out.println("The name of the students are : " +studentNames);
		

	}

}
