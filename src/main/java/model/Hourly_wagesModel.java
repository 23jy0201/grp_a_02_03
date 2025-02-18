package model;

public class Hourly_wagesModel {
	public Hourly_wagesModel(String employee_id, String hourly_wage_start_date, int hourly_wage,
			String hourly_wage_end_date) {
		super();
		this.employee_id = employee_id;
		this.hourly_wage_start_date = hourly_wage_start_date;
		this.hourly_wage = hourly_wage;
		this.hourly_wage_end_date = hourly_wage_end_date;
	}
	public String employee_id;
	public String hourly_wage_start_date;
	public int hourly_wage;
	public String hourly_wage_end_date;
	
	
	public String getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}
	public String getHourly_wage_start_date() {
		return hourly_wage_start_date;
	}
	public void setHourly_wage_start_date(String hourly_wage_start_date) {
		this.hourly_wage_start_date = hourly_wage_start_date;
	}
	public int getHourly_wage() {
		return hourly_wage;
	}
	public void setHourly_wage(int hourly_wage) {
		this.hourly_wage = hourly_wage;
	}
	public String getHourly_wage_end_date() {
		return hourly_wage_end_date;
	}
	public void setHourly_wage_end_date(String hourly_wage_end_date) {
		this.hourly_wage_end_date = hourly_wage_end_date;
	}
	
	
}
