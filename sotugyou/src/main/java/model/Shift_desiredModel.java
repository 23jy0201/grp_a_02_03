package model;

public class Shift_desiredModel {
	public Shift_desiredModel(String employee_id, String attendance_date, int attendance_time) {
		super();
		this.employee_id = employee_id;
		this.attendance_date = attendance_date;
		this.attendance_time = attendance_time;
	}
	public String employee_id;
	public String attendance_date;
	public int attendance_time;
	
	public String getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}
	public String getAttendance_date() {
		return attendance_date;
	}
	public void setAttendance_date(String attendance_date) {
		this.attendance_date = attendance_date;
	}
	public int getAttendance_time() {
		return attendance_time;
	}
	public void setAttendance_time(int attendance_time) {
		this.attendance_time = attendance_time;
	}
	
	
}
