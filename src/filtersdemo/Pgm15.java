package filtersdemo;

import java.util.ArrayList;
import java.util.List;

class Employee{
	int id;
	String name;
	int age;
	Employee(int id,String name,int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}
}

public class Pgm15 {
	

	public static void main(String[] args) {
		Employee e1=new Employee(101,"Amit",25);
		Employee e2=new Employee(102,"Rahul",35);
		Employee e3=new Employee(103,"Ankit",28);
		Employee e4=new Employee(104,"Neha",40);
		List<Employee> employeeData=new ArrayList();
		employeeData.add(e1);
		employeeData.add(e2);
		employeeData.add(e3);
		employeeData.add(e4);
		employeeData.stream().filter(e->e.age>30).forEach(a->System.out.println(a.age));
		

	}

}
