package model;

public class Shift_desired_templateModel {
	public Shift_desired_templateModel(String employee_id, String weekday, int start_time, int end_time) {
		super();
		this.employee_id = employee_id;
		this.weekday = weekday;
		this.start_time = start_time;
		this.end_time = end_time;
	}
	public String employee_id;
	public String weekday;
	public int start_time;
	public int end_time;
	
	public String getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}
	public String getWeekday() {
		return weekday;
	}
	public void setWeekday(String weekday) {
		this.weekday = weekday;
	}
	public int getStart_time() {
		return start_time;
	}
	public void setStart_time(int start_time) {
		this.start_time = start_time;
	}
	public int getEnd_time() {
		return end_time;
	}
	public void setEnd_time(int end_time) {
		this.end_time = end_time;
	}
	
}
