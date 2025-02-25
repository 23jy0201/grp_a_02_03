package model;

import java.sql.Time;

public class Shift_desired_templateModel {
	public Shift_desired_templateModel(String employee_id, String weekday, Time start_time, Time end_time) {
		super();
		this.employee_id = employee_id;
		this.weekday = weekday;
		this.start_time = start_time;
		this.end_time = end_time;
	}
	public Shift_desired_templateModel(String weekday, Time startTime, Time endTime) {
		 this.weekday = weekday;
	     this.start_time = startTime;
	     this.end_time = endTime;
	}
	public String employee_id;
	public String weekday;
	public Time start_time;
	public Time end_time;
	
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
	public Time getStart_time() {
		return start_time;
	}
	public void setStart_time(Time start_time) {
		this.start_time = start_time;
	}
	public Time getEnd_time() {
		return end_time;
	}
	public void setEnd_time(Time end_time) {
		this.end_time = end_time;
	}
	
}
