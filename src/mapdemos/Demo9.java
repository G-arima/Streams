package mapdemos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Students{
	int rollNumber;
	String name;
	int marks;
	String city;
	Students(int rollNumber,String name,int marks,String city)
	{
		this.rollNumber=rollNumber;
		this.name=name;
		this.marks=marks;
		this.city=city;
	}
}

public class Demo9 {

	public static void main(String[] args) {
		/*Scenario

Marks > 75
City = "Delhi"
Convert names into uppercase
Collect into List<String>*/
		List<Students> studentDetails=Arrays.asList(new Students(101,"Aman",82,"Delhi"),
				new Students(102,"Rahul",60,"Delhi"),
				new Students(103,"Sneha",90,"Mumbai"),
				new Students(104,"Riya",95,"Delhi"),
				new Students(105,"Ankit",70,"Pune"));
		List<String> result=studentDetails.stream().filter(e->e.marks>75 && e.city=="Delhi").map(e->e.name.toUpperCase()).collect(Collectors.toList());
		System.out.println(result);

	}

}
