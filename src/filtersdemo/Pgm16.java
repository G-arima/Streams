package filtersdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employees{
	int id;
	String name;
	double salary;
	Employees(int id,String name,double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
}

public class Pgm16 {
	//Employees With Salary Above 60,000

	public static void main(String[] args) {
		Employees emp1=new Employees(101,"Surbhi",60700);
		Employees emp2=new Employees(102,"Saurabh",50200);
		Employees emp3=new Employees(103,"Geetika",44800);
		Employees emp4=new Employees(104,"Gaurav",98700);
		List<Employees> employeesList=new ArrayList();
		employeesList.add(emp1);
		employeesList.add(emp2);
		employeesList.add(emp3);
		employeesList.add(emp4);
		employeesList.stream().filter(emp->emp.salary>60000).forEach(sal->System.out.println(sal.salary));
		
		

	}

}
