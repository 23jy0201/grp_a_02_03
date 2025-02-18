package model;

public class Shift_replacement_requestModel {
	public Shift_replacement_requestModel(String shift_id, String employee_id_1, boolean fixed_flag,
			String employee_id_2) {
		super();
		this.shift_id = shift_id;
		this.employee_id_1 = employee_id_1;
		this.fixed_flag = fixed_flag;
		this.employee_id_2 = employee_id_2;
	}
	public String shift_id;
	public String employee_id_1;
	public boolean fixed_flag;
	public String employee_id_2;
	
	public String getShift_id() {
		return shift_id;
	}
	public void setShift_id(String shift_id) {
		this.shift_id = shift_id;
	}
	public String getEmployee_id_1() {
		return employee_id_1;
	}
	public void setEmployee_id_1(String employee_id_1) {
		this.employee_id_1 = employee_id_1;
	}
	public boolean isFixed_flag() {
		return fixed_flag;
	}
	public void setFixed_flag(boolean fixed_flag) {
		this.fixed_flag = fixed_flag;
	}
	public String getEmployee_id_2() {
		return employee_id_2;
	}
	public void setEmployee_id_2(String employee_id_2) {
		this.employee_id_2 = employee_id_2;
	}
	
	
}
