package model;

public class Shift_managerModel extends EmployeeModel{
	public Shift_managerModel(String employee_id) {
		super();
		this.employee_id = employee_id;
	}

	public String employee_id;

	public String getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}
	
}
