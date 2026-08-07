package mapdemos;

import java.util.Arrays;
import java.util.List;

class Employees
{
	int id;
	String name;
	double salary;
	Employees(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
}

public class Demo8 {

	public static void main(String[] args) {
		/*Scenario

		Salary greater than 50000.
		Convert employee names into lowercase.*/
		List<Employees> employeeDetails=Arrays.asList(
				new Employees(101,"Gunika",100000),
				new Employees(102,"Arjuna",200000),
				new Employees(103,"Neeti",35000),
				new Employees(104,"Abhimanyu",75000),
				new Employees(105,"Rahul",10000));
		employeeDetails.stream().filter(e->e.salary>50000).map(e->e.name.toLowerCase()).forEach(System.out::println);
		

	}

}
