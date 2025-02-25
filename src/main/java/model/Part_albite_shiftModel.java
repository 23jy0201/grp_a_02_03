package model;

public class Part_albite_shiftModel {
	public Part_albite_shiftModel(String employee_id, String shift_id) {
		super();
		this.employee_id = employee_id;
		this.shift_id = shift_id;
	}
	public String employee_id;
	public String shift_id;
	
	public String getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}
	public String getShift_id() {
		return shift_id;
	}
	public void setShift_id(String shift_id) {
		this.shift_id = shift_id;
	}
	
	
	
	
}
