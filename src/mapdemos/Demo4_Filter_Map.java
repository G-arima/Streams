package mapdemos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	int employeeId;
	String employeeName;
	double salary;
	
	Employee(int employeeId,String employeeName,double salary)
	{
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.salary=salary;
	}
}

public class Demo4_Filter_Map {

	public static void main(String[] args)
	{
		//Create an employee class, employee id, name and salary parameters, apply filter and map both finally  collect the result into some other collection
		//Print the salaries of employee greater than 20000, after applying the filter print the salary of every emp
		List<Employee> employeeDetails=new ArrayList<>();
		employeeDetails.add(new Employee(101,"Anil",56500.90));
		employeeDetails.add(new Employee(102,"Prajakta",8800));
		employeeDetails.add(new Employee(103,"Abhishek",99000.98));
		employeeDetails.add(new Employee(104,"Shashwat",110000.99));
		employeeDetails.add(new Employee(105,"Shreya",25000));
		List<Double> employeeDetailsResult=employeeDetails.stream().filter(e->e.salary>20000).map(e->e.salary).collect(Collectors.toList());
		System.out.println(employeeDetailsResult);
		

	}

}
