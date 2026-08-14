package flatmapdemos;
class Employee {
	private int emp_id;
	private String emp_name;
	private double emp_sal;

	Employee(int emp_id, String emp_name, double emp_sal) {
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_sal = emp_sal;
	}

	public int getId() {
		return emp_id;
	}

	public String getName() {
		return emp_name;
	}

	public double getEmpSal() {
		return emp_sal;
	}
}