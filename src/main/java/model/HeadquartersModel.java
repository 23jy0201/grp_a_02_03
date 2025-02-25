package model;

public class HeadquartersModel extends EmployeeModel{
	public HeadquartersModel(String employee) {
		super();
		this.employee = employee;
	}

	public String employee;

	public String getEmployee() {
		return employee;
	}

	public void setEmployee(String employee) {
		this.employee = employee;
	}
	
	
}
