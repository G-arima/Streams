package flatmapdemos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Demo4 {

	public static void main(String[] args) {
		List<Employee> list1 = Arrays.asList(new Employee(101, "Shikha", 99000.99),
				new Employee(102, "Rishabh", 87000.70), new Employee(103, "Shweta", 25000));
		List<Employee> list2 = Arrays.asList(new Employee(104, "Rahul", 22000.22),
				new Employee(105, "Shahbaz", 11600.66), new Employee(106, "Shreya", 98777.77));
		List<List<Employee>> combinedLists = Arrays.asList(list1, list2);
		// before java 8
		for (List<Employee> empList : combinedLists) {
			for (Employee e : empList) {
				System.out.println("The names of the employee are : " + e.getName());
			}
		}
		// After java 8
		List<String> employeeNames = combinedLists.stream().flatMap(empData -> empData.stream()).map(empData -> empData.getName()).collect(Collectors.toList());
		System.out.println(employeeNames);

	}

}
